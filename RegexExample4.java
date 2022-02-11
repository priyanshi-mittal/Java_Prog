import java.util.regex.*;

public class RegexExample4 
{
    public static void main(String args[])
    {
        System.out.println("? quantifier....");
        
        System.out.println(Pattern.matches("[amn]?","a")); //true(a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","aaa")); //false(a comes more than one time)
        System.out.println(Pattern.matches("[amn]?","aammmm")); //false(a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?","aaazzzta")); //false(a comes more than one time)
        System.out.println(Pattern.matches("[amn]?","am"));       //false(a or m or n must come one time)
        
        System.out.println("+ quantifier....");
        
        System.out.println(Pattern.matches("[amn]+","a"));  //true(a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+","aaa")); //true(a comes more than one time)
        System.out.println(Pattern.matches("[amn]+","aammmm")); //true(a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+","aazzta")); //false(z and t are not matching pattern)
        
        System.out.println("* quantifier....");
        System.out.println(Pattern.matches("[amn]+","ammammaa"));//true(a or m or n may come zero or more times)
        
    }
    
}