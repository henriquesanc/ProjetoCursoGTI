
package projetocursogti;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaMediaNotas {

    public static void main(String[]args ) {
        Scanner teclado = new Scanner (System.in);


        System.out.print ("Coloque a sua primeira nota : ");
        double n1 = teclado.nextFloat();

       System.out.println("Coloque a sua segunda nota: ");
       double n2 = teclado.nextFloat();

       double m = ( n1 + n2 ) / 2 ;

       System.out.println("Seu resultado foi : " + m  );

       if (m >9 )
       {
           System.out.println("Parábens voce conseguiu uma média para entrar em Harvard");
       } else {
        if (m < 4) {
             System.out.println("Você infelizmente não passou de ano");
        }

        }

       teclado.close();
       System.exit(0);

       //Joption

       n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota : "));
       n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota : "));
       m = (n1 + n2) / 2 ;
       JOptionPane.showMessageDialog(null, String.format("A media foi %.2f "+ m ));
    }
}