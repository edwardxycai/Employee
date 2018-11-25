
public class Sales extends Permanent {
	private double commission;
	
	Sales(int empno, String name, double salary, double commission) {
		super(empno, name, salary);
		this.commission = commission;
	}
	
	public void display() {
		super.display();
		System.out.println("Commission = " + commission);
	}
	
	public double paySalary() {
		return super.paySalary() + commission;
	}
}
