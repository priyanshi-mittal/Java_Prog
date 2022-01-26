//STRING
//String methods

class stringexample
{
	public static void main(String args[])
	{
		String str1= "Java Programming";
		String str2= " java Programming";
		System.out.println(str1);	
		System.out.println("\n\n.........................\n\n");
		
		//String res = str1.toUpperCase();
		//String res = str1.toLowerCase();
		//String res = str1.replace('a','Z');
			//OR
		//String res = str1.replace("Java", "cloud");
		//int res = str1.length();
		//String res = str1.trim();
		//int res = str1.indexOf('m',6);
		//char res= str1.charAt(6);
		//String res = str1.substring(6);
 		//boolean res = str1.equals(str2);
		//boolean res = str1.equalsIgnoreCase(str2);
		
		String res = str1.concat(str2);
		System.out.println(res);
			
		//System.out.println(res.length());
	}
}