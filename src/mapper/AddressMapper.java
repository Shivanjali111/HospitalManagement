package mapper;
import tables.Address;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressMapper implements RowMapper<Address> {

	@Override
	public Address mapRow(ResultSet rs, int arg1) throws SQLException {
		Address address = new Address();
		
		address.setAddress_line1(rs.getString("address_line1"));
		address.setAddress_line2(rs.getString("address_line2"));
		address.setAddress_type(rs.getString("address_type"));
		address.setCity(rs.getString("city"));
		address.setCountry(rs.getString("country"));
		address.setCreated_by(rs.getString("created_by"));
		address.setDate_of_creation(rs.getDate("date_of_creation"));
		address.setDate_of_modification(rs.getDate("date_of_modification"));
		address.setIs_active(rs.getInt("is_active"));
		address.setModified_by(rs.getString("modified_by"));
		address.setPin_code(rs.getInt("pin_code"));
		address.setState(rs.getString("state"));
		address.setUserId(rs.getString("userId"));
		
	    return address;
	      
	      
	}

	
}
