
package projetocursogti;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnoDeNascimento {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      Scanner input = new Scanner (System.in);


      System.out.println("Qual é o seu ano de nascimento: ");
      double n1 = input.nextInt();

      System.out.println ("No atual ano você tem:" +  (  - n1 + 2023 ) );


      System.out.println ("No ano de 2050 você terá:" +  (  - n1 + 2050 ) );

      input.close();
       System.exit(0);

    //AGORA COM JOPTION

       n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero que voce deseja calcular a tabuada"));
       double idfuture = n1 - 2050;
      JOptionPane.showMessageDialog(null, String.format("A média foi %.2f"+ idfuture  ));
    }

}