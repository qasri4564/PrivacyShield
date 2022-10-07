package privacyshieldproj;

public class OccurenceofVowels {

	public static void main(String[] args) {
		
		String str = "selenium test";
		
		int count[]= new int[5];
		for(int i=0;i<str.length();i++){
		{
			if(str.charAt(i)=='a')
				count[0]++;
		}
		{
			if(str.charAt(i)=='e')
				count[1]++;
		}
		{
			if(str.charAt(i)=='i')
				count[2]++;
		}
		{
			if(str.charAt(i)=='o')
				count[3]++;
		}
		{
			if(str.charAt(i)=='u')
				count[4]++;
		}
	}
System.out.println("no of a="+count[0]);
System.out.println("no of e="+count[1]);
System.out.println("no of i="+count[2]);
System.out.println("no of o="+count[3]);
System.out.println("no of u="+count[4]);
}}
