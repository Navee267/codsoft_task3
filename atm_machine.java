import java.util.Scanner;

class bank_acc extends atm_machine{
	int acc_balance = 10000;
	
}

public class atm_machine {
	
	private static int balance;

	static int withdraw(int balance)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Withdrawn Amount : ");
		int withdraw_amount = scan.nextInt();
		if(withdraw_amount <= balance) {
		balance -= withdraw_amount;
		System.out.println("Your Amount Has Been Withdrawd Successfully.");
		System.out.println("Your Withdrawn Amount Is " + withdraw_amount);
		System.out.println("Your Balance Is " + balance);
		System.out.println("Please Take Your Card And Money");
		}
		else {
			System.out.println("Insufficient Balance");
		}
		return balance;
	}
	
	static int deposit(int balance)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Deposit Amount Amount : ");
		int deposit_amount = scan.nextInt();
		balance += deposit_amount;
		System.out.println("Your Amount Has Been Deposited Successfully");
		System.out.println("Your Deposit Amount Is " + deposit_amount);
		System.out.println("Your Balance Is " + balance);
		return balance;
	}
	
	static void check_balance()
	{
		System.out.println("Your Current Account Balance " + balance);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		bank_acc ob1 = new bank_acc();
		balance = ob1.acc_balance;
		System.out.println("Welcome To Our ATM.");
		System.out.println("Enter Your PIN ");
		int pin = scan.nextInt();
		
		System.out.println("Enter Your Choice: 1->Withdraw  2->Deposit  3->Check_Balance  4->Exit");
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1:
			withdraw(balance);
			System.out.println("ThankYou For Using Our ATM.");
			break;
		case 2:
			deposit(balance);
			System.out.println("ThankYou For Using Our ATM.");
			break;
		case 3:
			check_balance();
			System.out.println("ThankYou For Using Our ATM.");
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Option Please Check Again.");
		}
	}

}
