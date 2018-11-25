
public class CheckingAccount extends Account {
	private int checkCount;
	
	CheckingAccount(String accountNo, double balance, int checkCount) {
		super(accountNo, balance);
		this.checkCount = checkCount;
	}
	
	public void printAccData() {
		super.printAccData();
		System.out.println("Check Count = " + checkCount);
	}
}
