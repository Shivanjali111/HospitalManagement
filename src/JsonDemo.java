import java.util.List;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonDemo {
	public static void main(String args[]){
		 String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		 String DB_URL="jdbc:mysql://localhost/Hospital";
		 String DB_USER="root";
		 String DB_PASSWD="root123";
		Connection connection = null;
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			java.sql.Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from tbl_doctors");
			
			List<Demo> demoList = new ArrayList<>();
			
			while (rs.next())
			{
				
			    String  id_json=rs.getString("doctor_id");
			    String name_json=rs.getString("first_name")+" "+rs.getString("last_name");

			    
			    Demo demo=new Demo();
			    demo.setId(id_json);
			    demo.setName(name_json);
			    demoList.add(demo);
			}
			
//			for(int i=0;i<jArray.length();i++){
//	            JSONObject json_data = jArray.getJSONObject(i);
//	            System.out.println(json_data.getString("id"));
//	            System.out.println(json_data.getString("name"));
//	          }
			
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
			objectMapper.writeValue(new File("output.json"), demoList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
