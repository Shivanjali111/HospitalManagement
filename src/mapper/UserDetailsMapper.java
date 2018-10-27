package mapper;
import tables.UserDetails;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDetailsMapper implements RowMapper<UserDetails> {

	@Override
	public UserDetails mapRow(ResultSet rs, int arg1) throws SQLException {
		UserDetails userDetails = new UserDetails();
		
		userDetails.setDate_of_creation(rs.getDate("date_of_creation"));
		userDetails.setDate_of_modification(rs.getDate("date_of_modification"));
		userDetails.setIs_active(rs.getInt("is_active"));
		userDetails.setPassword(rs.getString("password"));
		userDetails.setUserId(rs.getString("userId"));
		userDetails.setUsername(rs.getString("username"));
		
	     return userDetails;
	      
	      
	}

	
}
