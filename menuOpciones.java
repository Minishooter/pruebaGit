package menuOpcionesGitHub;

import java.util.Scanner;

public class menuOpciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,opcion;
		System.out.println("Que opcion quieres hacer? ");
		System.out.println("1. Sumar ");
		System.out.println("2. Restar ");
		System.out.println("3. Multiplicar ");
		System.out.println("4. Dividir ");
		System.out.println("5. Salir ");
		opcion=sc.nextInt();
		
		do {
			
		switch (opcion) {
		
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
		
		case 5:
			
			System.out.println("Saliendo ");	
		break;
		
		default:
			
			System.out.println("Numero no valido ");
			break;
		}	
		
		}while(opcion !=5);
						
		}
	}


