package tp8;

public class NombresPremiersB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PremierB();

	}
	public static void PremierB(){
		int nombre= 123;
		int j;
		for (j=0 ; j<=nombre ; j++) {
			
			for (int i = 2 ; i<j ; i++ ) {
			if(nombre%i !=0) {
				System.out.println(j);
				}
			}
		}
		
	}

}
