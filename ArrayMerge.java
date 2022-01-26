import java.util.Scanner;
public class ArrayMerge 
{
    ArrayMerge()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        int br[] = new int[5];
        int cr[] = new int[10];
        System.out.println("Enter elements in first array");
        for(int i= 0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter elements in second array");
        for(int i=0; i<br.length; i++)
        {
            br[i] =sc.nextInt();
        }
        
        //process//merge
        System.out.println("---------merged array--------");
        for(int i=0; i<10; i++)
        {
            if(i<5)
            {
                cr[i] = ar[i];
            }
            else
            {
                cr[i] = br[i-5];
            }
            System.out.println("index--"+i+" "+cr[i]);
        }
    }
    public static void main(String args[])
    {
        ArrayMerge obj = new ArrayMerge();
    }
    
}
