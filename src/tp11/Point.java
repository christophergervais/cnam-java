package tp11;

public class Point {
//un point peut se déplacer hirizontalement ou verticalement (axe des absisses et ordonnées)	
	//**************VARIABLE******************//
	private int abscisse;
	private int ordonnee;
	
	//**************GETTER******************//
	public int getAbscisse() {
		return this.abscisse;
	}

	public int getOrdonnee() {
		return this.ordonnee;
	}

	//**************CONSTRUCTEUR******************//
	public Point() {
		this.abscisse = 0;
		this.ordonnee = 0;
	}
	
	public Point(int x, int y) {
		this.abscisse = x ;
		this.ordonnee = y ;
	}
	
	
	//**************METHODES******************//

	public void translate(int x) {
		this.abscisse = this.abscisse + x;
		this.ordonnee = this.ordonnee + x;
	}
	
	public void translate(int x, int y) {
		this.abscisse = this.abscisse + x;
		this.ordonnee = this.ordonnee + y;
	}
}
