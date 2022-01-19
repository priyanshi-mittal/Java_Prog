//Creating user defined exception

class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("under 18 problem");
	}
}
class userexp
{
	void func()
	{
		try
		{
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter ur age");
			int age = sc.nextInt();
			
			if(age>=18)
			{
				System.out.println("vote done.........");
			}
			else
			{
				throw new AgeException();
			}
		}
		catch(AgeException z)
		{
			System.out.println(z);
		}
		finally
		{
			System.out.println("next voter'll come");
		}
	}
	public static void main(String args[])
	{
		userexp obj = new userexp();
		obj.func();
	}

}







		 