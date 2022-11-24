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
public class SumaNumerosIntroducidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        System.out.print("Introduce un numero : ");
        int numero = sc.nextInt();
        
        while(numero>=0){
            suma += numero;
            System.out.println("la suma total es : "+suma);
            System.out.print("Introduce otro numero : ");
            numero = sc.nextInt();
        }
        System.out.println("Fin del programa");
    }
}
