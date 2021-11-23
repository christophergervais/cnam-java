package tp8;
import java.util.Scanner;
public class CalculMoyenneSecondeVersionDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noteGlobale = 0;
		int compteur = 0;
		int nouvelleNote;
		int moyenne;
		
		do {
			System.out.println("Donnez-mois une note svp ? ");
			nouvelleNote = sc.nextInt(); 
			noteGlobale = noteGlobale+nouvelleNote;
			compteur++;
			System.out.println("Vous avez rentré la note "+nouvelleNote+" le compteur est à "+compteur);
			
		}while(nouvelleNote != -1);
		System.out.println("Vous avez rentré -1, pour un total de " +(noteGlobale+1)+". La moyenne est de "+((noteGlobale/(compteur-1))));
		

	}

}
