
package com.mycompany.projeto1;

import javax.swing.JOptionPane;

public class Projeto1 {

    public static void main(String[] args) {
       
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você quer repetir a sua frase? "));
        String frase = JOptionPane.showInputDialog(null, "Qual a sua frase? "); 
        System.out.println("Quantas vezes você quer que esta frase se repita?");
        for (int i=0;i<quantidade;i++){
            System.out.println(frase);
        }
        
             
           
    }
}
