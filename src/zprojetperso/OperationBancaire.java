package zprojetperso;
import java.util.Scanner;
public class OperationBancaire {

	public static void main(String[] args) {
		int nbDebitCarte, nbDebitCheque, nbDebitVirement, nbDebitTotal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de debit par Carte Bleu ? ");
		nbDebitCarte = sc.nextInt();
		System.out.println("Combien de d�bit par ch�que ? ");
		nbDebitCheque= sc.nextInt();
		System.out.println("Combien de d�bit par virement ? ");
		nbDebitVirement = sc.nextInt();
		
		nbDebitTotal = nbDebitCarte+nbDebitCheque+nbDebitVirement;
		
		System.out.println("Le nombre de d�bit est de "+nbDebitTotal+".");
		System.out.println("Le pourcentage de d�bit par CB est de "+ Pourcentage(nbDebitCarte,nbDebitTotal) +"%.");
		System.out.println("Le pourcentage de d�bit par ch�que est de "+ Pourcentage(nbDebitCheque,nbDebitTotal) +"%.");
		System.out.println("Le pourcentage de d�bit par virement est de "+ Pourcentage(nbDebitVirement,nbDebitTotal) +"%.");
		
		
		
		
		
		

	}
	public static float Pourcentage(int local, int total) {
		 float pourcentage = (float) local/total*100;
		return pourcentage;
		
	}

}
