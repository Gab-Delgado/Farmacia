import java.util.Scanner;
public class Farmacia {
			
	static void aPagar(int metodoDePago, double total){
		
			if (metodoDePago == 1){
				total = total - (total * 0.05);
				System.out.println("Tienes un descuento del 5%. El total a pagar es: " + total);
				
			} else if (metodoDePago == 2) {
				total = total + (total * 0.03);
				System.out.println("Tienes un recargo del 3%. El total a pagar es: " + total);

			} else {
				System.out.println("No es una opcion valida.");
			}
	}
	static void premio(int cedula, int dia) {
		if (cedula % 2 == 0) {
			if (dia == 6) {
				System.out.println("Felicitaciones! Ganaste una botella de te de durazno");
				
			} else if (dia == 9) {				
				System.out.println("Felicitaciones! Ganaste un descuento del 9% sobre el valor de la siguiente compra");
				
			} else if (dia == 24) {
				System.out.println("Felicitaciones! Ganaste un gel antibacterial");
				
			}
		} else {
			if (dia == 6) {
				System.out.println("Felicitaciones! Ganaste una coca cola de 750cm");
				
			} else if (dia == 9) {
				System.out.println("Felicitaciones! Ganaste un descuento del 9% sobre el valor de la siguiente compra");
				
			} else if (dia == 24) {
				System.out.println("Felicitaciones! Ganaste un sobre de dolex");
				
			}
		}
	}
	
	public static void main(String args[]) {
		
		double costo;
		int cedula;
		int dia;
		int metodoDePago;
		Scanner in = new Scanner(System.in);
		
		System.out.println("De que forma vas a pagar?\n 1 Para contado. 2 para tarjeta");
		metodoDePago = in.nextInt();
		System.out.println("Porfavor ingresa tu cedula");
		cedula = in.nextInt();
		System.out.println("Que dia piensas ir a comprar?");
		dia = in.nextInt();
		System.out.println("Cuanto cuesta el producto que vas a comprar? ");
		costo = in.nextInt();
		
		aPagar(metodoDePago, costo);
		premio(cedula, dia);

	}
}