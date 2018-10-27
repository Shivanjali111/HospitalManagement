package template;

import java.util.List;
import tables.Doctors;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import mapper.DoctorsMapper;


public class DoctorsTemplate {
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
		public void setDataSource(DataSource dataSource) {
		    this.dataSource = dataSource;
		    this.jdbcTemplateObject = new JdbcTemplate(dataSource);    
		}
	public List<Doctors> listDoctors() {
	      String SQL = "select * from tbl_doctors";
	      List <Doctors> doctors = jdbcTemplateObject.query(SQL, new DoctorsMapper());
	      return doctors;
	   }
}
