/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

import java.util.Stack;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class stackSampleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack s1 = new Stack();
        s1.push("Ed");
        s1.push(123);
        s1.push(true);
        s1.push(3.0003f);
        s1.push(null);
        s1.push("DSA");
        
        System.out.println("Stack is "+s1);
        
        System.out.println("Peek is "+s1.peek());
        System.out.println(s1);
//        System.out.println(s1.pop());
        System.out.println("Stack 2 is "+s1);
        System.out.println(s1.empty());
        
        System.out.println(s1.search("DSA"));
        System.out.println(s1.get(0));
        s1.add("End");
        System.out.println("Stack 3 is "+s1);
        
        
        
        
    }
    
}
