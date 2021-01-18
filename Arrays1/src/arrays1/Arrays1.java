/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays1;

import java.util.Arrays;

/**
 *
 * @author Bego
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Empiezo programa");
        /*int numeros[]={5,7,3,2,6,3};*/
        int numeros[]=new int[5];
        Arrays.fill(numeros, 21);
        for(int i=0;i<numeros.length;i++)
            System.out.println(numeros[i]);
    }
    
}
