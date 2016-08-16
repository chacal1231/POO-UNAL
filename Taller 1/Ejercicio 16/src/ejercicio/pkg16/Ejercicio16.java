/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         
         //Lectura de número utilizando consola
         System.out.println("Por favor ingrese un número:");
         int num = Integer.parseInt(reader.nextLine());
         
         //Condicional para definir si el número es par o impar
         if(num%2==0){
             System.out.println("El número " + num + " es par");
         }else{
              System.out.println("El número " + num + " es impar");
         }
    }
    
}
