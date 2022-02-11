import java.util.regex.*;

public class RegexExample7 
{
    public static void main(String args[])
    {
        System.out.println("by character classes and quantifier....");
        
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9786456334")); //true
        System.out.println(Pattern.matches("[789][0-9]{9}", "8786798694"));    //true
        
        System.out.println(Pattern.matches("[789][0-9]{9}", "97869898974"));   //false(11 characters)
        System.out.println(Pattern.matches("[789][0-9]{9}", "6334876754"));    //false(starts with 6)
        
        System.out.println(Pattern.matches("[789][0-9]{9}", "8645876094"));    //true
        
        System.out.println("by metacharacters.........");
        
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8645687367"));    //true
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3786656334"));    //false(starts with 3)
    }
}