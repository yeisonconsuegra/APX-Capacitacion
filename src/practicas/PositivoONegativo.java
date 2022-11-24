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
public class PositivoONegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero : ");
        int numero = sc.nextInt();
        
        while(numero != 0){
            if(numero > 0){
                System.out.println("Numero positivo");
                System.out.print("Introduce otro numero : ");
                numero = sc.nextInt();
            }else{
                System.out.println("Numero negativo");
                System.out.print("Introduce otro numero : ");
                numero = sc.nextInt();
            }
        }
        System.out.println("Fin del programa");
    }
}
