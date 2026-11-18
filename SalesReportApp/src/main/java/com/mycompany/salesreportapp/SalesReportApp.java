/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreportapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class SalesReportApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] = names { "Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"}
        int months = 3;
        int[][] sales = new int[names.length][months];
        
                        for int(p = 0; p < names.length;p++) { 
                            for int(m = 0; m < months; m++){
                            int value = -1; while (value < 0){
                              
                               System.out.print("Enter number of sales month", + (m + 1) + "for"+ names[p] + ": ");
                                    if  (in.hasNextInt()) {
                                value = in.nextInt();
                                if (value < 0)
                                System.out.print("Value can not be negative");  
                            } else {
                                    System.out.print("Please Enter a whole number");  
                in.next();
                
                                    }
                                     }
                            sales[p][m] = value;
                  }
         }
                        IProduct product = new Product(names, sales); new PrintReport();
    }
}
