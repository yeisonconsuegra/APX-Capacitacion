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
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Ingresa el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = sc.nextInt();
        
        if(num1 > 0 && num2 > 0){
            if(num1%2 == 0 && num2%2 == 0){
                System.out.println("Ambos numero son pares");
            }else if(num1%2 == 1 && num2%2 == 1){
                System.out.println("Ambos numero son impares");
            }else if(num1%2 == 0 && num2%2 == 1){
                System.out.println("El numero par es el : "+num1);
                System.out.println("El numero impar es el : "+num2);
            }else{
                System.out.println("El numero impar es el : "+num1);
                System.out.println("El numero par es el : "+num2);
            }
        }else{
            System.out.println("No aceptamos numeros negativos");
        }
    }
}
