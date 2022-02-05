//Q print & sum all elements of numeric array by using foreach loop

class foreachexample
{
	public static void main(String args[])
	{
		int ar[] = {10, 20, 30, 40, 50, 60, 70};
		int sum = 0;
		//foreach loop
		
		for(int var : ar)
		{
			System.out.println(var);
			sum = sum+var;
		}
		System.out.println("Total : "+sum);
	}
}