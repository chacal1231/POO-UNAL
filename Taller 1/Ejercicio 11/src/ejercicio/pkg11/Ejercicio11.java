/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;
import java.util.Scanner;


/**
 *
 * @author jesus
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        //Lectura de números por consola
        int num_1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Ingrese el segundo número");
        int num_2 = Integer.parseInt(reader.nextLine());
        //Condicional para ver el mayor de los dos números
        if(num_1>num_2){
            System.out.println("El mayor número ingresado es " + num_1);
        }else{
            System.out.println("El número mayor ingresado es " + num_2);
        }
          
    }
    
}
