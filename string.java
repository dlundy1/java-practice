
// Testing 'String' Objects (not character arrays)

class string {
  public static void main(String args[]) {
	 // declare strings in various ways.
	 String str1 = new String("Java strings are objects.");
	 String str2 = "Java Strings can be constructed in Many ways";
	 String str3 = new String(str2);
	 
	 // Displays String Contents
	 System.out.println(str1);
	 System.out.println(str2);
	 System.out.println(str3);
	 System.out.println();
	 
	 // Utilizing length() method of String Class
	 System.out.println("Str1 length is " + str1.length());
	 System.out.println("Str2 length is " + str2.length());
	 System.out.println("Str3 length is " + str3.length());
	 System.out.println();
	 
	 // Utilizing charAt(index) method of String Class
	 System.out.println("Character at Position 1 is " 
					   + "\"" + str1.charAt(1) + "\"");
	 System.out.println("Character at Position 7 is " + "\"" 
					   + str2.charAt(7) + "\"");
	 System.out.println("Character at Posotion 3 is " + "\"" 
					   + str3.charAt(3) + "\"");
	}
}
