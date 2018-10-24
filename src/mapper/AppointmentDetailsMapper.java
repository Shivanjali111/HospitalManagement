package mapper;
import tables.AppointmentDetails;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class AppointmentDetailsMapper implements RowMapper<AppointmentDetails> {

	@Override
	public AppointmentDetails mapRow(ResultSet rs, int arg1) throws SQLException {
		AppointmentDetails appointmentDetails = new AppointmentDetails();
		
		appointmentDetails.setAppointment_id(rs.getString("appointment_id"));
		appointmentDetails.setAppointment_status(rs.getString("appointment_status"));
		appointmentDetails.setCreated_by(rs.getString("appointment_status"));
		appointmentDetails.setDate_of_creation(rs.getDate("date_of_creation"));
		appointmentDetails.setDate_of_modification(rs.getDate("date_of_modification"));
		appointmentDetails.setDoctor_id(rs.getString("doctor_id"));
		appointmentDetails.setEnd_time(rs.getDate("end_time"));
		appointmentDetails.setModified_by(rs.getString("modified_by"));
		appointmentDetails.setPatient_id(rs.getString("patient_id"));
		appointmentDetails.setStart_time(rs.getDate("start_time"));
		
	    return appointmentDetails;
	      
	      
	}

	
}
