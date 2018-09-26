package uF4.trabajos.A1_17_09_2018._02;

import java.awt.Color;
import java.awt.Point;

public class Shape {  // Forma o figura
	
	private Color color;
	private Point origen;
	
	
	//CONSTRUCTORES
	protected Shape() {
		color = null;
		origen = null;
	} 
	
	protected Shape(Point org) {
		this.origen = org;
	} 
	
	protected Shape(Color col, Point org) {
		this.color = col;
		this.origen = org;
	}
	
	
	//GETTERS
	public Color getColor() {
		return color;
	}

	public Point getOrigen() {
		return origen;
	}

	//SETTERS
	public void setColor(Color color) {
		this.color = color;
	}

	public void setOrigen(Point origen) {
		this.origen = origen;
	}
	

	
	//DETALLES 
	public void detalleCoordenada() {
		System.out.println("Origen X: " + origen.getX() + 
						   "\nOrigen Y: " + origen.getY());
	} 
	
	

	public void detalleColorCoordenada() {
		System.out.println("Rojo: " + color.getRed() + 
						   "\nVerde: " + color.getGreen() + 
						   "\nAzul: " + color.getBlue() +
						   "\nOrigen X: " + origen.getX() + 
						   "\nOrigen Y: " + origen.getY());
	}

	
	

	
	
}  