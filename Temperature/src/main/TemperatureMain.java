package main;

/**
 * @author PedroKawan <lowrayder71@gmail.com>
 * @version 1.0
 * @category Challange
 */

public class TemperatureMain {
	
	static Converter c = new Converter();
	
	public static void main(String[] args) {
		System.out.println(c.CelsiusToFahrenheits(15));
		System.out.println(c.CelsiusToKelvin(12));
		
		System.out.println(c.FahrenheitsToCelsius(150));
		System.out.println(c.FahrenheitsToKelvin(40));
		
		System.out.println(c.KelvinToCelsius(10));
		System.out.println(c.KelvinToFahrenheits(273.15));
	}
	
}
