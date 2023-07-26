
public class BankTest {
	public static void main(String[] args) {
		
		SavingsAccount savAccObj1 = new SavingsAccount(101, "Pratik", 50000);
		SavingsAccount savAccObj2 = new SavingsAccount(102, "Maithili", 45000);
		
		System.out.println("savAccObj1 :"+savAccObj1);
		System.out.println("savAccObj2 :"+savAccObj2);
		
		FundTransferService.transferFunds(savAccObj1, savAccObj2, 7000);
		
		System.out.println("savAccObj1 :"+savAccObj1);
		System.out.println("savAccObj2 :"+savAccObj2);
		
	}
}


class FundTransferService //NIKHIL
{
	static void transferFunds(Withdrawing source, Depositing target, float amountToTransfer)
	{
		System.out.println("\nTRANSFERRING FUNDS....");
		source.withdraw(amountToTransfer);
		target.deposit(amountToTransfer);
		System.out.println("FUNDS TRANSFERRED...\n");
		
	}
}

interface Withdrawing {
	void withdraw(float x);
}
interface Depositing {
	void deposit(float x);
}
class SavingsAccount implements Withdrawing, Depositing { //RATAN
	
	int accountNumber;
	String accountHolder;
	float accountBalance;
	
	

	public SavingsAccount(int accountNumber, String accountHolder, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	public void withdraw(float amountToWithdraw) { //MANDATORY
		accountBalance = accountBalance - amountToWithdraw;
	}
	public void deposit(float amountToDeposit) { //MANDATORY
		accountBalance = accountBalance + amountToDeposit;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}

	
}
