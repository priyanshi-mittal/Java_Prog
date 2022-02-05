import java.util.*;

class listdemo3
{

	void func3()
	{
		List lst = new ArrayList();	

		lst.add("Coke");
		lst.add("DairyMilk");
		lst.add("700");
		lst.add("9.8");
		lst.add("Coke");

		System.out.println(lst);
		System.out.println("No of List :"+lst.size());
			
		System.out.println("\n\n............................\n\n");

		System.out.println(lst.get(1)); //find
		
		//lst.set(1, "KitKAt"); // replace at particular index
		
		//lst.add(1,"Frooti"); //insert at particular index 
		
		//lst.remove(1); // delete particular
		
		//lst.clear(); // delete all

		System.out.println(lst);
		System.out.println("No of List :"+lst.size());
	}
	public static void main(String args[])
	{
		listdemo3 obj = new listdemo3();
		obj.func3();
	}
}