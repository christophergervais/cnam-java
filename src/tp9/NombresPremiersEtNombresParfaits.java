package tp9;
import java.util.Scanner;
public class NombresPremiersEtNombresParfaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entrez une valeur : ");
		Scanner sc = new Scanner(System.in);
		int nombreUser = sc.nextInt();
		System.out.println("Détermination d'un nombre premier");
		System.out.println(Diviseur(nombreUser));
		System.out.println("Liste des entier premier entre 1 et "+nombreUser+" : ");
		ListeDiviseur(nombreUser);
		System.out.println("Détermination d'un nombre parfait");
		NombreParfait(nombreUser);
		System.out.println("Liste des entier parfaits entre 1 et "+nombreUser+" : ");
		ListeParfaits(nombreUser);
	}
	
	
	public static boolean Diviseur(int x) { //fonction qui renvoie un true si c'est un premier, et false s'il n'est pas premier.
		boolean answer = true;
		for (int i = 2 ; i<x ; i++) { // i est initialisé à 2 car un entier n'est divisible que par 1 et lui même il faut donc les enlever.
			if(x%i ==0) {
				//System.out.println(i);
				answer = false;
			}
			
		}return answer;
	}
	
	
	public static void ListeDiviseur(int Y) { //cette fonction qui fait appel à la fonction diviseur et affiche la liste des premiers entre 1 et un chiffre demandé
		
		for(int j=1 ; j<=Y ; j++) {
			if(Diviseur(j)==true) {
			System.out.println(j + " = "+Diviseur(j));
			}		
		}		
	}
	
	public static boolean NombreParfait(int x) {
		boolean answer = false;
		int somme = 0;
		for (int i= 1 ; i<x ; i++) {
			if(x%i ==0) {
				somme = somme + i ;
				//System.out.println("Nouveau diviseur : "+i+". La somme fait "+somme);
			}		
		}
		if (somme == x) {
			System.out.println("x = "+x+" et la somme de ses diviseur = "+somme+". L'égalité est respectée Ce nombre est parfait");
			answer = true;
		}else {
			//System.out.println("x = "+x+" et la somme de ses diviseur = "+somme+". L'égalité n'est pas respectée Ce nombre n'est pas parfait");
			answer = false;
		}
		return answer;
	}
	
	public static void ListeParfaits(int Y) {
		for (int j=0 ; j<=Y ; j++) {
			if(NombreParfait(j)==true) {
				System.out.println(j);
			}
		}
	}
	
	













}
