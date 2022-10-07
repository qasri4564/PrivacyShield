package privacyshieldproj;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		
		int a = 0, b = 1, c, i, Count=10;
 
		System.out.println(a +" " + b);
		
		for(i=2;i<Count;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		
	}

}
