package uF4.trabajos.A1_17_09_2018._02;

public class Color {
	private float red, green, blue;
	
	//CONSTRUCTOR
	public Color(float red, float green, float blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

		
	//GETTERS
	public float getRed() {
		return red;
	}

	public float getGreen() {
		return green;
	}

	public float getBlue() {
		return blue;
	}

	
	//SETTERS
	public void setRed(float red) {
		this.red = red;
	}

	public void setGreen(float green) {
		this.green = green;
	}

	public void setBlue(float blue) {
		this.blue = blue;
	}
	
	
	@Override // Esto significa sobreescribir, en este caso al metodo del sistema tambien llamado 'toString()'
	public String toString() {
		return "R: " + red + 
			   "\nG: " + green + 
			   "\nB: " + blue;
	}
	
	

}
