package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=(Employee) applicationContext.getBean("employee");
		System.out.println(employee);
	}
}
