/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author ultimateon
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float  brtInc, lqdInc=0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Insira o Valor do Salario bruto");
        brtInc = keyboard.nextFloat ();
        
        if (brtInc < 1550) {
            System.out.println("O salário Líquido é "+ brtInc );
        }
        else if ( brtInc == 1550) {
            lqdInc= brtInc-50;
            System.out.println("O salário Líquido é "+ lqdInc);
        }
    }
    
}
