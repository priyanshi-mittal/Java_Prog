import java.util.*;

class stackdemo
{
	void func()
	{
		Stack stk = new Stack();

		stk.push("Frooti");
		stk.push("Maggie");
		stk.push(10);
		stk.push(45.8);
		stk.push("Coke");


		System.out.println(stk);
		System.out.println("NO. Of Items :"+stk.size());

		System.out.println("\n\n...................................\n\n");

		//System.out.println("deleted :"+stk.pop()); //delete last element
		System.out.println("last element :"+stk.peek()); //shows last element not delete

		System.out.println(stk);
		System.out.println("NO. Of Items :"+stk.size());
		
	}
	public static void main(String args[])
	{
		stackdemo obj = new stackdemo();
		obj.func();
	}
}