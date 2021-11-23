package tp8;

public class Facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		System.out.println("la factorielle est "+Factoriel(a));

	}
	
		public static long Factoriel(int x) {
		long fact = 1;
		for ( int i =1 ; i<=x ; i++) {
			fact = fact*i;
			System.out.println(fact);
		}
		return fact;
	}

}
