package uax.practicas.java_uax;

import java.util.Scanner;

import uax.practicas.java_uax.ejs.miniretos;

public class JavaUaxApplication {
	public static void main(String[] args) {
		miniretos miniretos = new miniretos();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"--- Menu de Mini-Retos ---" + "\n" +
						"--- De Mario Rodriguez ---" + "\n" +
						"1. Primero - Ultimo 2. Marcha atras" + "\n" +
						"3. Total Acumulado  4. Mayor - Menor" + "\n" +
						"5. Contador pares   6. Arr con valor doble" + "\n" +
						"-- Seleccione el reto que quieras ejecutar: ");
		int eleccion = sc.nextInt();
		System.out.println("--------------------");

		switch (eleccion) {
			case 1:
			miniretos.ej1();
				break;
			case 2:
			miniretos.ej2();
				break;
			case 3:
			miniretos.ej3();
				break;
			case 4:
			miniretos.ej4();
				break;
			case 5:
			miniretos.ej5();
				break;
			case 6:
			miniretos.ej6();
				break;

			default:
				break;
		}
	}

}
