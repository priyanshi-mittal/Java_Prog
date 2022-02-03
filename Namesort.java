import java.util.Array;
import java.util.Scanner;

class namesort
{
	public static void main(String args[])
	{
		String str;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the string :");
		str = sc.nextline( );
		char charArray[ ] = str.toCharArray( );
		Arrays.sort(charArray);
		
		System.out.println(new String(charArray));
	}
}
		
	
		