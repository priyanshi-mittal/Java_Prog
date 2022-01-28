class stexample
{
	static void func()
	{
		System.out.println("sample program");
	}
	public static void main(String args[])
	{
		stexample.func();
		stexample obj= new stexample();
		obj.func();
	}
}

// static = function calls from the class_name or an object
// non-static = function calls from an object
