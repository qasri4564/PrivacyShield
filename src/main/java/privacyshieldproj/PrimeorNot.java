package privacyshieldproj;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		boolean prime=false;
		
		for(int i=2;i<=n/2;i++) {
			if (n%i==0) {
				prime=true;
				break;
			}
		}
		if(!prime)
		System.out.println("the no is prime"+" " +n);
		else 
			System.out.println("the no is not prime"+" " +n);

	}

}
