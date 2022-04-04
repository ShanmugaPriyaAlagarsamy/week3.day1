package week3.day1;

public class Calculator {
	
	public int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public int add(int a, int b, int c)
	{
		int sum = a+b+c;
		return sum;
			}
	public double mul(int a, double b)
	{
		double mul = a*b;
		return mul;
	}
	
	public double mul(double a, double b)
	
	{
		double mul = a*b;
		return mul;
	}
	
	public int sub(int a, int b)
	{
	int sub = a-b;
	return sub;
	}
	
	public double sub(double a, double b)
	{
		double sub  = a-b;
		return sub;
		
	}
	
	public int div(int a, int b)
	{
		int div = a/b;
		return div;
		
	}
	
	public double div(double a, double b)
	{
		double div = a/b;
		return div;
	}

	public static void manin(String args[])
	{
		Calculator calc = new Calculator();
		calc.add(20, 10);
		calc.add(30, 20, 10);
		calc.mul(20, 10);
		calc.mul(200, 300);
		calc.sub(30, 20);
		calc.sub(5000, 2000);
		calc.div(50, 10);
		calc.div(12000, 6000);
		
	}
}
