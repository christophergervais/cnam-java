package tp1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//intervetir 2 entiers a et b
		
		int a;
		int b;
		Scanner chiffreUser = new Scanner(System.in);
		System.out.println("Veuillez choisir un chiffre a");
		a = chiffreUser.nextInt();
		System.out.println("Veuillez choisir un chiffre b");
		b= chiffreUser.nextInt();
		System.out.println("Vous avez choisis comme valeur pour a le chiffre "+a+" et comme valeur pour b le nombre "+b);
		System.out.println(TOTO(a,b));
		//System.out.println("La somme de a et b fait "+ Somme(a,b));
		//int x = a; 
		//a = b;
		//b = x;
		//Inverse(a,b);
		//System.out.println("Maintenant comme valeur pour a nous avons le chiffre "+a+" et comme valeur pour b le nombre "+b);
		//System.out.println("La somme de a et b fera toujours "+ Somme(a,b));
		
		
	

	}
	
	public static int TOTO(int x,int y) 
	{ 
		
		int resultat = x*y;
		return(resultat);
		
	}
	
	/*public static int Inverse(int a, int b) 
	{
		int tab[a,b];
		int x = a; 
		a = b;
		b = x;
		return(a);
		
	
	}*/

}
