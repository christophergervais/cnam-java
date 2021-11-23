package tp9;

public class DivisionEntiere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Divisible(123,41));
		//System.out.println(congruence(12,4,6));
	}
	public static boolean Divisible(int x , int y) { //fonction divisible
		int mod = x%y ; 
		
		boolean response;
		if (mod==0) {
			response = true;
		}else {
			response = false;
		}
		return response;
	}
	
	public static boolean congruence(int a, int b,int c) { //fonction congruence
		boolean response;
		if(a%c == b%c) {
			response = true;
		}else {
			response = false;
		}
		return response;
	}
 
}
