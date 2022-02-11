import java.util.regex.*;

public class RegexExample6 
{
    public static void main(String args[])
    {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "2haRaD")); //true
        System.out.println(Pattern.matches("[0-9]{10}", "9867564302"));  //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kk768ghrn")); //false(more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "J6b6h7"));    //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "2ayt&g"));    //false(& is not matched)
    }
    
}