package week3.day1;

public class Students {

	public void getStudentInfo(int ID)

	{

		System.out.println("The student ID is: "+ ID);

	}
	public void getStudentInfo(int ID, String Name)

	{

		System.out.println("The Student ID and Name is: "+ ID +"," + Name);

	}
	public void getStudentInfo(String email, int phno)
	
	{
		System.out.println("The student email is: " + email);
		System.out.println("The student phno is:" + phno);
		
	}

	public static void main(String[] args) {
		
		
		Students myStudent = new Students();
		
		myStudent.getStudentInfo(25);
		myStudent.getStudentInfo(25, "Priya");
		myStudent.getStudentInfo("priya@gmail.com", 043707);


	}

}
