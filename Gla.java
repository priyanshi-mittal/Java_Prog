//Non-parametrised constructor
//parametrised constructor
/*class GLA
{
	GLA()
	{
		System.out.println("NON Para con....");
	}
	GLA(int a)
	{
		System.out.println("para con...");
	}
	public static void main(String args[])
	{
		GLA obj1 = new GLA();
		GLA obj2 = new GLA(24);
	}
}*/
//Constructor inheri...(const. Chaining)
class Amity
{
	Amity()
	{
		System.out.println("Amity...non para cons.... base");
	}
}
class GLA extends Amity
{
	GLA()
	{
		System.out.println("GLA....non para cons...derieved");
	}
	public static void main(String args[])
	{
		GLA obj = new GLA();
	}
}
