package tp9;

public class TestMatrice {
	
	public static void main(String[] args) {

		int tab[][]={{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(tab[2].length);
		//matrice(tab,-7);
		
		int []tabseuil =  {4,5,66,7,8,45,2,3,234};
		int seuil = 6;
		//supSeuil(tabseuil,seuil);
		System.out.print("l'inverse de "+tabseuil+" est : ");
		inverse(tabseuil);
		
	}
	public static void matrice(int x[][], int y) {
		for (int i =0 ; i<x.length ; i++) {
			System.out.println();
			if(y>0) {
				for (int j=0 ; j<x[i].length ; j++) {
						System.out.print(x[i][j]+y);	
					}
			}else{
				for (int j=0 ; j<x[i].length ; j++) {
					System.out.print(x[i][j]);	
				}
			}
		}	
	}


	public static void supSeuil(int[]x,int y) {
		int compteur =0;
		for (int i=0; i<x.length ; i++) {
			if (x[i]>y) {
				compteur++;
			}
			
		}System.out.println("il y a "+compteur+" nombres au desus de "+y);
	}
	
	public static void inverse(int []x) {
		for(int i=x.length-1 ; i>0 ; i--) {
			System.out.print(x[i]+" ");
		}
	}
	

}
