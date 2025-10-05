/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

import java.util.Scanner;

/**
 * name abdulelah ayman
 * id 447007544
 *  Group:11
 */
public class Ex1 {
  public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   
    System.out.println("Enter a Fahrehit degree:");
    double DegreeF = in.nextDouble();
        
    double DegreeC = (DegreeF - 32.0) * 5/9;
        
    System.out.println(DegreeF+ "Degree in Fahrehit is equal to ="+DegreeC +" In celius");
     
      
      
      
      
  }
    
}
