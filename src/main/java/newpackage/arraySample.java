/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class arraySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String name1 = "Ed";
        String name2 = "Dela";
        String name3 = "Cruz";
        
        String[] names = new String[]{"Ed", "Dela", "Cruz"};
        boolean[] isActive = new boolean[]{true, false, true};
        
        int[ ]ages = new int[100]; 
        
        int intArray[] = new int[]{};
        //Condition
        
        intArray = new int[]{};
        
        System.out.println("Names "+names+" ");
        
        for(int i =0; i<names.length; i++){
            System.out.println("Ages are "+names[i]);
            Thread.sleep(500);
        }
        
    }
    
}
