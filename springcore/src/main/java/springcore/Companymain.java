package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Companymain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("company.xml");
		Company company=applicationContext.getBean("company",Company.class);
		Employee1 employee1=company.getEmployee1();
		
		System.out.println(company.getGst());
		System.out.println(company.getName());
		System.out.println(employee1.getName());
		System.out.println(employee1.getSalary());
	}
}
