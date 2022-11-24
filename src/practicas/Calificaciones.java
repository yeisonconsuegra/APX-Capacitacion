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
public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese calificacion 1");
        int calificacion1 = sc.nextInt();
        System.out.println("Ingrese calificacion 2");
        int calificacion2 = sc.nextInt();
        System.out.println("Ingrese calificacion 3");
        int calificacion3 = sc.nextInt();
        
        int total = calificacion1 + calificacion2 + calificacion3;
        System.out.println("la suma de las calificaciones es : "+total);
    }
}
