class Gla
{
	void Btech()
	{
		System.out.println("Btech from CS");
	}
	void Btech(int account)
	{
		System.out.println("Btech from EC");
	}
	void Btech(int a, int b)
	{
		System.out.println("Btech from ME");
	}
	public static void main (String args[])
	{
		Gla amo = new Gla();
		amo.Btech(2000);
		amo.Btech();
		amo.Btech(400,800);
	}
}