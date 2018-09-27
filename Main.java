package uF4.trabajos.A1_17_09_2018._02;

//import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Color color = new Color(100f, 150f, 200f);  // Color definido
		Point point = new Point(23, 45);  // Coordenada establecida de una posicion
		
		
		System.out.println("CIRCULO");
		Circle circulo = new Circle();  // Creo un circulo
		circulo.setColor(color);  // Se le asigna un color
		circulo.setOrigen(point);  // Se le asigna una posicion
		
		circulo.setRadius(6);  // se agina el radio del circulo
		
		System.out.println("Perimetro: " + circulo.perimetro() + // se muestra el calculo del perimetro
						   "\nArea: " + circulo.area());  // se muestra el calculo del area
		
		System.out.println("\nCombinacion de color");
		circulo.detalleColor();  //Aqui los detalles del color y de la posicion.
		
		System.out.println("\nUbicacion del circulo");
		circulo.detalleCoordenada();  //Aqui los detalles de la posicion.
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("RECTANGULO");
		Rectangle rectangulo = new Rectangle();
		rectangulo.setColor(color);
		rectangulo.setOrigen(point);
		
		rectangulo.setHW(4, 8);  // Se asigna el valor del alto y ancho.
		
		System.out.println("Perimetro: " + rectangulo.perimetro() + // se muestra el calculo del perimetro
				   		   "\nArea: " + rectangulo.area());  // se muestra el calculo del area
		
		
		System.out.println("\nCombinacion de color");
		rectangulo.detalleColor();  //Aqui los detalles del color y de la posicion.
		
		System.out.println("\nUbicacion del circulo");
		rectangulo.detalleCoordenada();  //Aqui los detalles de la posicion.
		
		
		
		
		
		/*
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
		*/	
	}
}


/*Figuras: círculos y rectángulos.

Diseñar una aplicación para representar figuras siguiendo el diagrama de clases siguiente, cree un círculo y un rectángulo y 
practica con cada uno de los métodos de estas figuras.

Indicaciones: La clase Color guarda un color RGB, la clase Point guarda las coordenadas x e y.
En el diagrama - significa private, + significa público mientras que # protected.


En la clase main debe probar los métodos que ha hecho. En concreto:
Debe crear:
un círculo y un rectángulo y mostrar de ambos su área, su perímetro, la posición donde se encuentra (Point) y el color que tienen.
*/