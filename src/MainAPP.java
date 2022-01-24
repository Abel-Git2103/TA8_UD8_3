/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

public class MainAPP {

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico(300, "Azul", 'A', 55.4);
		Electrodomestico e2 = new Electrodomestico(300, "Verde", 'A', 55.4);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());

	}

}
