
package com.warehouse.project.controller.warehouse.web;

import java.util.Scanner;

public class Working {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int a = in.nextInt();
      int b = in.nextInt();
      int tong = a + b;
      int hieu = a - b;
      int tich = a*b;
      int thuong = a/b;
      	 System.out.println("-------");
     	 System.out.println(tong);
         System.out.println(hieu);
         System.out.println(tich);
         System.out.println(thuong);
    }
}
