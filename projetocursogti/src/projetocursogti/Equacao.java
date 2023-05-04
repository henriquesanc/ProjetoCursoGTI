
package projetocursogti;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Equacao {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;



    public double calculaDelta(double a, double b, double c){
        setDelta((Math.pow(b,2)) - ( 4*a*c));
        return getDelta();
    }

    public double calculaDelta(){
        this.setDelta((Math.pow(this.getB(), 2)) - (4 * this.getA() * this.getC()));
        return getDelta();
    }

    public double calculaX1(){
        setX1(-getB() + Math.sqrt(getDelta()) / 2 * getA());
       return getX1(); 
    }

    public double calculax2(){
        setX2(-getB() - Math.sqrt(getDelta()) / 2 * getA());
        return getX2();
    }

   
    public double getA() {
        return a;
    }

   
    public void setA(double a) {
        this.a = a;
    }

    
    public double getB() {
        return b;
    }

   
    public void setB(double b) {
        this.b = b;
    }

  
    public double getC() {
        return c;
    }

  
    public void setC(double c) {
        this.c = c;
    }

   
    public double getDelta() {
        return delta;
    }

  
    public void setDelta(double delta) {
        this.delta = delta;
    }

    
    public double getX1() {
        return x1;
    }

    
    public void setX1(double x1) {
        this.x1 = x1;
    }

   
    public double getX2() {
        return x2;
    }

   
    public void setX2(double x2) {
        this.x2 = x2;
    }
}
