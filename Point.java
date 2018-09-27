package uF4.trabajos.A1_17_09_2018._02;

public class Point {
	private int x, y;
	
	//CONSTRUCTOR
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//GETTERS
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	//SETTERS
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "X: " + x +
			   "\nY: " + y;
	}
	
	
	
	

}
