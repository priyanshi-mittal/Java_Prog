class first
{
	void func1()
	{
		System.out.println("first function");
	}
}
class second extends first
{
	void func2()
	{
		System.out.println("second function");
	}
}
class third extends second
{
	void func3()
	{
		System.out.println("third function");
	}
}
class demo extends third
{
	void func()
	{
		System.out.println("GLA University");
	}
	public static void main(String args[])
	{
		demo obj =new demo();
		obj.func();
	}
}