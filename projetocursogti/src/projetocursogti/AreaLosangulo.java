
package projetocursogti;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class AreaLosangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("  Vamos calcular a área de um losangulo! ");

        System.out.println("Digite a diagonal maior do losangulo:  ");
        double big = input.nextDouble();

        System.out.println("Digite a menor diagonal do losangulo:  ");
        double small = input.nextDouble();

        System.out.println("A área total do losangulo é :  " + big * small   );


          input.close();
           System.exit(0);



        //JOPTION
        JOptionPane.showMessageDialog(null, "Vamos calcular a área de um losangulo! ");

        big = Double.parseDouble(JOptionPane.showInputDialog("Digite a maior diagonal do losangulo"));
        small = Double.parseDouble(JOptionPane.showInputDialog("Digite a menor diagonal do losangulo"));

        double area = big * small;
        JOptionPane.showMessageDialog(null, "A área é: " + area );

    }

}