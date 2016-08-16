/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lectura de datos de la consola
        Scanner reader = new Scanner(System.in);
        //Lectura de usuario
        while(true){
        System.out.print("Ingrese su usuario: ");
        String username=(reader.nextLine());
        //Lectura de contraseña
        System.out.print("Ingrese su contraseña: ");
        String password = reader.nextLine();
        
        if(username.equals("Alex") && password.equals("mightyducks") || (username.equals("emily") && password.equals("cat"))){
            System.out.println("Bienvenid@ " + username);
            break;
        }else{
            System.out.println("El usuario y/o contraseña ingresado son invalidos");
        }
        }
       
    }
    
}
