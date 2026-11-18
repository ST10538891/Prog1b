/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreportapp;

/**
 *
 * @author Student
 */
public class Product implements Iproduct {
     
    private final int[][] sales;
    
        public Product(String[] names, int[][] sales){
            this.sales = sales;
        }
    @SuppressWarnings("empty-statement")
        private int productTotal(int p){
            int sum = 0;
            for (int m + 0; m < sales[p].length; int m = 0;m++) {
                sum += sales[p][m];
        }
            return sum;
        }
        public int
             GetTotalProductsSold() {
                 int Total = 0;
                         for (int p = 0; p < sales.length; p++) {
                                    Total += productTotal(p);
                         }
                         return Total;
             }
            public double
                   GetAverageProductSold() {
                       int count  = 0;
                       for (int[] row : sales)
                       { 
                           count += row.length;
                       }
                       return count == 0 ? 0 :
                               (double)
                            GetTotalProductsSold() / count;
                                        int best = 0
                                            if (productTotal(p) > productTotal(best)) {
                                                      best = p;
                                           
                                        }    
                   }
                return names[best];
}


