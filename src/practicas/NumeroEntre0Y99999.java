/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class NumeroEntre0Y99999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = (int)(Math.random() * 99999);
        int cantidad = 0;
        System.out.println("Numero aleatorio : "+numero);
        while(numero != 0){
            numero = (numero / 10); //deacuerdo a los numeros que tenga se divide entre 10 hasta llegar a 0
            cantidad++;
        }
        System.out.println("el numero aleatorio contiene : "+cantidad);
            
        
    }
}
