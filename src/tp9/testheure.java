package tp9;

public class testheure {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		String temps = "12:33:04";
		String heure = temps.substring(0, 2);
		String minute = temps.substring(3, 5);
		String seconde = temps.substring(6, temps.length());
		
		System.out.println("il est "+heure+" heures(s) "+minute+" minutes(s) "+seconde+" secondes(s).");

	}

}
