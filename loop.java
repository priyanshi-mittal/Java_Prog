//Q print all elements of array which input by command line argument wuth using 
//for loop along with length variable

class loop
{
	public static void main(String args[])
	{
		int size = args.length;
		System.out.println("No of elements in array : "+size);
		for(int i=0; i<size; i++)
		{	
			System.out.println(args[i]);
		}
	}
} 