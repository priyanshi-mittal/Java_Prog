class thread1
{
	 void func()
	{
		System.out.println("func working");
	}
}
class thread2 extends thread1 implements Runnable
{
	public void run()
	{
		try
		{
			for(int j= 60; j<=100; j=j+2)
			{
				System.out.println(j+"........priyanshi");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		thread2 th2 = new thread2();
		Thread th1 = new Thread();
		th1.start();
	}
}



