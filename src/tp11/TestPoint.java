package tp11;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point1 = new Point();
		
		System.out.println("Le point1 a pour abscisse "+point1.getAbscisse());
		System.out.println("Le point1 a pour ordonnee "+point1.getOrdonnee());
		System.out.println("");
		
		Point point2 = new Point(3,56);
		
		System.out.println("Le point2 a pour abscisse "+point2.getAbscisse());
		System.out.println("Le point2 a pour ordonnee "+point2.getOrdonnee());
		System.out.println("");
		point1.translate(15);
		System.out.println("Test de la translation sur le point1 avec un seul nombre en paramètre : 15 ");
		System.out.println("Le point1 a pour abscisse "+point1.getAbscisse());
		System.out.println("Le point1 a pour ordonnee "+point1.getOrdonnee());
		System.out.println("");
		
		point2.translate(10,20);
		System.out.println("Test de la translation sur le point2 avec deux nombres en paramètre : 10 & 20 ");
		System.out.println("Le point2 a pour abscisse "+point2.getAbscisse());
		System.out.println("Le point2 a pour ordonnee "+point2.getOrdonnee());
	}

}
