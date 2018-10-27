package mapper;
import tables.Doctors;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorsMapper implements RowMapper<Doctors> {

	@Override
	public Doctors mapRow(ResultSet rs, int arg1) throws SQLException {
		Doctors doctor = new Doctors();
		
		doctor.setBranch_id(rs.getString("branch_id"));
		doctor.setContact(rs.getLong("contact"));
		doctor.setCreated_by(rs.getString("created_by"));
		doctor.setDate_of_creation(rs.getDate("date_of_creation"));
		doctor.setDate_of_modification(rs.getDate("date_of_modification"));
		doctor.setDegree(rs.getString("degree"));
		doctor.setDob(rs.getDate("dob"));
		doctor.setDoctor_id(rs.getString("doctor_id"));
		doctor.setFirst_name(rs.getString("first_name"));
		doctor.setGender(rs.getString("gender"));
		doctor.setHospital_id(rs.getString("hospital_id"));
		doctor.setIs_active(rs.getInt("is_active"));
		doctor.setLast_name(rs.getString("last_name"));
		doctor.setLicense_number(rs.getString("license_number"));
		doctor.setMail(rs.getString("mail"));
		doctor.setModified_by(rs.getString("mail"));
		
	      return doctor;
	      
	      
	}

	
}
