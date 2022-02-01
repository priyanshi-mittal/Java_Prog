//Inheritance
//parents//Super//base
class SunMicroSystem
{
	void Java()
	{
		System.out.println("Java prog....");
	}
}

class Google extends SunMicroSystem
{
	void Android()
	{
		System.out.println("android app develop...");
	}
}
class Microsoft extends Google
{
	void web()
	{
		System.out.println("web develop...");
	}
}

//child // sub// derived
class Oracle extends Microsoft
{
	void DBMS()
	{
		System.out.println("sql....");
	}
	public static void main(String args[])
	{
		Oracle obj = new Oracle();
		obj.DBMS();
		obj.Java();
		obj.Android();
		obj.Microsoft();
	}
}
/* Java does not support multiple inher.. there for java provide a 
face interface for implementing multilple inheritance.*/
