//Null Pointer Exception

class npexample
{
	void func()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		npexample obj =null;
		//obj = new npexample();
		obj.func();
	}
}