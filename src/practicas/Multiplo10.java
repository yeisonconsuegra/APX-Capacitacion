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
public class Multiplo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.println("Ingrese un numero entero");
        numero = sc.nextInt();
        if(numero > 0){
            if(numero%10 == 0){//si el numero ingresado divido con el residuo es 0
                System.out.println("Es multiplo de 10");
            }else{
                System.out.println("no es multiplo de 10");
            }
        }else{
            System.out.println("Ey ojo escribe bien...");
        }
        
    }
}
