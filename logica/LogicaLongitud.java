package mx.com.alura.logica;

public class LogicaLongitud {

	private int long1, long2;
	private double cantidad, resultado;

	// Setters and Getters
	public int getLongitudPrincipal() {
		return long1;
	}

	public void setLongitudPrincipal(int longitudPrincipal) {
		this.long1 = longitudPrincipal;
	}

	public int getLongitudSecundaria() {
		return long2;
	}

	public void setLongitudSecundaria(int longitudSecundaria) {
		this.long2 = longitudSecundaria;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getResultado() {
		return resultado;
	}

	// Metodo

	public double convertir() {
		
		// 0 - Kilómetro (km)
		// 1 - Hectómetro (hm)
		// 2 - Decámetro (dam)
		// 3 - Metro (m)
		// 4 - Decímetro (dm)
		// 5 - Centímetro (cm)
		// 6 - Milímetro (mm)
		
		if(long1 == getLongitudSecundaria()) {
			resultado = cantidad;
		}else if (long1 ==0 && long2 == 1 || long1 ==1 && long2 == 2 || long1 ==2 && long2 == 3 || long1 == 3 && long2 == 4 || long1 == 4 && long2 == 5 || long1 == 5 && long2 == 6){
			resultado = cantidad * 10;
		}else if(long1 ==0 && long2 == 2 || long1 ==1 && long2 == 3 ||  long1 ==2 && long2 == 4 || long1 == 3 && long2 == 5 || long1 == 4 && long2 == 6 ) {
			resultado = cantidad * 100;
		}else if(long1 ==0 && long2 == 3 || long1 ==1 && long2 == 4 || long1 ==2 && long2 == 5 || long1 == 3 && long2 == 6 ) {
			resultado = cantidad * 1000;
		}else if(long1 ==0 && long2 == 4 || long1 ==1 && long2 == 5 || long1 ==2 && long2 == 6) {
			resultado = cantidad * 10000;
		}else if(long1 ==0 && long2 == 5 || long1 ==1 && long2 == 6) { 
			resultado = cantidad * 100000;
		}else if(long1 ==0 && long2 == 6) {
			resultado = cantidad * 1000000;
		}else if(long1 ==1 && long2 == 0 || long1 ==2 && long2 == 1 || long1 == 3 && long2 == 2 || long1 == 4 && long2 == 3 || long1 == 5 && long2 == 4 || long1 == 6 && long2 == 5 ) {
			resultado = cantidad / 10;
		}else if(long1 ==2 && long2 == 0 || long1 == 3 && long2 == 1 || long1 == 4 && long2 == 2 || long1 == 5 && long2 == 3 || long1 == 6 && long2 == 4) {
			resultado = cantidad / 100;
		}else if(long1 == 3 && long2 == 0 ||long1 == 4 && long2 == 1 || long1 == 5 && long2 == 2 || long1 == 6 && long2 == 3) {
			resultado = cantidad / 1000;
		}else if (long1 == 4 && long2 == 0 || long1 == 5 && long2 == 1|| long1 == 6 && long2 == 2) {
			resultado = cantidad / 10000;
		}else if(long1 == 5 && long2 == 0 || long1 == 6 && long2 == 1) { 
			resultado = cantidad / 100000;
		}else if(long1 == 6 && long2 == 0) {
			resultado = cantidad / 1000000;
		}
		
		return resultado;
	}
	
}
