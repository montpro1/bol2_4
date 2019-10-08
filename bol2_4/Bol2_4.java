/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_4;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Bol2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
         System.out.println("teclea el dinero a desglosar");
        int dinero=teclado.nextInt();
        int billetes1=dinero/100;
        System.out.println(+billetes1+" billetes de 100 euros");
       int billetes2=(dinero-(billetes1*100))/20;
        System.out.println(+billetes2+" billetes de 20 euros");
      int billetes3=((dinero-(billetes1*100+billetes2*20))/5);
      System.out.println(+billetes3+" billetes de 5 euros");
      int monedas1=((dinero-(billetes1*100+billetes2*20+billetes3*5))/1);
      System.out.println(+monedas1+" monedas de 1 euro");
      
      
              
       
       
       
        
    
        
       
     
    
       
               
        
                
                
        // TODO code application logic here
    }
    
}
