package mx.com.alura.logica;

public class LogicaDivisas{
	private double moneda1, resultado;
	private int divisa1,divisa2;
	
	
	//Getters and Setters
	public double getMoneda1() {
		return moneda1;
	}
	public void setMoneda1(double moneda1) {
		this.moneda1 = moneda1;
	}
	public int getDivisa1() {
		return divisa1;
	}
	public void setDivisa1(int divisa1) {
		this.divisa1 = divisa1;
	}
	public int getDivisa2() {
		return divisa2;
	}
	public void setDivisa2(int divisa2) {
		this.divisa2 = divisa2;
	}
	public double getResultado() {
		return resultado;
	}

	// constructor
		
	//Metodos

	// 0 - Peso Mexicano (MXN)
	// 1 - Dolar (USD)
	// 2 - Euro (EUR)
	// 3 - Libra Esterlina (GBP)
	// 4 - Yen Japones (JPY)
	// 5 - Won Sul-Coreano (KRW)"
	
	public double convertir() {
		if (divisa1 == divisa2) {
			resultado = moneda1;
		} else if(divisa1 == 0 && divisa2 == 1 ) { //pesos a dolares
			resultado = moneda1 * 0.059;
		}else if(divisa1 == 0 && divisa2 == 2 ) { //pesos a Euros
			resultado = moneda1 * 0.054;
		}else if(divisa1 == 0 && divisa2 == 3 ) { //pesos a libra esterlina
			resultado = moneda1 * 0.046;
		}else if(divisa1 == 0 && divisa2 == 4 ) { //pesos a yen japones
			resultado = moneda1 * 8.3;
		}else if(divisa1 == 0 && divisa2 == 5 ) { //pesos a Won Sul koreano
			resultado = moneda1 * 75.64;
		}
		else if(divisa1 == 1 && divisa2 == 0 ) { //dolar a peso
			resultado = moneda1 * 16.88;
		}else if(divisa1 == 1 && divisa2 == 2 ) { //dolar a euro
			resultado = moneda1 * 0.91;
		}else if(divisa1 == 1 && divisa2 == 3 ) { //dolar a libra esterlina
			resultado = moneda1 * 0.78;
		}else if(divisa1 == 1 && divisa2 == 4 ) { //dolar a yen japones
			resultado = moneda1 * 138.98;
		}else if(divisa1 == 1 && divisa2 == 5 ) { //dolar a won Sul Coreano
			resultado = moneda1 * 1284.71;
		}
		else if(divisa1 == 2 && divisa2 == 0 ) { //Euro a Peso
			resultado = moneda1 * 18.51;
		}else if(divisa1 == 2 && divisa2 == 1 ) { //Euro a Dolar
			resultado = moneda1 * 1.10;
		}else if(divisa1 == 2 && divisa2 == 3 ) { //Euro a Libra Esterlina
			resultado = moneda1 * 0.86;
		}else if(divisa1 == 2 && divisa2 == 4 ) { //Euro a Yen Japones
			resultado = moneda1 * 152.63;
		}else if(divisa1 == 2 && divisa2 == 5 ) { //Euro a Won Sul Coreano
			resultado = moneda1 * 1407.90;
		}
		else if(divisa1 == 3 && divisa2 == 0 ) { //Libra Esterlina a Peso
			resultado = moneda1 * 21.59;
		}else if(divisa1 == 3 && divisa2 == 1 ) { //Libra Esterlina a Dolar
			resultado = moneda1 * 1.28;
		}else if(divisa1 == 3 && divisa2 == 2 ) { //Libra Esterlina a Euro
			resultado = moneda1 * 1.17;
		}else if(divisa1 == 3 && divisa2 == 4 ) { //Libra Esterlina a Yen Japones
			resultado = moneda1 * 178.00;
		}else if(divisa1 == 3 && divisa2 == 5 ) { //Libra Esterlina a Won Sul Corenao
			resultado = moneda1 * 1642.66;
		}
		else if(divisa1 == 4 && divisa2 == 0 ) { //Yen Japones a Peso
			resultado = moneda1 * 0.12;
		}else if(divisa1 == 4 && divisa2 == 1 ) { //Yen Japones a Dolar
			resultado = moneda1 * 0.0072;
		}else if(divisa1 == 4 && divisa2 == 2 ) { //Yen Japones a Euro
			resultado = moneda1 * 0.0065;
		}else if(divisa1 == 4 && divisa2 == 3 ) { //Yen Japones a Libra Esterlina
			resultado = moneda1 * 0.0056;
		}else if(divisa1 == 4 && divisa2 == 5 ) { //Yen Japones a Won Sul Coreano
			resultado = moneda1 * 9.21;
		}
		else if(divisa1 == 5 && divisa2 == 0 ) { //Won Sul Coreano a Peso
			resultado = moneda1 * 0.013;
		}else if(divisa1 == 5 && divisa2 == 1 ) { //Won Sul Coreano a Dolar
			resultado = moneda1 * 0.00078;
		}else if(divisa1 == 5 && divisa2 == 2 ) { //Won Sul Coreano a Euro
			resultado = moneda1 * 0.00071;
		}else if(divisa1 == 5 && divisa2 == 3 ) { //Won Sul Coreano a Libra Esterlina
			resultado = moneda1 * 0.0000061;
		}else if(divisa1 == 5 && divisa2 == 4 ) { //Won Sul Coreano a Yen Japones
			resultado = moneda1 * 0.11;
		}
		else {
			resultado = 0.00;
		}
		return resultado;
	}
}
