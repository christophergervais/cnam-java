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
		Scanner scanner = new Scanner(System.in); //on instancie l'ojet scanner gr�ce � la classe Scanner

		System.out.println("Veuillez entrer un nombre pour x");//affichage de la phrase pour donner une valeur � x 
		double x = scanner.nextDouble();//on d�clare et donnons commme valeur � x ce qui entre : nextDouble est une m�thode apartenant � la classe Scanner
		System.out.println("Veuillez entrer un nombre pour i"); 
		int i = scanner.nextInt();
		
		System.out.println("Le r�sultat est "+x*i);
		
		
		

	}

}
