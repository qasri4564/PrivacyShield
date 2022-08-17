package privacyshieldproj;

public class Reversestringwithoutreversemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation Testing";
		
		char chars[] = str.toCharArray();
		for(int i =chars.length-1;i>=0;i--) {
			System.out.println(chars[i]);
		}
		
		

	}

}
