/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiDimensionArraySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        int[][] mutiDim = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        //int[i][j]
        
        for(int i=0; i<mutiDim.length; i++){
            for(int j=0; j<mutiDim[i].length; j++){
                System.out.println(mutiDim[i][j]+ " ");
                Thread.sleep(500);
                
            }
            System.out.println();
            
        }
           
        //1, 2, 3
        //4, 5, 6
        //7, 8, 9
                
                
    }
    
}
