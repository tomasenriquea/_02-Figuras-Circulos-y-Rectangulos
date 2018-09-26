package uF4.trabajos.A1_17_09_2018._02;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Point;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Constructor por defecto");
		Shape f1 = new Shape();
		System.out.println(f1.getColor());
		System.out.println(f1.getOrigen());
		
		
		System.out.println("------------------------------------");
		
		Point org = new Point(2,4);  //Se llama a la clase Point de una libreria
		
		System.out.println("Constructor con un solo parametro de typo clase");
		Shape f2 = new Shape(org);
		System.out.println(f2.getOrigen());
		f2.detalleCoordenada();
		
		
		System.out.println("------------------------------------");
		
		Color col = new Color(100, 150, 200);  // Se llama a la clase Color de una libreria.
		
		System.out.println("Constructor con dos parametros de typo clase");
		Shape f3 = new Shape(col, org);  // Aqui recibira 'org' de f1 y 'col' de la nueva clase creada.
		System.out.println(f3.getOrigen() + "\n" + f3.getColor());
		f3.detalleColorCoordenada();
		
		
		
		
		
	
	}
}


/*Figuras: círculos y rectángulos.

Diseñar una aplicación para representar figuras siguiendo el diagrama de clases siguiente, cree un círculo y un rectángulo y 
practica con cada uno de los métodos de estas figuras.

Indicaciones: La clase Color guarda un color RGB, la clase Point guarda las coordenadas x e y.
En el diagrama - significa private, + significa público mientras que # protected.

*/