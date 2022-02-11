import java.util.regex.*;

public class RegexExample5 
{
    public static void main(String args[])
    {
        System.out.println("metacharacters d...."); //d means digit
        System.out.println(Pattern.matches("\\d" , "abc")); //flase(non-didgit)
        System.out.println(Pattern.matches("\\d","5"));     //true(digit and comes once)
        System.out.println(Pattern.matches("\\d","4435"));   //false(digit but comes more than once)
        System.out.println(Pattern.matches("\\d","567anc")); //false(digit and char)
        
        System.out.println("metacharacters D....");         //D means non-digit
        System.out.println(Pattern.matches("\\D","abc"));   //false(non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D","1"));     //false(digit)
        System.out.println(Pattern.matches("\\D","2345"));  //false(digit)
        System.out.println(Pattern.matches("\\D","554abc"));  //false(digit and char)
        System.out.println(Pattern.matches("\\D","m"));       //true(non-digit and comes once)
        
        System.out.println("metacharacters D with quantifier.....");  
        System.out.println(Pattern.matches("\\D*","msh"));  //true(non-digit and may come 0 and more times)
        
    }
}