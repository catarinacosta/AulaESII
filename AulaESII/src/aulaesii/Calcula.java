/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaesii;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhunior
 */
public class Calcula {
    public static void main(String args[]){
      int ar;
      int br;
      int result;
       ar = Integer.parseInt(JOptionPane.showInputDialog("Inserir o primeiro numero"));
       br = Integer.parseInt(JOptionPane.showInputDialog("Inserir o primeiro numero"));
      result = soma(ar,br);
      JOptionPane.showMessageDialog(null, "A soma dos numeros é: "+ result);
    }
   
    public static int soma(int a, int b){
      return a+b;
    }
}
