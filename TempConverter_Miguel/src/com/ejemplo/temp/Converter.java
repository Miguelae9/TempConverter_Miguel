package com.ejemplo.temp;

public class Converter {
    // Convierte Celsius a Fahrenheit
    public double celsiusToFahrenheit(double c) {
        return c * 9/5 + 32;
    }

    public static void main(String[] args) {
        Converter cv = new Converter();
        System.out.println("0 °C = " + cv.celsiusToFahrenheit(0) + " °F");
        System.out.println("32 °F = " + cv.fahrenheitToCelsius(32) + " °C");
    }
    
 // Dentro de la clase Converter
    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

}
