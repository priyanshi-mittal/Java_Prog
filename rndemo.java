//Predefined interface by using thread class

class ABC
{
	void func()
	{
		System.out.println("fn working");
	}
}
class rndemo extends ABC implements Runnable
{
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
			}
		}
	}
	public static void main(String args[])
	{
		rndemo obj = new rndemo();
		Thread th = new Thread(obj);
		th.start();
	}
}
			