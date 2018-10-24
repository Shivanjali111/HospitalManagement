package tables;
import java.sql.Date;

public class UserDetails {
	
	private String userId;
	private String username;
	private String password;
	private Date date_of_creation;
	private Date date_of_modification;
	private int is_active;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate_of_creation() {
		return date_of_creation;
	}
	public void setDate_of_creation(Date date_of_creation) {
		this.date_of_creation = date_of_creation;
	}
	public Date getDate_of_modification() {
		return date_of_modification;
	}
	public void setDate_of_modification(Date date_of_modification) {
		this.date_of_modification = date_of_modification;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	
	
}
