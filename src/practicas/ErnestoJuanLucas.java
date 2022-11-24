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
public class ErnestoJuanLucas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuanto dinero tienes Ernesto?");
        double dolarErnesto = sc.nextDouble();
        double dolarJuan = dolarErnesto / 2;
        double dolarLucas = (dolarErnesto + dolarJuan) / 2;
        System.out.println("Entonces el dinero de juan es de : "+dolarJuan);
        System.out.println("Para finalizar el dinero de lucas es de : "+dolarLucas);
        
    }
}
