import java.util.Scanner;

class expdemo3
{
	void func1()
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter value");
			
			String var = sc.next();
			System.out.println("String value");
			System.out.println(var);
	
			System.out.println("\n............................\n");
	
			int z = Integer.parseInt(var); //exception can be raise
			
			System.out.println("Numeric value");
			System.out.println(z+"..........try block");
		}
		catch(Exception e)
		{
			System.out.println("problem occur..........catch block");
		}
		finally
		{
			System.out.println("no impact here........finally block");
		}
	}
	void func2()
	{
		System.out.println("Second fn is working");
	}
	public static void main(String args[])
	{
		expdemo3 obj = new expdemo3();
		obj.func1();
		obj.func2();
	}
}