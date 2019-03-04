package cs.csmath.complexnumber;

public class ComplexNumber {
    public ComplexNumber() {
        RealPart = 0.0;
        ImagPart = 0.0;
    }

    public ComplexNumber(double Real, double Imag) {
        this.setRealPart(Real);
        this.setImagPart(Imag);
    }

    public ComplexNumber(ComplexNumber cn) {
        this.RealPart = cn.getRealPart();
        this.ImagPart = cn.getImagPart();
    }

    private double RealPart;

    public double getRealPart() {
        return RealPart;
    }

    public double getImagPart() {
        return ImagPart;
    }

    public void setImagPart(double ImagPart) {
        this.ImagPart = ImagPart;
    }

    private double ImagPart;

    public void setRealPart(double RealPart) {
        this.RealPart = RealPart;
    }

    public void add(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() + otherCN.getRealPart();
        double newImagPart = this.getImagPart() + otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public void sub(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() - otherCN.getRealPart();
        double newImagPart = this.getImagPart() - otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);

    }

    public void mult(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() * otherCN.getRealPart()
                - this.getImagPart() * otherCN.getImagPart();
        double newImagPart = this.getImagPart() * otherCN.getRealPart()
                + this.getRealPart() * otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public void div(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() * otherCN.getRealPart() + this.getImagPart() * otherCN.getImagPart()
                / otherCN.getRealPart() * otherCN.getRealPart() + otherCN.getImagPart() * otherCN.getImagPart();
        double newImagPart = this.getImagPart() * otherCN.getRealPart() - this.getRealPart() * otherCN.getImagPart()
                / otherCN.getRealPart() * otherCN.getRealPart() + otherCN.getImagPart() * otherCN.getImagPart();

        double denominator = otherCN.getRealPart() * otherCN.getRealPart() + otherCN.getImagPart() * otherCN.getImagPart();
        if (java.lang.Math.abs(denominator) < 0.000001) {
            throw new ArithmeticException();
        }
    }

    public  ComplexNumber conj() {
        double newRealPart = this.getRealPart();
        double newImagPart = -1.0 *  this.getImagPart();
        return new ComplexNumber(newRealPart, newImagPart);
    }




    public double abs() {
        return Math.sqrt(this.getRealPart() * this.getRealPart() +
                this.getImagPart() * this.getImagPart());
    }

    public void ComplexNumber(double real, double imag) {
    }


// class method for adding two complex numbers.
    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN) {
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);
        cn2.add(cn1);
        return cn2;
    }

    public static ComplexNumber sub(ComplexNumber firstCN, ComplexNumber secondCN) {
        throw new UnsupportedOperationException();
    }

    public static ComplexNumber mult(ComplexNumber firstCN, ComplexNumber secondCN) {
        throw new UnsupportedOperationException();
    }

    public static ComplexNumber div(ComplexNumber firstCN, ComplexNumber secondCN) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        ComplexNumber cn2 = new ComplexNumber();
        cn1.mult(cn2);
    }

    @Override
    public String toString() {
        return getRealPart() + "+" + getImagPart() + "i";
    }
}
