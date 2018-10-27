package mapper;
import tables.Staff;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffMapper implements RowMapper<Staff> {

	@Override
	public Staff mapRow(ResultSet rs, int arg1) throws SQLException {
		Staff staff = new Staff();
		
		staff.setBranch_id(rs.getString("branch_id"));
		staff.setContact(rs.getInt("contact"));
		staff.setCreated_by(rs.getString("created_by"));
		staff.setDate_of_creation(rs.getDate("date_of_creation"));
		staff.setDate_of_modification(rs.getDate("date_of_modification"));
		staff.setDob(rs.getDate("dob"));
		staff.setFirst_name(rs.getString("first_name"));
		staff.setGender(rs.getString("gender"));
		staff.setHospital_id(rs.getString("hospital_id"));
		staff.setIs_active(rs.getInt("is_active"));
		staff.setLast_name(rs.getString("last_name"));
		staff.setMail(rs.getString("mail"));
		staff.setModified_by(rs.getString("modified_by"));
		staff.setPost(rs.getString("post"));
		staff.setStaff_id(rs.getString("staff_id"));
		
	    return staff;
	      
	      
	}

	
}
