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
public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int suma = 0;
        int sumador = 0;
        System.out.print("Introduce un numero : ");
        int numero = sc.nextInt();
        
        while(numero>=0){
            sumador++;
            suma += numero;
            int promedio = suma / sumador;
            System.out.println("Tu promedio es de : "+promedio);
            System.out.print("Introduce otro numero : ");
            numero = sc.nextInt();
        }
        System.out.println("Fin del programa");
    }
}
