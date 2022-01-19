//Threading

class threaddemo extends Thread
{
	public void run()
	{
		try
		{
			for(int i= 1; i<=10; i++)
			{
				System.out.println(i);
				sleep(500);
				if(i==5)
				{
					stop(); //Unnatural death , if want to terminate program in b/w
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		threaddemo obj = new threaddemo();
		obj.start();
	}
}