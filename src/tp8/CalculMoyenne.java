/**
 * 
 */
package tp8;
import java.util.Scanner;
/**
 * @author chris
 *
 */
public class CalculMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de note au total ");
		int nombreNote = sc.nextInt();
		System.out.println("Vous avez saisi "+nombreNote+" notes");
		
		int sommeNote = 0;
		for (int i=1 ; i<=nombreNote ; i++) {
			System.out.println("Veuillez saisir la note "+ i );
			int valeur = sc.nextInt();
			sommeNote = sommeNote + valeur; 
			
		}
		
		System.out.println("La SOMME des notes est de "+ sommeNote );
		float moyenne = sommeNote/nombreNote;
		System.out.println("La MOYENNE des note est de "+ moyenne );
		
		
		

	}

}
