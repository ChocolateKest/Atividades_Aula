
package com.mycompany.somaelementos;
import javax.swing.JOptionPane;


public class Somaelementos {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int soma = 0;
        
        for(int i = 0; i < 10; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"digite 10 numeros"));
            soma += numeros[i];
        }
        
         System.out.println("A soma dos números é: " + soma);  
        
    }
}
        
    

