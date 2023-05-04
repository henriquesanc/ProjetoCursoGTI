
package projetocursogti;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TempCelcius {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite aqui a temperatura em celsius para transforma-la em fahrenheit. ");
        double celsius = input.nextDouble();

        double fah = (celsius * 33.8);


        System.out.println( " Com essa quantidade de Graus celsius você tem: "+ fah + "Graus fahrenheit" );
          input.close();
           System.exit(0);

           //JOption

           celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a temperatura em celsius para  transforma-la em fahrenheit. "));
           JOptionPane.showMessageDialog(null, "Com essa quantidade de graus Celsius você tem: " + fah + "Graus Fahrenheit" );
    }

}