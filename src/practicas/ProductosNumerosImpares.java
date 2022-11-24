/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

/**
 *
 * @author santi
 */
public class ProductosNumerosImpares {
    public static void main(String[] args) {
        
        int contador1 = 1;
        int i = 0;
        int j = 1;
        for (j=1; j <= 10; j++) {
            if (j % 2 !=0) {
                contador1 *=j;
            }
        }
        System.out.println(contador1);
}
}
