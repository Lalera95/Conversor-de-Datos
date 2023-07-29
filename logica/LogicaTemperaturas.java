package mx.com.alura.logica;

public class LogicaTemperaturas {

	double cantidad, resultado;
	int temperatura1, temperatura2;

	// getters and setters
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public int getTemperatura1() {
		return temperatura1;
	}

	public void setTemperatura1(int temperatura1) {
		this.temperatura1 = temperatura1;
	}

	public int getTemperatura2() {
		return temperatura2;
	}

	public void setTemperatura2(int temperatura2) {
		this.temperatura2 = temperatura2;
	}

	public double getResultado() {
		return resultado;
	}

	public double convertir() {

		// 0 - Celsius (°C)
		// 1 - Fahrenheit (°F)
		// 2 - Kelvin (K)
		// 3 - Rankine (°Ra)"

		if (temperatura1 == temperatura2) {
			resultado = cantidad;
		} else if (temperatura1 == 0 && temperatura2 == 1) { // C a F
			resultado = (cantidad * 9 / 5) + 32;
		} else if (temperatura1 == 0 && temperatura2 == 2) { // C a k
			resultado = cantidad + 273.15;
		} else if (temperatura1 == 0 && temperatura2 == 3) { // C a Ra
			resultado = (cantidad * 9 / 5) + 491.67;
		} else if (temperatura1 == 1 && temperatura2 == 0) { // F a C
			resultado = (cantidad - 32) * 5 / 9;
		} else if (temperatura1 == 1 && temperatura2 == 2) { // F a K
			resultado = ((cantidad - 32) * 5 / 9) + 273.15;
		} else if (temperatura1 == 1 && temperatura2 == 3) { // F a Ra
			resultado = (cantidad + 459.67);
		} else if (temperatura1 == 2 && temperatura2 == 0) { // K a C
			resultado = cantidad - 273.15;
		} else if (temperatura1 == 2 && temperatura2 == 1) { // K a F
			resultado = ((cantidad - 273.15) * 9 / 5) + 32;
		} else if (temperatura1 == 2 && temperatura2 == 3) { // K a Ra
			resultado = cantidad * 1.8;
		} else if (temperatura1 == 3 && temperatura2 == 0) { // Ra a C
			resultado = (cantidad - 491.67) * 5 / 9;
		} else if (temperatura1 == 3 && temperatura2 == 1) { // Ra a F
			resultado = cantidad - 459.67;
		} else if (temperatura1 == 3 && temperatura2 == 2) { // Ra a K
			resultado = cantidad * 5 / 9;
		} else {
			resultado = 0;
		}

		return resultado;
	}

}
