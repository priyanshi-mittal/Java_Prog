import java.util.*;

class listdemo
{
	void func()
	{
		List lst = new ArrayList();	
		lst.add("Coke");
		lst.add("DairyMilk");
		lst.add("700");
		lst.add("9.8");
		lst.add("Coke");

		System.out.println(lst);
		System.out.println("No of List :"+lst.size());
	}
	public static void main(String args[])
	{
		listdemo obj = new listdemo();
		obj.func();
	}
}