package week3.day1;

public class Smartphone extends AndroidPhone {
	public void connectwhatsApp()
	{
		System.out.println("Whatsapp is installed!!");
			}
	public void takeVideo()
	{
		System.out.println("Video is recorded and Saved from Smartphone!!");
		
	}
	
	public static void main(String args[])
	{
		Smartphone functions = new Smartphone();
		
		functions.sendMessage();
		functions.makeCall();
		functions.saveContact();
		functions.takeVideo();
		functions.connectwhatsApp();
				
		
	}
	
}
