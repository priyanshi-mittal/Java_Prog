// function over loading ,fun. over riding "
class SunMicroSystem
{
	void JAVA()
	{
		System.out.println("JAVA program...");
	}
	//overridden
	final void Clng()
	{
		System.out.println("Cprogram by sun micro......base");
	}
}
class Oracle2 extends SunMicroSystem
{
	//override
	void Clng()
	{
		System.out.println("c program by oracle....derived");
	}
	void DBMS()
	{
		System.out.println("sql......");
	}
	public static void main(String args[])
	{
		Oracle2 obj = new Oracle2();
		obj.Clng();
	}
}
//final keyword generate error and can't be override program


