/**
 * 
 */
package tp8;
import java.util.*;
/**
 * @author chris
 *
 */
public class ChiffreNombreEntier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez-moi un chiffre svp");
		int nombre = sc.nextInt();
		//int nombre = 1028;
		
		int quotient ;
		int reste ;
		int puissance = -1;
		
		do 
		{
			quotient = nombre/10;
			reste = nombre%10;
			puissance++;
			//System.out.println("Le quotient est : "+ quotient);
			//System.out.println("Le reste est : "+ reste);
			System.out.println("10 puissance "+ puissance+" : "+reste);
			nombre = quotient;
		} while(quotient !=0);

	}
	

}
