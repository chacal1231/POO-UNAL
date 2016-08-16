/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19;
import java.util.Scanner;
/**
 *
 * @author jesus
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lectura de edad utilizando la consola.
        System.out.println("Por favor ingrese su edad:");
        Scanner reader = new Scanner(System.in);
        int edad = Integer.parseInt(reader.nextLine());
        //Condicional para verificar edad
        if(edad > 0 && edad < 100){
            System.out.println("Su edad es valida.");
        }else{
            System.out.println("Su edad es invalida.");
        }
        
    }
    
}
