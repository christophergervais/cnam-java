package zprojetperso;
import java.util.Scanner;
public class TestPerso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

			System.out.println("Veuillez rentrez une valeur pour a : ");
			int a = sc.nextInt();

		

			System.out.println("Veuillez rentrez une valeur pour b : ");

		int b = sc.nextInt();
		
		Operation operation = new Operation();
		
		operation.Multiplication(a, b);
		
		


	}

}
