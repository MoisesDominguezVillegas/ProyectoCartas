package BoletinColecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio06Y07 {
	public static void main(String[] args) {
	/*
	 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
	 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
	 * almacenarlas, y asegúrate de que no se repite ninguna.
	 */
		String numero [] = {"as", "2", "3", "4", "5", "6", "7", "8", "9", "sota", "caballo", "rey"};
		String palo [] = {"bastos", "copas", "espadas", "oros"};
		
		ArrayList<Carta> cartasExtraidas = new ArrayList<Carta>();
		
		//GENERAR 10 CARTAS ALEATORIAS	*(N-M+1)+M)		
		for (int i = 0; i < 10; i++) {
			boolean existe;

			do {
				// GENERO UN NUMERO Y PALO ALEATORIO DELOS ARRAYS...
				int nAleatorio=(int)(Math.random()*(0-numero.length-1+1)+numero.length-1);
				String numeroAleatorio;
				
				int pAleatorio=(int)(Math.random()*(0-palo.length-1+1)+palo.length-1);
				String paloAleatorio;
				
				numeroAleatorio = numero[nAleatorio];
				paloAleatorio = palo[pAleatorio];
				//CREO LA CARTA NUEVA
				Carta c=new Carta(numeroAleatorio, paloAleatorio);
					
				
							
				// pienso que la carta nueva no está en cartasExtraidas
				existe = false;
				// RECORRO TODAS LAS CARTAS GENERADAS 
				for (Carta carta : cartasExtraidas) {
					// En caso de que ya se haya generado anteriormente... pongo existe a verdadero
					if( carta.getNumero().equals(c.getNumero()) && 	carta.getPalo().equals(c.getPalo())) {
						existe = true;// por lo tanto no puede agregarse, hay que generar otra...
					}
				}
				
				// SI EXISTE SIGUE VALIENDO FALSO ES QUE NUNCA SE HA GENERADO
				if(existe == false) {
					// POR LO TANTO LA AGREGO
					cartasExtraidas.add(c);
				}
				
			}while(existe);		
			
		}
		
		System.out.println("CARTAS SIN ORDENAR");
		for (Carta carta : cartasExtraidas) {
			System.out.println(carta.toString());
		}
		
		
		/*
		 * EJERCICIO 7!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * Modifica el programa anterior de tal forma que las cartas se muestren
		 * ordenadas. Primero se ordenarán por palo: bastos, copas, espadas,
		 * oros. Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5,
		 * 6, 7, sota, caballo, rey
		 */
		
		Collections.sort(cartasExtraidas);
		System.out.println("\n\nCARTAS ORDENADAS");
		for (Carta carta : cartasExtraidas) {
			System.out.println(carta.toString());
		}
	}
	
	
}