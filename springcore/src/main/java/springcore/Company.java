package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//to tell ioc container to create object for this particular class 
public class Company {

	@Value("gagan")
	private String name;
	@Value("info123")
	private String gst;
	
	@Autowired//to tell ioc conatiner that we are building relationship btwn company and employee
	private Employee1 employee1;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public Employee1 getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}

	
	
}
