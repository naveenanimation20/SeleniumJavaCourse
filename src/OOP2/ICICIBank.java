package OOP2;

public class ICICIBank implements USBank,UKBank{
	
	
	public void debit(){
		System.out.println("debit--icici");
	}
	
	public void credit(){
		System.out.println("credit--icici");
	}
	
	public void transferMoney(){
		System.out.println("tr money--icici");
	}
	
	
	public void mutualFunds(){
		System.out.println("mutual funds--icici");
	}
	
	public void educationLoan(){
		System.out.println("edu loan --icici");
	}
	
	
	public void loan(){
		System.out.println("loan--icici");
	}
	
	
	
	

}
