package pwr.imaginarynumbers;

public class ImaginaryNumbersCalculator {

    public ImaginaryNumber add(ImaginaryNumber x, ImaginaryNumber y){
        return new ImaginaryNumber(x.getRealPart() + y.getRealPart(), x.getImaginaryPart()
                + y.getImaginaryPart());
    }

    public ImaginaryNumber subtract(ImaginaryNumber x, ImaginaryNumber y){
        return new ImaginaryNumber(x.getRealPart() - y.getRealPart(), x.getImaginaryPart()
                - y.getImaginaryPart());
    }

    public ImaginaryNumber multiply(ImaginaryNumber x, ImaginaryNumber y){
        return new ImaginaryNumber(x.getRealPart() * y.getRealPart() - x.getImaginaryPart()
                * y.getImaginaryPart(), x.getRealPart() * y.getImaginaryPart() + x.getImaginaryPart()
                * y.getRealPart());
    }
}
