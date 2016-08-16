/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
        System.out.println("Ingrese la contraseña: ");
        String command = reader.nextLine();
        if (command.equals("carrot")) {
            System.out.println("El secreto es: jryy qbar!");
            break;
        }else{
            System.out.println("¡La contraseña es incorrecta!");
        }
       }


    }
    
}
