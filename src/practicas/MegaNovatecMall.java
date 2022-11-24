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
public class MegaNovatecMall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double montoSuperar = 300;
        double montoPersona = 0;
        
        System.out.println("¿De cuanto fue su valor total en su compra?");
        montoPersona = sc.nextDouble();
        if(montoPersona > montoSuperar){
            double descuento = 0;
            double totalPagar = 0;
            descuento = (montoPersona * 20) / 100;
            totalPagar = montoPersona - descuento;
            System.out.println("Su valor a pagar con el descuento es de : "+totalPagar);
        }else{
            System.out.println("Su valor a pagar es de : "+montoPersona);
        }
        
    }
}
