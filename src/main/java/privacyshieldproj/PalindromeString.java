package privacyshieldproj;

public class PalindromeString {

	public static void main (String[] args) {
	      String str = "ana";
	      String strRev = new StringBuffer(str).reverse().toString();
	         
	      if (str.equals(strRev))
	         System.out.println("Palindrome!");
	      else
	         System.out.println("Not a Palindrome!");
	   }

}
