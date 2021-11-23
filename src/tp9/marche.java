package tp9;
import java.util.Scanner;
public class marche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Que voulez-vous ? ");
		String choix = sc.nextLine();
		inventaire(choix);
	}
	
	public static void inventaire(String x) {		
		if (x.indexOf('i') < 0 && x.indexOf('o') < 0 ) {
			System.out.println("J'ai ça dans mon stock vas-y prend.");
		}else System.out.println("Je n'ai pas ce produit revien demain mon ami");
		
	}

}
