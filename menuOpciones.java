package menuOpcionesGitHub;

import java.util.Scanner;

public class menuOpciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int num1,num2,total,opcion;


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
			System.out.println("Elige el primer numero ");
			num1=sc.nextInt();
			System.out.println("Elige el segundo numero ");
			num2=sc.nextInt();
			total=num1+num2;
			System.out.println("El resultado de la suma es: " +total);
			break;
		case 2:
			System.out.println("Elige el primer numero ");
			num1=sc.nextInt();
			System.out.println("Elige el segundo numero ");
			num2=sc.nextInt();
			total=num1-num2;
			System.out.println("El resultado de la resta es:" + total);
			break;
		case 3:
			System.out.println("Escoge el primer número ");
			num1=sc.nextInt();
			System.out.println("Escoge el segundo número ");
			num2=sc.nextInt();
			total=num1*num2;
			System.out.println("El resultado es: " + total);
			break;
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


