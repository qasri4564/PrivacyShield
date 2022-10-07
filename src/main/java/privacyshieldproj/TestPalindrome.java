package privacyshieldproj;

public class TestPalindrome {

	public static void main(String[] args) {
		
		String s = "AnnA";
		
		String s2= new StringBuilder(s).reverse().toString();
		
		
		if(s.equals(s2))
			
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");

	}

}
