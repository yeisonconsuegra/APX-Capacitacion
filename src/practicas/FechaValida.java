/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class FechaValida {
    
    static public boolean validarFecha(String fecha) throws ParseException{
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
        
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        String fecha;
        boolean res=true;
        System.out.println("Dame el dia");
        String dia = sc.next();
        System.out.println("Dame el mes");
        String mes = sc.next();
        System.out.println("Dame el año");
        String anho = sc.next();
        System.out.println("");
        
        fecha = dia+"/"+mes+"/"+ anho;
        System.out.println(fecha);
        res = validarFecha(fecha);
        
        if(res==true){
            System.out.println("fecha correcta");
             }else{
                 System.out.println("fecha incorrecta");
         }
        
    }
}
