package privacyshieldproj;

public class vowelscount {

	public static void main(String[] args)
{
		String s= "Welcome to java";
	    int count =0;
		char[] a = s.toCharArray();
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			count++;
			 //	System.out.println(a[i]);
			
	    	
			}
		System.out.println(count);
	}
		
}



