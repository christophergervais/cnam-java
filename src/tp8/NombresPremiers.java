package tp8;
import java.util.Scanner;
public class NombresPremiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez-moi un chiffre svp ? "); //mettre ça dans la fonction?
		nombre = sc.nextInt();
		//System.out.println(Premier(nombre));
		ListPremier(nombre);
	}
	
	public static String Premier(int x) {
		int compteur = 0;
		String answer = "test";
		for (int i = 2 ; i<x ; i++) {
			if (x%i == 0) {
				compteur ++;
			}
			if (compteur==0) {
				answer = "c'est un nombre premier";
			}else {
				answer = "ce n'est pas un chiffre premier";
			}		
		}
		return answer;
	}
	
	public static void ListPremier(int x) {
		for(int i=0 ; i<=x ; i++) {
			if(Premier(i) == "c'est un nombre premier" ) {
				System.out.println(i+" est un nombre premier.");
			}
		}
		
	}

	
//	public static String Premier(int x) {
//		String verdict="test";
//		int compteur=0;
//			for(int i = 2; i<x; i++) {
//				if(x%i == 0 && x!=i){
//					compteur++;
//					System.out.println("Le divseur i = "+i);
//					System.out.println("Le compteur est à "+compteur);
//					
//				}
//			}//return compteur;
//			if (compteur !=0){
//				verdict = "Ce n'est pas un chiffre Premier.";
//			}else {
//				verdict = "c'est un chiffre Premier.";
//			}return verdict;
//		}
}
