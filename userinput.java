//how to input by user

import java.util.Scanner;

class userinput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur name ");
		String str1 = sc.next();

		System.out.println("My name is : "+str1);
	}
}