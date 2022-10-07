package privacyshieldproj;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str= "s@r!i(d^h&a*r";
		str=str.replaceAll("[^a-zA-Z]","");
		System.out.println(str);

	}

}
