package week3.day1;

public class Desktop1 extends Computer {

	public void desktopSize()
	{
		System.out.println("This is desktop size method in desktop class");
		
	}
	
	
	public static void main(String args[])
	{
		
		Desktop1 myDesktop = new Desktop1();
		Computer myComputer = new Computer();
		
		myComputer.computerModel();
		
		myDesktop.computerModel();
		myDesktop.desktopSize();
		
		
		
	}
	
}
