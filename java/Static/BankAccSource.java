import java.util.Scanner; 
class BankAccount{
	int accountNumber;
	String accHolderName;
	double currentBalance;
	static double interestRate;

	static{
		interestRate = 0;
	}

	BankAccount() {
        	this.accountNumber = 0;
        	this.accHolderName = "Not Assigned";
        	this.currentBalance = 0.0;
        	//static this.interestRate = 0.0;
    	}

    	// Parameterized constructor
    	BankAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate) {
        	this.accountNumber = accountNumber;
        	this.accHolderName = accHolderName;
        	this.currentBalance = currentBalance;
        	//this.interestRate = interestRate;
    	}

 
    	int getAccountNumber() {
        	return this.accountNumber;
    	}

    	String getAccHolderName() {
        	return this.accHolderName;
    	}

  	double getCurrentBalance() {
        	return this.currentBalance;
    	}

    	double getInterestRate() {
        	return this.interestRate;
    	}


    	void setAccountNumber(int accountNumber) {
    	    this.accountNumber = accountNumber;
    	}

    	void setAccHolderName(String accHolderName) {
        	this.accHolderName = accHolderName;
    	}

    	void setCurrentBalance(double currentBalance) {
        	this.currentBalance = currentBalance;
    	}

    	void setInterestRate(double interestRate) {
        	this.interestRate = interestRate;
    	}

    	void display() {
        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Account Holder Name: " + accHolderName);
        	System.out.println("Current Balance: " + currentBalance);
        	System.out.println("Interest Rate: " + interestRate + "%");
    	}
}
class Test{
	public static void main(String[] args){

       	 	BankAccount b1 = new BankAccount(112, "Krutika", 76554, 11);
		b1.display();
		
		BankAccount b2 = new BankAccount(3024, "Vaishnavi", 2000, 877);
		b2.display();

		BankAccount b3 = new BankAccount(30244, "Vijeta", 2400, 10000);
		b3.display();

		BankAccount.setInterestRate(10);
		b1.display();
		b2.display();
		b3.display();
	}
} 