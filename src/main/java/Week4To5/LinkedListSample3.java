/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week4To5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class LinkedListSample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Integer> collect = new ArrayList<>();
        collect.add(100);
        collect.add(200);  
      
        LinkedList<String> ll = new LinkedList(collect);
        ll.add("DSA");
        System.out.println("Linked list is "+ll);
        
        LinkedList<Boolean> ll1 = new LinkedList(ll);
        ll1.add(Boolean.TRUE);
        ll1.add(Boolean.FALSE);
        System.out.println("Linked List 1 "+ll1);
        
        
    }
    
}
