
package projetocursogti;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Salario {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite o salário mínimo: ");
        double min = input.nextDouble();



        System.out.println(" Digite o salário de um funcionário:  ");
        double func = input.nextDouble();

        double result = func / min ;

        System.out.println( " O funcionário recebe "+ result + " partes de um salário mínimo." );

          input.close();
           System.exit(0);

        //JOption

        min = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário mínimo"));
        func = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário"));

        JOptionPane.showMessageDialog(null, "O funcionário recebe" + result + "partes de um salário mínimo" );


    }

}