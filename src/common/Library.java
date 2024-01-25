/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author LAPTOP ACER
 */
public class Library {
     Scanner sc = new Scanner(System.in);
      public float getFloat(String msg) {
        float number;
        while (true) {
            try {
                System.out.println(msg + ": ");
                number = Float.parseFloat(sc.nextLine());
                if(number>0){
                    break;
                } else {
                    System.out.println("Not sastify the condition");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input a number only!!");
            }
        }
        return number;
    }
    public String getString(String msg) {
        System.out.println(msg + ": ");
        return sc.nextLine();
    }
   
}
