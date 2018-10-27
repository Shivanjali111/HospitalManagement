package mapper;
import tables.Associates;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class AssociatesMapper implements RowMapper<Associates> {

	@Override
	public Associates mapRow(ResultSet rs, int arg1) throws SQLException {
		Associates associate = new Associates();
		
		associate.setAssociate_id(rs.getString("associate_id"));
		associate.setAssociate_name(rs.getString("associate_name"));
		associate.setBranch_id(rs.getString("branch_id"));
		associate.setCity(rs.getString("branch_id"));
		associate.setContact(rs.getInt("contact"));
		associate.setCountry(rs.getString("country"));
		associate.setCreated_by(rs.getString("created_by"));
		associate.setDate_of_creation(rs.getDate("date_of_creation"));
		associate.setDate_of_modification(rs.getDate("date_of_modification"));
		associate.setHospital_id(rs.getString("hospital_id"));
		associate.setIs_active(rs.getInt("is_active"));
		associate.setMail(rs.getString("mail"));
		associate.setModified_by(rs.getString("modified_by"));
		associate.setPin_code(rs.getInt("pin_code"));
		associate.setState(rs.getString("state"));
		
	    return associate;
	      
	      
	}

	
}
