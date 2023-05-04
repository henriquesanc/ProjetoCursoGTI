
package projetocursogti;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Raio {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
       System.out.println( "Vamos calcular o  comprimento, área e o volume da esfera utilizando apenas o raio.  " );
       System.out.println("Me informe o raio de uma esfera: ");
       double raio = input.nextDouble();

       double comprimento = 2 * Math.PI * raio;
       System.out.println("O comprimento da sua esfera é: "+ comprimento  );

       double area = Math.PI * Math.pow(raio, 2);
       System.out.println( " A sua área :  " + area );

       double volume = 4 / 3 * Math.PI * Math.pow(raio, 3);
       System.out.println( " O seu volume é:  "+ volume );

       input.close();
       System.exit(0);

       //JOption

       raio = Double.parseDouble(JOptionPane.showInputDialog("Vamos calcular a área, o comprimento e o volume de uma esfere, utilizando apenas o raio.  \n"+ 
                                 "Digite o raio" ));
       JOptionPane.showMessageDialog(null, "O comprimento da sua esfera é: " + comprimento );
       JOptionPane.showMessageDialog(null, "A sua área é: " + area );
       JOptionPane.showMessageDialog(null, "O seu volume é: "+ volume);

    }
}