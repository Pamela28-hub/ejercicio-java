/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojava;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PAMELA GARCIA
 */
public class EjercicioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.UK);

        System.out.print("Ingrese cantidad de kilómetros");
        int kilometros = teclado.nextInt();
        System.out.print("Tipo de billete : a)Sencillo , b)Ida y vuelta ");
        teclado.next();
        String tipoBillete = teclado.nextLine();
        double precioBillete;
       
        if (tipoBillete.equalsIgnoreCase("a")) {
            precioBillete = 0.33;
            
        } else {
            precioBillete = 0.26;
            
        }
        
        double tarifa = precioBillete*kilometros;
        
        
        System.out.println("Tiene tarjeta interrail : a) si b)No");
        String tarjetainterra = teclado.nextLine();
        boolean sitieneIterrail = tarjetainterra.equalsIgnoreCase("a");
        double dto = 0;
        if (sitieneIterrail) {
            dto = 0.25;
            
            
        } else if (tarifa>110){
            dto = 0.10;
        }  else if (tarifa>50){
            dto = 0.5;
        }
        
        double tarifaTotal = tarifa - tarifa*dto;
        
        System.out.println("El precio del billete es "+tarifaTotal);
    }
    
}
