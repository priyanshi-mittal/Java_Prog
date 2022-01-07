//EXCEPTION

import java.util.Scanner;

class expdemo
{
	void func1()
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter I value");
			int var1 = sc.nextInt();
	
			System.out.println("Enter II value");
			int var2 = sc.nextInt();
	
			int res = var1/var2;
			System.out.println("Divison "+res);
		}
		catch(Exception e)
		{
			//System.out.println("Problem occur");
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	void func2()
	{
		System.out.println("Second fn is working");
	}
	public static void main(String args[])
	{
		expdemo obj = new expdemo();
		obj.func1();
		obj.func2();
	}
}