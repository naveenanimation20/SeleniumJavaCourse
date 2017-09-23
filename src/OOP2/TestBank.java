package OOP2;

public class TestBank {

	public static void main(String[] args) {

		
		ICICIBank ic = new ICICIBank();
		ic.credit();
		ic.debit();
		ic.transferMoney();
		ic.educationLoan();
		ic.mutualFunds();
		ic.loan();
		

		USBank us = new ICICIBank();//child class object can be referred by parent interface ref variable
		
		
		
		
	}

}
