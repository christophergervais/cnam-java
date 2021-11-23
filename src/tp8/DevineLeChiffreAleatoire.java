/**
 * 
 */
package tp8;
import java.util.Scanner;
/**
 * @author chris
 *
 */
public class DevineLeChiffreAleatoire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 100;
		int nombreOrdi = min + (int)(Math.random() * ((max - min) + 1));
		System.out.println("Chiffre choisi : "+nombreOrdi);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Veuillez saisir un chiffre : "); 
		int propositionUser = sc.nextInt();
		
		while (propositionUser != nombreOrdi) {
			if (propositionUser < nombreOrdi) 
			{
				System.out.println("Non, c'est plus grand");
			}else 
			{
				System.out.println("Non, c'est plus grand");
			}
			System.out.println("Veuillez saisir un chiffre : "); 
			propositionUser = sc.nextInt();
			
		}
		
		System.out.println("Bien joué Christo !");
		
		
		
		

	}

}
