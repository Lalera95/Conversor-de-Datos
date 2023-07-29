package mx.com.alura.logica;

public class LogicaMasa {

	private int masa1, masa2;
	private double cantidad, resultado;
	
	
	//Getters and Setters
	public int getMasa1() {
		return masa1;
	}
	public void setMasa1(int masa1) {
		this.masa1 = masa1;
	}
	public int getMasa2() {
		return masa2;
	}
	public void setMasa2(int masa2) {
		this.masa2 = masa2;
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
	
	//Metodo
	public double convertir() {
		// 0 - Tonelada (t)
		// 1 - Kilogramo (kg)
		// 2 - Gramo (g)
		// 3 - Miligramo (mg)
		// 4 - Onza (oz)
		// 5 - Libra (lb)
		
		if(masa1 == masa2) {
			resultado = cantidad;
		}else if(masa1 ==0 && masa2 == 1) { //t a kg
			resultado = cantidad * 1000;
		}else if(masa1 ==0 && masa2 == 2) { //t a g
			resultado = cantidad * 1000000;
		}else if(masa1 ==0 && masa2 == 3) { //t a mg
			resultado = cantidad * 1000000000;
		}else if(masa1 ==0 && masa2 == 4) { //t a oz
			resultado = cantidad * 35273.94;
		}else if(masa1 ==0 && masa2 == 5) { //t a lb
			resultado = cantidad * 2204.62;
		}
		else if(masa1 == 1 && masa2 == 0) { //kg a t
			resultado = cantidad * 0.001;
		}else if(masa1 == 1 && masa2 == 2) { //kg a g
			resultado = cantidad * 1000;
		}else if(masa1 == 1 && masa2 == 3) { //kg a mg
			resultado = cantidad * 1000000;
		}else if(masa1 == 1 && masa2 == 4) { //kg a oz
			resultado = cantidad * 35.274;
		}else if(masa1 == 1 && masa2 == 5) { //kg a lb
			resultado = cantidad * 2.20462;
		}
		else if(masa1 == 2 && masa2 == 0) { //g a tonelada
			resultado = cantidad * 0.000001;
		}else if(masa1 == 2 && masa2 == 1) { //g a kg
			resultado = cantidad / 1000;
		}else if(masa1 == 2 && masa2 == 3) { //g a mg
			resultado = cantidad * 1000;
		}else if(masa1 == 2 && masa2 == 4) { //g a oz
			resultado = cantidad / 28.35;
		}else if(masa1 == 2 && masa2 == 5) { //g a lb
			resultado = cantidad / 453.6;
		}
		else if(masa1 == 3 && masa2 == 0) { //mg a t
			resultado = cantidad / 1000000000;
		}else if(masa1 == 3 && masa2 == 1) { //mg a kg
			resultado = cantidad / 1000000;
		}else if(masa1 == 3 && masa2 == 2) { //mg a g
			resultado = cantidad / 1000;
		}else if(masa1 == 3 && masa2 == 4) { //mg a oz
			resultado = cantidad / 28350;
		}else if(masa1 == 3 && masa2 == 5) { //mg a lb
			resultado = cantidad / 453600;
		}
		else if(masa1 == 4 && masa2 == 0) { //oz a t
			resultado = cantidad / 35270;
		}else if(masa1 == 4 && masa2 == 1) { //oz a kg
			resultado = cantidad / 35.274;
		}else if(masa1 == 4 && masa2 == 2) { //oz a g
			resultado = cantidad / 0.035274;
		}else if(masa1 == 4 && masa2 == 3) { //oz a mg
			resultado = cantidad * 28349.5;
		}else if(masa1 == 4 && masa2 == 5) { //oz a lb
			resultado = cantidad * 0.0625;
		}
		else if(masa1 == 5 && masa2 == 0) { //lb a t
			resultado = cantidad * 0.000454;
		}else if(masa1 == 5 && masa2 == 1) { //lb a kg
			resultado = cantidad * 0.453592;
		}else if(masa1 == 5 && masa2 == 2) { //lb a g 
			resultado = cantidad * 453.592;
		}else if(masa1 == 5 && masa2 == 3) { //lb a mg
			resultado = cantidad * 453592.37;
		}else if(masa1 == 5 && masa2 == 4) { //lb a oz
			resultado = cantidad * 16;
		}else {
			resultado = 0.0;
		}
		
		
		
		
		
		
		
		
		return resultado;
	}
}
