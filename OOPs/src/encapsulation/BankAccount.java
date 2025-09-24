package encapsulation;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails bd=new BankDetails();
		bd.deposit(1000);
		bd.withdraw(500);
		System.out.println(bd.getbalance());
		

	}

}
class BankDetails{
	private double balance;
	public void deposit(int amount) {
		if(amount>0) {
			balance+=amount;
		}
		System.out.println(balance);
	}
	public  void withdraw(int amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			
		}
		System.out.println(balance);
	}
	public double getbalance() {
		return balance;
	}
}

