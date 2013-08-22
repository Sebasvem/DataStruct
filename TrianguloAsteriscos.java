/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloasteriscos;

/**
 *
 * @author Sebastian
 */
import java.util.Scanner;
public class TrianguloAsteriscos {

    
    public static void main(String[] args) {
         System.out.println("**************************** Triangulo De Asteriscos ***************************");
    int x;
    boolean flag=true;
    String a;
    do{
        System.out.println("Type a Number: ");
        Scanner p=new Scanner(System.in);
    
        x=p.nextInt(); 
    
    for(int i=0; i<x; i++)          
    {
     if(i<x)                      
     {
      for(int j=1; j<x-i; j++)
      {
          System.out.print(" ");                   
      }
      for(int j=0; j<i+1; j++)         
      {
          System.out.print("* ");
      }
         System.out.println("");
     }
     }
        System.out.println("");
               
         System.out.println("Desea hacerlo otraves s/n: ");
         a=p.next();
         if(a.equals("s")){
              flag=true;    
                  }else{
                        flag=false;
                        }
                        System.out.println("");
            
       }while(flag);
    }
}
