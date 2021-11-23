package tp10;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
public class ManipulationVecteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random nombre = new Random();
		int max = 10;
		int min =5;
		int N = (nombre.nextInt(max-min)+min);
		System.out.println("il y aura "+N+" valeurs dans le tableau");
		int [] tab = new int[N];
		Vecteur(tab);
		//Maxi(tab);
		System.out.println("La valeur maximale est "+Maxi(tab)+"." );
		Cardinalite(tab);
		
		
		
		

	}
	public static void Vecteur(int [] x) {
		int max = 10;
		int min =1;
		Random nombre = new Random();
		for( int i=0 ; i<x.length ; i++) {
			x[i]= nombre.nextInt(max-min);
			System.out.println("la valeur "+(i+1)+" est de "+x[i]);
		}
		String z = Arrays.toString(x);
		System.out.println("tableau entier : "+z);// test affichage du tableau[,,,,,] (en string donc inexploitable)
		
		
		
			

	}
	

	
	public static int Maxi(int []x) {
		int max = x[0];
		for( int i = 0 ; i<x.length ; i++){
			if(max<x[i]) {
				max = x[i];
			}		
		}
		//System.out.println("La valeur maximale est "+max+"." );
		return max;
		
	}
	public static void Cardinalite(int []tabCible){
		//int compteur = 0;
		int[]tabRef = new int[Maxi(tabCible)];
		System.out.println(tabRef.length+" devient la longueur du tableau REF");//création du tableau REF avec comme taille le nombre maximal du tabCible
		for (int j = 0; j<tabRef.length ; j++) {		//on boucle sur le tabRef
										
			for(int i=0 ; i<tabCible.length ; i++) {		//on boucle sur le tabCible
				int compteur = 0;
				System.out.println("le compteur est à "+compteur);//initialisation du compteur
				if(j == tabCible[i]) {
					compteur++;
					System.out.println("le compteur est à "+compteur);
				}
				tabRef[j] = compteur;
				
				//System.out.println("L'index "+j+" de notre tableau REF pris la valeur "+tabCible[j]+". Car sur notre tableau CIBLE,le nombre" +tabCible[i]+ "apparait"+compteur+" fois." );
			}
			
			
			
		}
	}

}
