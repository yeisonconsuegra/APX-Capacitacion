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
public class NotaSobresaliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nota = 0;
        
        System.out.println("Califiquenos del 1 al 10, 1 siento insuficiente y asi sucecivamente hasta el 10 siendo sobresaliente");
        System.out.println("Dame una nota");
        nota = sc.nextInt();
        
        if(nota > 0){
            if(nota >= 0 && nota <= 2){
                System.out.println("Insuficiente");
            }else if(nota >= 3 && nota <= 4){
                System.out.println("suficiente");
            }else if(nota >= 5 && nota <= 6){
                System.out.println("bien");
            }else if(nota >= 7 && nota <= 8){
                System.out.println("notable");
            }else if(nota >= 9 && nota <= 10){
                System.out.println("sobresaliente");
            }else{
                System.out.println("Numero invalido...");
            }
        }else{
            System.out.println("Numeros negativos no permitidos");
        }
    }
}
