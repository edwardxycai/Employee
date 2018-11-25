
public class Temporary extends Employee {
	private double hourPay;
	private double workHour;
	
	Temporary(int empno, String name, double hourPay, double workHour) {
		super(empno, name);
		this.hourPay = hourPay;
		this.workHour = workHour;
	}
	
	public double paySalary() {
		return (hourPay * workHour);
	}
}
