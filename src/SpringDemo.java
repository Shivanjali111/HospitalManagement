import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tables.Doctors;
import template.DoctorsTemplate;

public class SpringDemo {
	
	public List<Doctors> getList(){
ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
		
		DoctorsTemplate doctorsTemplate = 
		         (DoctorsTemplate)context1.getBean("doctorsTemplate");
		
		List<Doctors> doctors=doctorsTemplate.listDoctors();
		return doctors;
		
	}
	
	public static void main(String args[]){
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
		
		DoctorsTemplate doctorsTemplate = 
		         (DoctorsTemplate)context1.getBean("doctorsTemplate");
		
		List<Doctors> doctors=doctorsTemplate.listDoctors();
		for(int i=0;i<doctors.size();i++){
			System.out.println(doctors.get(i).getFirst_name());
		}
	}
}
