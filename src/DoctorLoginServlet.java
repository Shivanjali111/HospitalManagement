

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tables.Patients;

/**
 * Servlet implementation class DoctorLoginServlet
 */
@WebServlet("/DoctorLoginServlet")
public class DoctorLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Patients> patientList=new ArrayList<Patients>();
		final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost/Hospital";
		final String DB_USER="root";
		final String DB_PASSWD="root123";
		Connection connection = null;
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			java.sql.Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from tbl_patient");
			while(rs.next()){
				Patients patient = new Patients();
				
				patient.setBranch_id(rs.getString("branch_id"));
				patient.setContact(9850);
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
				patientList.add(patient);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpSession session=request.getSession(false);
		session.setAttribute("patientList", patientList);
		//response.sendRedirect("/index.jsp");
		
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/DoctorLogin2.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
