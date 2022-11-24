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
public class ParOImparFinProgramaNum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero : ");
        int numero = sc.nextInt();
        
        while(numero != 0){
            if(numero%2 == 0){
                System.out.println("Numero par");
                System.out.print("Introduce otro numero : ");
                numero = sc.nextInt();
            }else{
                System.out.println("Numero impar");
                System.out.print("Introduce otro numero : ");
                numero = sc.nextInt();
            }
        }
        System.out.println("Fin del programa");
    }
}
