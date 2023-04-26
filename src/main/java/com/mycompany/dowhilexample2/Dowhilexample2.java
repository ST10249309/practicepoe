/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhilexample2;
import java.util.Scanner;
/**
 *
 * @author mahar
 */
public class Dowhilexample2 {

    public static void main(String[] args) {
        String answer;
        
        do{
       Scanner keyboard = new Scanner(System.in);
       
        System.out.println("Enter the price:   ");
               double price = keyboard.nextDouble();
               
             System.out.println("Enter the qty:  ");
             int qty = keyboard.nextInt();
             double total = price * qty;
             System.out.println("The total is R"+ total);
             System.out.println("Do you want the calculate another total? Yes or NO");
             answer= keyboard.next();
        } while (answer.equalsIgnoreCase("yes")) ;            
            
        }
             
             
    
}
