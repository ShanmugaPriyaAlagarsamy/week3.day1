package week3.day1;

public class AxisBank extends BankInfo {
	
public void recurringDeposit()
	
	{
		System.out.println("This is recurring deposit account method in Axis bank class");
		
	}

public static void main(String args[])
{
	
       AxisBank myBank = new AxisBank();

       myBank.savings();
       myBank.fixedDeposit();
       myBank.recurringDeposit();
}

}
