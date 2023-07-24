import java.awt.Image;

import javax.swing.ImageIcon;

public class BankTest {
	public static void main(String[] args) {
	
		
		BankApplicationForm bankAppForm1 = new BankApplicationForm();
		BankApplicationForm bankAppForm2 = new BankApplicationForm();
		BankApplicationForm bankAppForm3 = new BankApplicationForm();

		bankAppForm1.setApplicantName("Jack Dsouza");
		bankAppForm1.setAdhaarCard("123412341234");
		bankAppForm1.setPanCard("POPJD1234D");
		bankAppForm1.setEmailAddress("jack@gmail.com");
		bankAppForm1.setMobileNumber("9820443464");
		bankAppForm1.setAdress("C709, West Avenue, Mumbai 16");
		bankAppForm1.setAccountType("Savings");
		
		bankAppForm2.setApplicantName("Sushil Kulkarni");
		bankAppForm2.setAdhaarCard("432143211234");
		bankAppForm2.setPanCard("SUSD4454D");
		bankAppForm2.setEmailAddress("sushil@gmail.com");
		bankAppForm2.setMobileNumber("8890443464");
		bankAppForm2.setAdress("D509, East Avenue, Pune 16");
		bankAppForm2.setAccountType("Current");
		
		bankAppForm3.setApplicantName("Ratan Rajkudali");
		bankAppForm3.setAdhaarCard("999988887777");
		bankAppForm3.setPanCard("ROPTR434E");
		bankAppForm3.setEmailAddress("ratan@gmail.com");
		bankAppForm3.setMobileNumber("7799443464");
		bankAppForm3.setAdress("E59, South Avenue, Bengaluru 26");
		bankAppForm3.setAccountType("fixed");
		
	
		bankAppForm1.printApplicationForm();
		bankAppForm2.printApplicationForm();

		bankAppForm3.printApplicationForm();

		
		System.out.println("=============================");
		
		Bank bank = new Bank();
		BankAccount bankAcc1 = bank.applyForABankAccount(bankAppForm1); //passing object here 
		BankAccount bankAcc2 = bank.applyForABankAccount(bankAppForm2); //passing object here 
		BankAccount bankAcc3 = bank.applyForABankAccount(bankAppForm3); //passing object here 

		bankAcc1.bankAccountDetails();	
		bankAcc2.bankAccountDetails();	
		bankAcc3.bankAccountDetails();	
		
	}
	
}

class Form {
	
}

class BankApplicationForm extends Form {
	
	private String applicantName;
	private String adress;
	private String adhaarCard;
	private String panCard;
	private String mobileNumber;
	private String emailAddress;
	private String accountType;
	
	
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAdhaarCard() {
		return adhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	void printApplicationForm() {
		System.out.println("-------Bank Application Form-------");
		System.out.println("Bank Applicant Name : "+applicantName);
		System.out.println("Bank Account Type   : "+accountType);
		System.out.println("Applicant Address   : "+adress);
		System.out.println("Applicant's Adhaar  : "+adhaarCard);
		System.out.println("Applicant's PAN     : "+panCard);
		System.out.println("Applicant's Email   : "+emailAddress);
		System.out.println("Applicant's Mobile  : "+mobileNumber);		
	}
	
}

class BankAccount
{
	private long accountNumber;
	private String accountHolder;
	private long accountBalance;
	private String accountType;
	private String ifscCode;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	void bankAccountDetails() {
		System.out.println("-------Bank Account Details -------");
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Type        : "+accountType);
		System.out.println("Account Holder      : "+accountHolder);
		System.out.println("Bank Account IFSC   : "+ifscCode);
		System.out.println("Account Balance     : "+accountBalance);
		
	}
	
}

class Bank
{
	
	//returning Object						passing object [ usesA ]
	BankAccount applyForABankAccount(BankApplicationForm bankAppFormRef ) {
		System.out.println("Recieved the application from  : "+bankAppFormRef.getApplicantName());
		System.out.println("Creating bank Account ");
		BankAccount bankAccObj = new BankAccount(); // a blank object
		
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAccObj.setAccountNumber(accNum);//real time, connect to the DB, and find out the last account number generated, and one 
		bankAccObj.setAccountHolder(bankAppFormRef.getApplicantName());
		bankAccObj.setAccountType(bankAppFormRef.getAccountType());
		bankAccObj.setIfscCode("BOB000000015");
		bankAccObj.setAccountBalance(3000);
		
		return bankAccObj;
	}
}



