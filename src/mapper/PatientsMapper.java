package mapper;
import tables.Patients;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientsMapper implements RowMapper<Patients> {

	@Override
	public Patients mapRow(ResultSet rs, int arg1) throws SQLException {
		Patients patient = new Patients();
		
		patient.setBranch_id(rs.getString("branch_id"));
		patient.setContact(rs.getInt("contact"));
		patient.setCreated_by(rs.getString("created_by"));
		patient.setDate_of_creation(rs.getDate("date_of_creation"));
		patient.setDate_of_modification(rs.getDate("date_of_modification"));
		patient.setDob(rs.getDate("dob"));
		patient.setFirst_name(rs.getString("first_name"));
		patient.setGender(rs.getString("gender"));
		patient.setHospital_id(rs.getString("gender"));
		patient.setIs_active(rs.getInt("is_active"));
		patient.setLast_name(rs.getString("last_name"));
		patient.setMail(rs.getString("mail"));
		patient.setModified_by(rs.getString("modified_by"));
		patient.setPatient_id(rs.getString("patient_id"));
		
	    return patient;
	      
	      
	}

	
}
