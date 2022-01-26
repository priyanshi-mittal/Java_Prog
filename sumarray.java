//Q sum of all elements in array

class loop
{
	public static void main(String args[])
	{
		int sum =0;
		int size = args.length;
		System.out.println("No of elements in array : "+size);
		int i = 0;
			while(i<size)
			{
				int var1 = Integer.parseInt(args[i]);
				System.out.println(args[i]);
				sum += var1;
				i++;
			}
				System.out.println("The sum is : "+sum);
	}
}