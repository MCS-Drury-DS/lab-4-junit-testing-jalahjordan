package cs.csmath.complexnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {
    static final double delta = 0.000001;

    @Test
    public void getImagpart() {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        assertEquals(1.0, cn.getImagPart(), delta);
    }

    @Test
    public void setImagpart() {
        ComplexNumber cn = new ComplexNumber();
        cn.setImagPart(2.0);
        assertEquals(2.0, cn.getImagPart(), delta);
    }

    @Test
    public void getRealpart() {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        assertEquals(1.0, cn.getRealPart(), delta);
    }

    @Test
    public void setRealpart() {
        ComplexNumber cn = new ComplexNumber();
        cn.setRealPart(2.0);
        assertEquals(2.0, cn.getRealPart(), delta);
    }

    // tests 4.5+3.0i + 6.0+4.0i = 10.5+7.0i
    @Test
    public void add() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.add(cn2);
        assertEquals(10.5, cn1.getRealPart(), delta);
        assertEquals(7.0, cn1.getImagPart(), delta);
    }

    @Test
    public void add1() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        ComplexNumber result = ComplexNumber.add(cn1, cn2);
        assertEquals("Assert real part", 10.5, result.getRealPart(), delta);
        assertEquals("Assert imaginary part", 7.0, result.getImagPart(), delta);
    }

    @Test
    public void sub() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.sub(cn2);
        assertEquals(-1.5, cn1.getRealPart(), delta);
        assertEquals(-1, cn1.getImagPart(), delta);
    }

    @Test
    public void mult() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.mult(cn2);
        assertEquals(15, cn1.getRealPart(), delta);
        assertEquals(36, cn1.getImagPart(), delta);
    }

    @Test
    public void div() {
        ComplexNumber cn1 = new ComplexNumber(2.0, 2.0);
        ComplexNumber cn2 = new ComplexNumber(2.0, 2.0);
        cn1.div(cn2);
        assertEquals(2.0, cn1.getRealPart(), delta);
        assertEquals(2.0, cn1.getImagPart(), delta);
    }

    @Test
    public void dividebyzero() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 5.3);
        ComplexNumber cn2 = new ComplexNumber(0.0, 0.0);
        try {
            cn1.div(cn2);
            fail();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void conj() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber();
        cn2 = cn1.conj();
        assertEquals(4.5, cn1.getRealPart(), delta);
        assertEquals(-3.0, cn2.getImagPart(), delta);
    }

    @Test
    public void abs() {
        ComplexNumber cn1 = new ComplexNumber(2.0, 2.0);
        double A = cn1.abs();
        assertEquals(Math.sqrt(8.0), A, delta);
    }

    @Test
    public void complexNumber() {
    }

    @Test
    public void testtoString() {
        ComplexNumber cn = new ComplexNumber();
        String s = cn.toString();
        assertEquals("0.0+0.0i", s);
    }
}