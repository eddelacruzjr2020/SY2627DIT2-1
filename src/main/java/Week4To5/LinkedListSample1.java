/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week4To5;

import java.util.LinkedList;





/**
 *
 * @author Edmundo Dela Cruz
 */
public class LinkedListSample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> ll = new LinkedList();
        ll.add("DSA");
        ll.add("fun");
        ll.add(1, "is");
        
        System.out.println("LinkedList "+ll);
        
        
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(2);
        ll1.add(3);
        ll1.addFirst(1);
        
        System.out.println("LinkedList 1 "+ll1);
    }
    
}
