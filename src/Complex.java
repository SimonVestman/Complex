import javax.swing.*;

/*
Komplex datatyp
skapat 2020-02-06
*/
public class Complex {
    private double re;
    private double im;

    public Complex (double Re, double Im) {
        this.re = Re;
        this.im = Im;
    }

    public Complex add (Complex b){
        double NewRe =
        double NewIm =
        return new Complex ();
    }
    public static void main (String[]args){         //complex test
        Complex a = new Complex(3,7);
        Complex b = new Complex(5,3);
        Complex c = a.add(b);
        System.out.println(c);
    }
}
