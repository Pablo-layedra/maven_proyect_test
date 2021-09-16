package prueba.unidad.cuatro;

import java.util.Scanner;

public class BancoPichinchaCorreccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String claveIngresada;
		String opcionMenu;
		int saldoInicial=2500;
		
		do {
			System.out.println("Ingresar clave: ");
			Scanner teclado = new Scanner(System.in);
			Scanner tecladoInt = new Scanner(System.in);
			
			claveIngresada=teclado.nextLine();
			
			if (claveIngresada.equals("85DB")) {
				do {
					System.out.println();
					System.out.println("###############################");
				    System.out.println("BANCO PICHINCHA: elija una opcion");
				    System.out.println("1. Consultar pagos");
				    System.out.println("2. Realizar transeferencia");
				    System.out.println("3. SALIR");
				    System.out.println("###############################");
				    opcionMenu=teclado.nextLine();
				    //while opcionMenu.equals("1") opcionMenu.equals("2")
				    
				    if (opcionMenu.equals("1")){
				    	System.out.println("No tiene ningun pago pendiente");
				    }else if(opcionMenu.equals("2")){
				    	System.out.println("Ingrese la cuenta de destino");
				    	String cuentaDestino=teclado.nextLine();
				    	System.out.println("Ingrese monto a tranferir");
				    	int montoTransferir=tecladoInt.nextInt();
				    	int saldo=saldoInicial-montoTransferir;
				    	System.out.println("Su nuevo saldo es: " + saldo);
				    	
				    }
				}while (!opcionMenu.equals("3"));
				claveIngresada="0";
			}else {
				System.out.println("La clave no es correcta");
			}
			
		}while (!claveIngresada.equals("-1"));
		System.out.println("Gracias por preferirnos");
	}
}
