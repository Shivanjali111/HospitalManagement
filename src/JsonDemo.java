import java.util.List;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.*;

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
			
			JSONArray jArray = new JSONArray();
			while (rs.next())
			{
				
			    String  id_json=rs.getString("doctor_id");
			    String name_json=rs.getString("first_name")+" "+rs.getString("last_name");
			    JSONObject jObj = new JSONObject();
			    jObj.put("id", id_json);
			    jObj.put("name", name_json);
			    jArray.put(jObj);
			    
			    Demo demo=new Demo();
			    demo.setId(id);
			}
			
//			for(int i=0;i<jArray.length();i++){
//	            JSONObject json_data = jArray.getJSONObject(i);
//	            System.out.println(json_data.getString("id"));
//	            System.out.println(json_data.getString("name"));
//	          }
			
			ObjectMapper mapper = new ObjectMapper();
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(new File("data.json"), jArray);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
