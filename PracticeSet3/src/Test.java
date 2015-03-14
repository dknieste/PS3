public class Test extends Account {

	public static void main (String[] args){
		
		//New account, assign ID and balance
		Account test = new Account(1122, 20000);
		
		//Set interest rate
		test.setAnnualInterestRate(0.045);
		
		//Withdraw $2500 in a try-catch block
		try {
			test.withdraw(2500);
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient funds. You are short " + e.getAmount() + " dollars.");
		}
		
		//Deposit $3000
		test.deposit(3000);
		
		//Print information
		System.out.println("Your current balance is: " + test.getBalance());
		System.out.println("Your monthly interest rate is: " + test.getMonthyInterestRate());
		System.out.println("Your account was created on " + test.getDateCreated());
		
	}

}
