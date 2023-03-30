package main;

public final class Converter {


	public double CelsiusToFahrenheits(double celsius) {

		double fahrenheits;
		
		fahrenheits = celsius * 9/5 + 32;
		
		return fahrenheits;
	}
	
	public double CelsiusToKelvin(double celsius) {
		
		double kelvin;
		
		kelvin =  celsius + 273.15;
		
		return kelvin;
	}
	
	public double FahrenheitsToCelsius(double fahrenheits) {
		double celsius;
		
		celsius = (fahrenheits - 32) * 5/9;
		
		return celsius;
	}
	
	public double FahrenheitsToKelvin(double fahrenheits) {
		double kelvin;
		
		kelvin = (fahrenheits - 32) * 5/9 + 273.15;
				
		return kelvin;
	}
	
	public double KelvinToCelsius(double kelvin) {
		double celsius;
		
		celsius =  kelvin - 273.15;
		
		return celsius;
	}
	
	public double KelvinToFahrenheits(double kelvin) {
		double fahrenheits;
		
		fahrenheits =  (kelvin - 273.15) * 9/5 + 32;
		
		return fahrenheits;
	}
}
