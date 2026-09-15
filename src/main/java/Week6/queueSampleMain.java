/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class queueSampleMain {
    
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Queue q = new PriorityQueue<>();
         q.add(123);
         q.add(123);
         q.add(333);
  
         
         System.out.println("Queue is "+q);
         
         Queue q2 = new LinkedList<>();
         q2.add("Ed");
         q2.add(123);
         q2.add(null);
  
         
         System.out.println("Queue 2 is "+q2);
//         q.remove();
//         System.out.println("Queue 1 is "+q);

        Queue q3 = new PriorityBlockingQueue();
        q3.add("Ed");
        q3.add("123");
        q3.add("null");
        
        System.out.println("Queue 3 is "+q3);
         
         
    }
    
}
