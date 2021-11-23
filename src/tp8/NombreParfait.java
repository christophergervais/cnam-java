package tp8;
import java.util.Scanner;
public class NombreParfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez-moi un chiffre pour savoir s'il est parfait. ");
		int nombre = sc.nextInt();
		Parfait(nombre);
		//ListeParfait(nombre);


	}
	public static int Parfait(int x) { // fonction qui dit si le nombre est parfait
		
		int compteur = 0;
		int answer = 0;
		for(int i=1; i<x; i++){
			if (x%i==0) {
				System.out.println("La PRECEDENTE somme des divieurs INTERMEDIAIRES fait "+compteur);
				compteur = compteur + i ;
				System.out.println("La NOUVELLE somme des divieurs fait "+compteur);	
				}	
			}
		System.out.println("La somme TOTALE des divieurs de "+x+" fait "+compteur);
		if (compteur == x) {
			System.out.println ("Ce chiffre est donc parfait");
			answer = 1;
		}else {
			System.out.println ("Ce chiffre n'est pas parfait");
			answer = 0;
		}		
		return answer;
	}
	
	public static void ListeParfait(int X) { //fonction qui done la liste des parfaits
		System.out.println("Vous avez rentré la valeur "+X+", voici la liste des entiers de 0 à "+X+".");
		for (int i = 0 ; i<X ; i++) {
			if (Parfait(i)==1) {
				System.out.println(i);
			}
		}
	}

}
