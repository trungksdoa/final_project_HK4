/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

/**
 *
 * @author trung
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element  
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j] + arr[i]);
                       System.out.println(arr[j]);
                }
            }
        }
    }

}
