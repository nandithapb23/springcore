package springcore;

public class Teacher {

	private String subject;
	private double salary;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", salary=" + salary + "]";
	}
	
	
}
