
package projetocursogti;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraDeMultiplicacao {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.println("Vamos fazer uma tabela de multiplicação até o 10 \n");
        System.out.println("Escolha um número");
        double num = input.nextDouble();
        System.out.println("E a tabela fica assim");
        System.out.println(num + "* 1 =" +   num * 1);
        System.out.println(num + "* 2 =" +   num * 2);
        System.out.println(num + " 3 =" +   num * 3);
        System.out.println(num + " 4 =" +   num *4);
        System.out.println(num + " 5 =" +   num * 5);
        System.out.println(num + " 6 =" +   num *6);
        System.out.println(num + " 7 =" +   num *7);
        System.out.println(num + " 8 =" +   num *8 );
        System.out.println( num + "* 9 =" +  num *9);
        System.out.println( num + "* 10 =" +  num * 10);

        input.close();
           System.exit(0);

     //JOption

        JOptionPane.showMessageDialog(null, "Vamos fazer uma tabuada até o 10! :");
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que você deseja calcular"));
        JOptionPane.showMessageDialog(null, "E assim fica o resultado: \n");



    }

}