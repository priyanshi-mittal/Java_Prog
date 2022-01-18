import java.util.Scanner;
public class ArrayInput 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        System.out.println("Enter elements in array");
        for(int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.println("--------array elements---------");
        for(int i=0; i<ar.length; i++ )
        {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args){
        ArrayInput obj = new ArrayInput();
        obj.func();
    }
}
