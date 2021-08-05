package pwr.imaginarynumbers;

public class ImaginaryNumber {

    private double realPart;
    private double imaginaryPart;

    public ImaginaryNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public ImaginaryNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}
