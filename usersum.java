//Q sum of two values which is input by user

import java.util.Scanner;
class userinput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter I value ");
		int var1 = sc.nextInt();

		System.out.println("Enter II value ");
		int var2 = sc.nextInt();

		int res = var1+var2;
		System.out.println("sum : "+res);
	}
}