package uF4.trabajos.A1_17_09_2018._02;

public class Rectangle extends Shape{  // Resctangulo

	private double height, width;
	
	//CONSTRUCTOR
	public Rectangle() {
		super();
		this.height = 0;
		this.width = 0;
	}
	
	public Rectangle(double height, double width, Point point) {
		super(point);
		this.height = height;
		this.width = width;
	}

	//GETTERS
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	
	//SETTER
	public void setHW(double height, double width) {
		this.height = height;
		this.width = width;
	}


	//METODOS SOBREESCRITOS
	@Override
	public double area() {
		return height * width;
	}
	
	@Override
	public double perimetro() {
		return 2 * (height + width);
	}
	
	
	
	
	
	
}
