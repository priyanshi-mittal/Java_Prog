import java.util.Scanner;
public class ArrayPosNeg 
{
    ArrayPosNeg()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        System.out.println("Enter elements in array");
        for(int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        } 
        int pos =0;
        int neg =0;
        int i =0;
        while(i<ar.length)
        {
         if(ar[i]>0)
         {
             pos++;
         }
         else
         {
             neg++;
         }
         //System.out.println(ar[i]);
         i++;
        }
        System.out.println("positive number :"+pos);
        System.out.println("negative number :"+neg);
    }
    public static void main(String[] args){
        ArrayPosNeg obj = new ArrayPosNeg();
        
    }
}