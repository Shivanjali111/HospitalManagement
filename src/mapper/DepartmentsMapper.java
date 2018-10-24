package mapper;
import java.sql.Date;

public class DepartmentsMapper {

	private String department_id;
	private String department_name;
	private String department_head_id;
	private String branch_id;
	private String hospital_id;
	private String parent_department_id;
	private Date date_of_creation;
	private String created_by;
	
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDepartment_head_id() {
		return department_head_id;
	}
	public void setDepartment_head_id(String department_head_id) {
		this.department_head_id = department_head_id;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(String hospital_id) {
		this.hospital_id = hospital_id;
	}
	public String getParent_department_id() {
		return parent_department_id;
	}
	public void setParent_department_id(String parent_department_id) {
		this.parent_department_id = parent_department_id;
	}
	public Date getDate_of_creation() {
		return date_of_creation;
	}
	public void setDate_of_creation(Date date_of_creation) {
		this.date_of_creation = date_of_creation;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getDate_of_modification() {
		return date_of_modification;
	}
	public void setDate_of_modification(Date date_of_modification) {
		this.date_of_modification = date_of_modification;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	private Date date_of_modification;
	private String modified_by;
	private int is_active;
}
