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
public class NumeroMayorOIgual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Dame el primer numero");
        num1 = sc.nextInt();
        System.out.println("Dame el segundo numero");
        num2 = sc.nextInt();
        
        if(num1 > 0 && num2 > 0){
            if(num1 == num2){
                System.out.println("Son numero iguales");
            }else{
                if(num1 > num2){
                    System.out.println("El numero mayor es el : "+num1);
                }else{
                    System.out.println("El numero mayor es el : "+num2);
                }
            }
        }else{
            System.out.println("Los numeros negativos no son permitidos...");
        }
        
    }
}
