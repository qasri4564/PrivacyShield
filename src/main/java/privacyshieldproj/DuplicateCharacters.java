package privacyshieldproj;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sd = "seleniumi";
		int count=0;
		char[] a = sd.toCharArray();
		
      for(int i=0;i<sd.length();i++) {
			for(int j = i+1;j<sd.length();j++) {
				if(a[i]==a[j])
				
				{	System.out.println(a[j]);
					count++;
					break;
				}
			}
		}
		
	}

}
