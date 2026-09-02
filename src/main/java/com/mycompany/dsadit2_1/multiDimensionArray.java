/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.dsadit2_1;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class multiDimensionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int[][] mutiDimArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}  
        };
        
        
        // [0, 0 ]
        int [] singleDimArray = {1, 2, 3};
        
        System.out.println(singleDimArray[3]);
        
        for(int i=0; i<mutiDimArray.length; i++){
            for(int j=0; j<mutiDimArray[i].length; j++){
                System.out.println(mutiDimArray[i][j]);
                Thread.sleep(1000);
            }
            
            System.out.println();
            
        }
    }
    
}
