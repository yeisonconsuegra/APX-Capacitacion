/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;
import java.util.*;
/**
 *
 * @author santi
 */
public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es su salario por hora?");
        double salaPorHora = sc.nextDouble();
        System.out.println("¿Cuantas horas trabajó en la semana?");
        double horasTrabajadas = sc.nextDouble();
        
        double totalPago = horasTrabajadas * salaPorHora;
        
        System.out.println("Su pago total de la semana es : "+totalPago);
        
        
    }
}
