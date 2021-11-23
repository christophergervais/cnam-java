package tp11;

public class Fraction {
	//**************VARIABLE******************//
	private int numerateur;
	private int denominateur;
	
	
	
	
	//**************GETTER******************//
	public int getNumerateur() {
		return numerateur;
	}
	public int getDenominateur() {
		return denominateur;
	}
	
	//**************SETTER******************//
	
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}
	public void setDenominateur(int denominateur) {
		this.denominateur = denominateur;
	}
	
	
	//**************CONSTRUCTEUR******************//
	
	//PGCD
	
	public int Pgcd(int x, int y) {
		this.numerateur = x;
		this.numerateur = y;
		return x/y;
	}
	
	public int Numerateur(int x, int y) {	
		this.numerateur = x;
		return this.numerateur;
		
	}
	
	public int Denominateur(int x, int y) {
		this.denominateur = y;
		return this.numerateur;
	
	}
	
	

}
