package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("student.xml");
		Teacher teacher=(Teacher) applicationContext.getBean("teacher");
		Student student=(Student) applicationContext.getBean("student");
		System.out.println(student.getTeacher());
		System.out.println(student.getName());
		System.out.println(student.getFees());
	}
}
