/**
 * 
 */
package tp1;
import java.util.Scanner;

/**
 * @author chris
 *
 */
public class Exercice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //on instancie l'ojet scanner grâce à la classe Scanner

		System.out.println("Veuillez entrer un nombre pour x");//affichage de la phrase pour donner une valeur à x 
		double x = scanner.nextDouble();//on déclare et donnons commme valeur à x ce qui entre : nextDouble est une méthode apartenant à la classe Scanner
		System.out.println("Veuillez entrer un nombre pour i"); 
		int i = scanner.nextInt();
		
		System.out.println("Le résultat est "+x*i);
		
		
		

	}

}
