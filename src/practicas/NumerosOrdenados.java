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
public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        System.out.println("Dame le primer numero");
        num1 = sc.nextInt();
        System.out.println("Dame le segundo numero");
        num2 = sc.nextInt();
        System.out.println("Dame le tercer numero");
        num3 = sc.nextInt();
        
        if(num1 >0 && num2 > 0 && num3 > 0){
            if(num1 > num2 && num2 > num3){
                System.out.println("numeros ordenados de mayor a menor : "+num1+" "+num2+" "+num3);
            }else if(num1 > num3 && num3 > num2){
                System.out.println("numeros ordenados de mayor a menor : "+num1+" "+num3+" "+num2);
            }else if(num2 > num1 && num1 > num3){
                System.out.println("numeros ordenados de mayor a menor : "+num2+" "+num1+" "+num3);
            }else if(num2 > num3 && num3 > num1){
                System.out.println("numeros ordenados de mayor a menor : "+num2+" "+num3+" "+num1);
            }else if(num3 > num2 && num2 > num1){
                System.out.println("numeros ordenados de mayor a menor : "+num3+" "+num2+" "+num1);
            }else{
                System.out.println("numeros ordenados de mayor a menor : "+num3+" "+num1+" "+num2);
            }
        }
    }
}
