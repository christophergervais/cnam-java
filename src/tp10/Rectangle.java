package tp10;

public class Rectangle {
	
	private int x;
	private int y;
	private int length;
	private int width;


	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void translate (int a, int b) {
		this.x = this.x+a;
		this.y = this.y+b;
	}
	
	public void translate (int a) {
		this.x = this.x+a;
		this.y = this.y+a;
	}
	
	public Rectangle(int a, int b, int length, int width) {
		this.x = a;
		this.y = b;
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		this.x = 0;
		this.y = 0;
		this.length = 0;
		this.width = 0;
	}
	

}
