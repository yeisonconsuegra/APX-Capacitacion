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
public class VentaCarrosUsados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorTotal = 0;
        double precioCarro = 0;
        double salarioEmpleados = 1000000;
        double comisionCarroVenta = 150000;
        int carrosVendidos = 0;
        double porcentajeGanancia = 0;
        
        System.out.println("¿Cuantos autos vendio al mes?");
        carrosVendidos = sc.nextInt();
        if(carrosVendidos > 0){
            double valorAcumulado = 0;
            for(int i = 1; i <= carrosVendidos; i++){
                System.out.println("Ingrese el precio del auto "+i);
                precioCarro = sc.nextDouble();
                porcentajeGanancia = (precioCarro * 5) / 100 + comisionCarroVenta;
                valorAcumulado += porcentajeGanancia; 
            }
            valorTotal = valorAcumulado + salarioEmpleados;
            System.out.println("Su pago mensual es de : "+valorTotal);
        }else{
            System.out.println("Tu pago mensual es de : "+salarioEmpleados);
        }
       
        
    }
}
