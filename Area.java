class calpoly
{
	void area(int a)
	{
		int sqr = a*a;
		System.out.println("Area of square : "+sqr);
	}
	void area(int l, int b)
	{
		int rec = l*b;
		System.out.println("Area of rectangle : "+rec);
	}
	public static void main(String args[])
	{
		calpoly obj = new calpoly();
		obj.area(12);
		obj.area(10,4);
	}
}