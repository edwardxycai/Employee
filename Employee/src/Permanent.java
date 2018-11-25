
public class Permanent extends Employee {
	private double salary;
	
	Permanent(int empno, String name, double salary) {
		super(empno, name);
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		System.out.println("Salary = " + salary);
	}
	
	public double paySalary() {
		return salary;
	}
}
