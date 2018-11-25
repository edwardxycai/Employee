
public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		e[0] = new Permanent(111, "Tom", 40000);
		e[1] = new Temporary(222, "John", 120, 60);
		e[2] = new Sales(333, "Mary", 20000, 15000);
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].paySalary());
		}
	}
}
