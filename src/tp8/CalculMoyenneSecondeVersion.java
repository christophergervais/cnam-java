/**
 * 
 */
package tp8;
import java.util.Scanner;
/**
 * @author chris
 */
public class CalculMoyenneSecondeVersion {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int nombreNote = 0;
		int sommeNote = 0;
		int note;
		System.out.println("Veuillez entrer une note svp");
		note = sc.nextInt();
		System.out.println("La note "+note+" a été enregistrée.");
		sommeNote = sommeNote + note;	
		/*
		while(note ==-1) { //on bloque la première note si le user veut rentrer -1 en valeur
			System.out.print("Non, vous ne pouvez pas entrez la valeur (-1) pour le moment veuillez entrer une autre valeur");
			note = sc.nextInt();
		}	*/	
		while (note != -1) 
		{
			//System.out.println("Veuillez entrer une note svp");
			note = sc.nextInt();
			System.out.println("La note "+note+" a été enregistrée.");
			sommeNote = sommeNote + note;
			nombreNote++;
			System.out.println("Le total est actuellemnt de "+sommeNote+" Veuillez entrer une autre noHHHHte svp");				
		}
		if (note ==-1) 
		{
			float moyenne = (float)sommeNote/nombreNote;
			System.out.println("Vous avez rentré "+ nombreNote +" notes, ce qui fait un total de "+sommeNote+" la moyenne est de "+ moyenne+"/20");
		}
		sc.close(); //obligatoire ?demander
	}
}
