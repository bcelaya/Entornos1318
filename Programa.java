/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author bcelaya
 */
public class Programa{
public static void main(String [] args){
    System.out.println("VAMOS A JUGAR");
    Scanner scan = new Scanner (System.in);
    boolean jugar = true;
    while (jugar){
        double adivinar = Math.floor(Math.random()*10+1);
        System.out.print("Dime un número del 1 al 10: ");
        int num = scan.nextInt();
        if (num <= 0){
            System.out.println("Adios...");
            jugar = false;
        }
        if (num == adivinar)
            System.out.println("¡Acertaste! :D");
        else
            System.out.println("¡No! Era el " + adivinar);
        
        

    }
}
}