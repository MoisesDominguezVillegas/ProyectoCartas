package BoletinColecciones;

public class Carta implements Comparable <Carta>{
	private String numero;
	private String palo;
	
	public Carta(String numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}


	public String toString() {
		return "Carta " + numero + " de " + palo;
	}

	public int aEntero() {
		int res=0;
		switch (this.numero) {
		case "as" : 
			res=1;
			break;
		case "2" : 
			res=2;
			break;
		case "3" : 
			res=3;
			break;
		case "4" : 
			res=4;
			break;
		case "5" : 
			res=5;
			break;
		case "6" : 
			res=6;
			break;
		case "7" : 
			res=7;
			break;
		case "8" : 
			res=8;
			break;
		case "9" : 
			res=9;
			break;
		case "sota" : 
			res=10;
			break;
		case "caballo" : 
			res=11;
			break;
		case "rey" : 
			res=12;
			break;

		}
		
		return res;
	}
	
	public int compareTo(Carta o) {
		int res = this.getPalo().compareTo(o.getPalo());
		// res = -1 o 0 o 1
		
		if( res == 0) { // tienen el mismo palo, por lo que hay que ordenar por numero
			if( this.aEntero() > o.aEntero() ) {
				res=1;
			}else if(this.aEntero()<o.aEntero()) {
				res=-1;
			}
		}
		
		return res;
	}
	
	
	
}
