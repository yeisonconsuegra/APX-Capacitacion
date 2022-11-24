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
public class CuadradoDeUnNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cua = 0;
        System.out.print("Introduce un numero : ");
        int numero = sc.nextInt();
        
        while(numero>=0){
            cua = numero * numero;
            System.out.println("El cuadrado de "+numero+" es : "+cua);
            System.out.print("Introduce otro numero : ");
            numero = sc.nextInt();
        }
        System.out.println("Fin del programa");
    }
}
