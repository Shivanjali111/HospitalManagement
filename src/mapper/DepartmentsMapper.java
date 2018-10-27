package mapper;
import tables.Departments;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentsMapper implements RowMapper<Departments> {

	@Override
	public Departments mapRow(ResultSet rs, int arg1) throws SQLException {
		Departments department = new Departments();
		
		department.setBranch_id(rs.getString("branch_id"));
		department.setCreated_by(rs.getString("created_by"));
		department.setDate_of_creation(rs.getDate("date_of_creation"));
		department.setDate_of_modification(rs.getDate("date_of_modification"));
		department.setDepartment_head_id(rs.getString("department_head_id"));
		department.setDepartment_id(rs.getString("department_id"));
		department.setDepartment_name(rs.getString("department_name"));
		department.setHospital_id(rs.getString("hospital_id"));
		department.setIs_active(rs.getInt("is_active"));
		department.setModified_by(rs.getString("modified_by"));
		department.setParent_department_id(rs.getString("parent_department_id"));
		
	    return department;
	      
	      
	}

	
}
