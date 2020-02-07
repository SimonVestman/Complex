/*
Complex data type
Created 2020-02-06
*/

public class Complex {
    private double re;
    private double im;
        //Constructor
    public Complex (double Re, double Im) {
        this.re = Re;
        this.im = Im;
    }
        //Addition
    public Complex add (Complex b){
        return new Complex (this.re + b.re, this.im + b.im);
    }

        //Subtraction
    public Complex sub (Complex b){
        return new Complex(this.re - b.re, this.im - b.im);
    }

        //Multiplication
    public Complex multiply (Complex b){
        return new Complex(this.re * b.re - (this.im * b.im), this.im * b.re + (this.re * b.im));
    }

    @Override
    public String toString() {
        return "Complex{" + re + "+" + im + "i" + "}";
    }

    //complex test program
    public static void main (String[]args){
        Complex a = new Complex(3,7);
        Complex b = new Complex(5,3);
        Complex c = a.add(b);
        System.out.println(c);

        Complex d = a.sub(b);
        System.out.println(d);

        Complex e = a.multiply(b);
        System.out.println(e);
    }
}