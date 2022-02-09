import java.util.regex.*;

public class regex 
{
    public static void main(String args[])
    {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{8}{15}", "2haRaet54sfte6D")); 
        System.out.println(Pattern.matches("[a-zA-Z0-9]{8}{15}", "kk768ghrn")); 
        System.out.println(Pattern.matches("[a-zA-Z0-9]{8}{15}", "J6be46h7"));    
        System.out.println(Pattern.matches("[a-zA-Z0-9]{8}{15}", "2ayt&g")); 
        System.out.println(Pattern.matches("[a-zA-Z0-9]{8}{15}", "2au543khti5345yt&g"));
    }
}
