
public class CheckingAccount extends BankAccount {
	// static constant FEE that represents the cost of clearing one check. 
	private final double FEE = 0.15;
	
	// constructor that takes a name and an initial amount as parameters. 
	public CheckingAccount (String name, double amount){
		
		//call the constructor for the superclass
		super(name,amount);
		
		//initialize accountNumber to 
		//be the current value in accountNumber concatenated with –10 
		setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	//overrides the withdraw method in the superclass.
	public boolean withdraw(double amount) {
		amount += FEE;
		return super.withdraw(amount);
	}

}
