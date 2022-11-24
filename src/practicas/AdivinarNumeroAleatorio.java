/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author santi
 */
public class AdivinarNumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int aleatorio = ThreadLocalRandom.current().nextInt(1, 100);
        int numeroUsuario;
        do {
            System.out.println("Numero aleatorio listo!! adivinalo");
            System.out.print("Ingresa tu propuesta: ");
            numeroUsuario = sc.nextInt();
            if (aleatorio > numeroUsuario) {
                System.out.println("El número aleatorio es mayor que el introducido");
            } else if (aleatorio < numeroUsuario) {
                System.out.println("El número aleatorio es menor que el introducido");
            }
        } while (aleatorio != numeroUsuario);
        System.out.println("Has acertado, el número aleatorio fue: " + aleatorio);
    }
}
