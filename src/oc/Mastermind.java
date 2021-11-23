/**
 * 
 */
package oc;
import java.util.Scanner;
/**
 * @author chris
 *
 */
public class Mastermind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recherchePlusMoins();

	}
	public static void recherchePlusMoins() {
		int choix[] = {1,8,3,4}; // mettre des scan pour inserer les choisx ds un tableau
		//int target[] = {1,2,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de chiffre dans la combinaison ?");
		int nombreCombi = sc.nextInt();
		int [] cible= new int[nombreCombi];
		String result="";
		
		for(int j =0 ; j<nombreCombi ; j++) {
			System.out.println("Rentrez la valeur pour le chiffre "+(j+1)+" svp.");
			cible[j]=Integer.parseInt(sc.next());
			result = result+cible[j];
			}
		
		
		
		System.out.println("Voici ce que vous avez donné comme valeurs : "+result);
//		int taille = target.length;
//		for ( int i=0;i<taille ;i++) {
//			
//		
//			if (target[i]==choix[i]) {
//				System.out.print("=");
//			}else{
//				if(target[i]<choix[i]) {
//				System.out.print("-");
//				}else {
//					System.out.print("+");
//				}
//			}
//		}
	}

}
