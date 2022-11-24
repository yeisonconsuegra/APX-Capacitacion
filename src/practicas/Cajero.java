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
public class Cajero {
    static class Cajero1{
        static private double dinero = 1000;

        public Cajero1() {
        }

        public static double getDinero() {
            return Cajero1.dinero;
        }

        public static void agregarDinero(double saldo){
            if(saldo > 0){
             Cajero1.dinero += saldo;
                System.out.println("Haz agregado : "+saldo);
                System.out.println("Tu saldo actual es : "+Cajero1.getDinero());
            }else{
                System.out.println("Valor incorrecto");
            }
        }

        public static void retirarDinero(double x){
            if(x > 0 && Cajero1.dinero >= x){
                Cajero1.dinero -= x;
                System.out.println("haz retirado : "+x);
                System.out.println("tu saldo actual es : "+getDinero());
            }else{
                System.out.println("Valor incorrecto");
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cajero1 cajero1 = new Cajero1();
        
        int ingresaDinero = 0;
        int retiraDinero = 0;
        int num1 = 0;
        int bandera = 0;
        
        do {            
            System.out.println("1, Ingresar dinero a la cuenta");
            System.out.println("2, retirar dinero de la cuenta");
            System.out.println("3, Salir");
            System.out.println("");
            System.out.print("Ingresa un valor a elejir : ");
            num1 = sc.nextInt();
            
            switch (num1) {
                case 1:
                    System.out.println("Tu saldo actual es de : "+Cajero1.getDinero());
                    System.out.println("¿Cuanto dinero vas a ingresar a la cuenta?");
                    ingresaDinero = sc.nextInt();
                    Cajero1.agregarDinero(ingresaDinero);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("¿Cuanto dinero vas a retirar de la cuenta?");
                    retiraDinero = sc.nextInt();
                    Cajero1.retirarDinero(retiraDinero);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Gracias por participar en nuestros cajeros");
                    bandera = 1;
                    System.out.println("");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (bandera != 1);
        
        
        
        
    }
}
