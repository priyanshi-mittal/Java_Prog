// how many no. of elements in numeric array without using "length" variable

class foreachexample
{
	public static void main(String args[])
	{
		int ar[] = {10, 20 ,30, 40 ,50, 60, 70,};
		int count = 0;
		//foreach loop
		for(int aman : ar)
		{
			System.out.println(aman);
			count++;
		}
		System.out.println("no of elements : "+count);
	}
}
