
public abstract class Employee {
	private int empno;
	private String name;
	
	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Emp No = " + empno);
		System.out.println("Name = " + name);
	}
	
	public double paySalary() {
		return 0;
	}
}



