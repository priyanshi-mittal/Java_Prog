class NameException extends Exception
{
	NameException()
	{
		System.out.println("invalid name");
	}
}
class userexp2
{
	void func()
	{
		try
		{
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter ur name");
			String name = sc.next();
			
			if((name.trim()).legnth()!=0)
			{
				System.out.println("Enter your name");
			}
			else
			{
				throw new NameException();
			}
		}
		catch(NameException z)
		{
			System.out.println(z);
		}
		finally
		{
			System.out.println("Thank you");
		}
	}
	public static void main(String args[])
	{
		userexp2 obj = new userexp2();
		obj.func();
	}

}







		 