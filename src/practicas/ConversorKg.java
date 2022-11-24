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
public class ConversorKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kg = 0;
        int num1 = 0;
        int bandera = 0;
        
        do {            
            System.out.println("");
            System.out.println("1. para convetir kg en libras");
            System.out.println("2. para convetir kg en toneladas");
            System.out.println("3. para convetir kg en onza");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Ingrese el valor que desea para convertir kg a lo que quiera : ");
            num1 = sc.nextInt();
            
            switch (num1) {
                case 1:
                    System.out.println("Ingrese el valor en kg para convetirlo a libras");
                    int dato1 = sc.nextInt();
                    kgLibras(dato1);
                    break;
                case 2:
                    System.out.println("Ingrese el valor en kg para convetirlo a toneladas");
                    int dato2 = sc.nextInt();
                    kgToneladas(dato2);
                    break;
                case 3:
                    System.out.println("Ingrese el valor en kg para convetirlo a onza");
                    int dato3 = sc.nextInt();
                    kgOnza(dato3);
                    break;
                case 4:
                    bandera = 1;
                    System.out.println("Gracias por participar");
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (bandera != 1);
    }
    
    static void kgLibras(int x){
        double total = x * 2.2046;
        System.out.println("Su kilogramos a libras es de : "+total);
    }
    
    static void kgToneladas(int y){
        double total2 = (y / 1000);
        System.out.println("Su kilogramos a toneladas es de : "+total2);
    }
    
    static void kgOnza(int z){
        double tota3 = z * 35.274;
        System.out.println("Su kilogramos a onza es de : "+tota3);
    }
}
