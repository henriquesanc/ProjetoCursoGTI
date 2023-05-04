
package projetocursogti;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TeoremaDePitagoras {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println( " Informe o valor do primeiro cateto: " );
        double cat1 = input.nextDouble();

        System.out.println("Informe o segundo cateto: " );
        double cat2= input.nextDouble();

        double raiz=  Math.pow(cat1, 2) + Math.pow(cat2, 2) ;

        double hip = Math.sqrt(raiz);

        System.out.println( " O valor da Hipotenusa é: " + hip);

          input.close();
           System.exit(0);

           //JOption

           cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto"));
           cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));
           JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hip );
    }

}
