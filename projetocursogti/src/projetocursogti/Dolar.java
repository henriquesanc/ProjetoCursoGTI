
package projetocursogti;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class Dolar {

    public static void main(String[] args) {

     Scanner input = new Scanner (System.in);

     System.out.println("Qual é o atual valor do dólar em relação ao real atualmente ? ");
     double cash = input.nextDouble();

     System.out.println("Quantos dolares você tem? ");
     double muchc = input.nextDouble();

     System.out.println("Atualmente você tem  " + 
     cash * muchc + " reais em dólares"  );

     input.close();
       System.exit(0);

     //Joption

     cash = Double.parseDouble(JOptionPane.showInputDialog("Qual é o atual valor do dólar? "));

     muchc = Double.parseDouble(JOptionPane.showInputDialog("Quantos dolares você tem? "));

     double total = muchc * cash;

     JOptionPane.showMessageDialog(null, "Atualmente você tem" + total + "reais em dolares");

    }

}
