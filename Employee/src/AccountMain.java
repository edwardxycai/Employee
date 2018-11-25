
public class AccountMain {
	
	public static void main(String[] args) {
		Account[] acc = new Account[2];
		acc[0] = new Account("127333", 57730.0);
		acc[1] = new CheckingAccount("837444", 18730.0, 20);
		for (int i = 0; i < acc.length; i++) {
			acc[i].printAccData();
		}
	}
	
}
