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
public class LeerCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String letra = "";
        
        System.out.println("Dame una letra nada mas...");
        letra = sc.nextLine();
        if(letra.equals(letra.toUpperCase())){
            System.out.println("Es letra mayuscula");
        }else{
            System.out.println("Es letra minuscula");
        }
    }
}
