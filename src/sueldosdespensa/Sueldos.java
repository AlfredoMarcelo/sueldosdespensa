package sueldosdespensa;

import java.util.Scanner;

public class Sueldos {
	
	public static void main(String[] args) {
		
		double sueldo = 0;//double acepta numeros enteros y enteros con decimales
		int categoria;
		
		System.out.println("Ingrese el tipo de categoria que desea calcular para obtener el sueldo : \n 1: Ayudante \n 2: Técnico \n 3: Profesional");
		Scanner teclado = new Scanner (System.in);//Scanner se utiliza para solicitar y guardar un valor
		categoria = teclado.nextInt();//se asigna a categoria el valor capturado del usuario en Scanner, nextInt() indica que se va a obtener un INT
		
		if(categoria == 1) {
			sueldo = 250.5 + (250.5 * 0.10);
		}else {
			if(categoria == 2) {
				sueldo = 500.5 + (500.5 * 0.15);
			} else {
				if(categoria == 3) {
					sueldo = 700 + (700*0.25);
				}else {
					System.out.println("Debe ingresar un numero de categoria valido");
				}
			}
		}
		
		if(categoria == 1 || categoria == 2 || categoria == 3) {
			System.out.println("El total del sueldo para la categoria seleccionada " + categoria + " es igual a " + sueldo);
		}
	}

}
