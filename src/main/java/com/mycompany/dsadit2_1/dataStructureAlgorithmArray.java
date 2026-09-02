/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsadit2_1;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class dataStructureAlgorithmArray {
    
    public static void main(String[] args) throws InterruptedException {
        String name1 = "Ed";
        String name2 = "DC";
        String name3= "Test";
        int age1 = 12;
        int age2 = 24;
        int age3 = 45;
        
        String[] names4 = new String[3];
        
        
        
        String[] names = new String[]{"Ed", "DC", "Test"};
        int[] ages = new int[]{12, 24, 45};
        int[] ages5 = {12, 24, 45};
        boolean[] isActive = new boolean[] {false, true};
        
        
        ages = new int[]{53};
        
        
        String[] names3 = new String[]{"Ed", "DC", "Test", "DSA"};
//        System.out.println(names3[2]);
        
        System.out.println(names3.length);
        for(int i=names3.length-1; i>=0; i--){
            Thread.sleep(1000);
            System.out.println("Names is "+names3[i]);
            
        }
    
     
        
        
        
    }
    
    
    
}
