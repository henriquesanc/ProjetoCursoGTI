
package projetocursogti;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gordura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu peso em Kg: ");
        double weight = input.nextDouble();

        double more = weight * 1.15;
        double less = weight * 0.8;

        System.out.println("Se você engordar 15% vai ficar com " + more + " Kg");
        System.out.println("Se você emagrecer 20% vai ficar com " + less + " Kg");

        input.close();

        weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em Kg"));

        double morejop = weight * 1.15;
        double lessjop = weight * 0.8;

        JOptionPane.showMessageDialog(null, "Se você engordar 15% vai ficar com " + morejop + " Kg");
        JOptionPane.showMessageDialog(null, "Se você emagrecer 20% vai ficar com " + lessjop + " Kg");
    }
}