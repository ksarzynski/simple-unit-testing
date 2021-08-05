package pwr;

import pwr.imaginarynumbers.ImaginaryNumber;
import pwr.imaginarynumbers.ImaginaryNumbersCalculator;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = new Calculator();
        ImaginaryNumbersCalculator imaginaryNumbersCalculator = new ImaginaryNumbersCalculator();
        System.out.println(calculator.add(5, 5));
        System.out.println(imaginaryNumbersCalculator.add(new ImaginaryNumber(5, 5),
                new ImaginaryNumber(6, 6)));
    }
}
