class setdemo
{
	void func()
	{
		Set st = new HashSet();
		
		st.add("Coke");
		st.add("Perk");
		st.add(1000);
		st.add(8.0);
	
		if(st.isEmpty())
		{
			System.out.println("blank");
		}
		else
		{
			System.out.println(st);
			System.out.println("No of items : "+st.size());	
		}
	
	}
	public static void main(String args[])
	{
		setdemo obj = new setdemo();
		obj.func();
	}
}