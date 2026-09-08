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
public class LinkedListSample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> ll = new LinkedList();
        ll.add("DSA");
        ll.add("fun");
        ll.add(1, "is");
        ll.add("DSA");
        
        System.out.println("LinkedList "+ll);
        
        LinkedList ll2 = new LinkedList(ll);
        System.out.println("Linked List 2 "+ll2);
        ll2.add("Really?");
        System.out.println("Linked List 3 "+ll2);
        ll2.remove("DSA");
        System.out.println("Linked List 4 "+ll2);
        ll2.remove(3);
        System.out.println("Linked List 5 "+ll2);
        ll2.clear();
        System.out.println("Linked List 6 "+ll2); 
        System.out.println(ll2.size());
        
    }
    
}
