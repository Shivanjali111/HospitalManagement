package mapper;
import tables.Hospital;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalMapper implements RowMapper<Hospital> {

	@Override
	public Hospital mapRow(ResultSet rs, int arg1) throws SQLException {
		Hospital hospital = new Hospital();
		
		hospital.setCity(rs.getString("city"));
		hospital.setContact(rs.getInt("contact"));
		hospital.setCountry(rs.getString("country"));
		hospital.setCreated_by(rs.getString("created_by"));
		hospital.setDate_of_creation(rs.getDate("date_of_creation"));
		hospital.setDate_of_modification(rs.getDate("date_of_modification"));
		hospital.setHospital_address(rs.getString("hospital_address"));
		hospital.setHospital_id(rs.getString("hospital_id"));
		hospital.setHospital_name(rs.getString("hospital_name"));
		hospital.setIs_active(rs.getInt("is_active"));
		hospital.setMail(rs.getString("mail"));
		hospital.setModified_by(rs.getString("modified_by"));
		hospital.setPin_code(rs.getInt("pin_code"));
		hospital.setState(rs.getString("state"));
		
	    return hospital;
	      
	      
	}

	
}
