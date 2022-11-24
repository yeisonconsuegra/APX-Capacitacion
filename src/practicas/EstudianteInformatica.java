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
public class EstudianteInformatica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int participacion = 0 ;
        int primerExamen = 0;
        int segundoExamen = 0;
        int examenFinal = 0;
        int notaTotal = 0;
        
        System.out.println("LA NOTA MAXIMA ES DE 100");
        System.out.println("");
        System.out.println("¿Cual es tu nota en participacion en clase?");
        participacion = (sc.nextInt() * 10) / 100;
        System.out.println("¿Cuantos sacastes en tu primer examen?");
        primerExamen = (sc.nextInt() * 25) / 100;
        System.out.println("¿Cuantos sacastes en tu segundo examen?");
        segundoExamen = (sc.nextInt() * 25) / 100;
        System.out.println("¿Cuantos sacastes en el examen final");
        examenFinal = (sc.nextInt() * 40) / 100;
        System.out.println("");
        
        notaTotal = participacion + primerExamen + segundoExamen + examenFinal;
        System.out.println("Tu nota total es de : "+notaTotal);
    }
}
