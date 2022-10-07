package privacyshieldproj;

public class PrintOccurenceofletter {

	public static void main(String[] args) {
		
		       
		String s = "Hello World";
        char ch= 'l';
        int count=0;
        char[] c= s.toCharArray();
        for(int i =0;i<s.length();i++)
        {
            if(c[i]==ch)
            count++;
            
        }
        System.out.println("occurence of "+ ch +" " +"are"+" " + count);
        
	    }
	

	}


