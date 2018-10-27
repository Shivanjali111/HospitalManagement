package mapper;
import tables.Branches;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class BranchesMapper implements RowMapper<Branches> {

	@Override
	public Branches mapRow(ResultSet rs, int arg1) throws SQLException {
		Branches branch = new Branches();
		
		branch.setBranch_id(rs.getString("branch_id"));
		branch.setBranch_name(rs.getString("branch_name"));
		branch.setCity(rs.getString("city"));
		branch.setContact(rs.getInt("contact"));
		branch.setCountry(rs.getString("country"));
		branch.setCreated_by(rs.getString("created_by"));
		branch.setDate_of_creation(rs.getDate("date_of_creation"));
		branch.setDate_of_modification(rs.getDate("date_of_modification"));
		branch.setHospital_id(rs.getString("hospital_id"));
		branch.setIs_active(rs.getInt("is_active"));
		branch.setMail(rs.getString("is_active"));
		branch.setModified_by(rs.getString("modified_by"));
		branch.setPin_code(rs.getInt("pin_code"));
		branch.setState(rs.getString("state"));
				
	    return branch;
	      
	      
	}

	
}
