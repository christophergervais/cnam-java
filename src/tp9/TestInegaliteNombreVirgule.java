package tp9;

public class TestInegaliteNombreVirgule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 4.5/(float)6.3 ;
		double d2 = (4.5/(float)2.1)/3 ;
		System.out.println("la valeur de d1 est "+d1);
		System.out.println("la valeur de d2 est "+d2);
		System.out.println("l'égalité est "+testEgalite(d1,d2)); // pas compris la consigne

	}
	public static boolean testEgalite(double x , double y) {
		boolean answer;
		if (x == y) {
			answer = true;
		}else {
			answer = false;
		}
		return answer;
	}
	


}
