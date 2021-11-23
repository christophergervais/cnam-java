package tp11;

public class Segment {
	//**************VARIABLE******************//
	private Point p1;
	private Point p2;
	
	//**************GETTER******************//

	
	
	//**************CONSTRUCTEUR******************//
	
	public Segment(Point x, Point y) {
		this.p1 = x;
		this.p2 = y;
	}

	
	
	
	//**************METHODE******************//
	public int Longueur() {
		return (this.p1.getAbscisse() - this.p2.getAbscisse());
	
	}
}
