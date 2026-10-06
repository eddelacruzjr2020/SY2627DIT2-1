/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to8;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class binaryTree {
    
    node root;
    
    binaryTree(){
        root=null;
    }
    
    //Method to Add
    public void add(int value){
        root = addRecursive(root, value);
    }
    
    //Add Recursive Method
    public node addRecursive(node current, int value){
        if(current == null){
            return new node(value);
        }
        
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }
        
        return current;
    }
    
    public void transversalInOrder(node node){
        if(node !=null){
            transversalInOrder(node.left);
            System.out.println(" "+node.value);
            transversalInOrder(node.right);
        }
    }
    
    public void transversalPreOrder(node node){
        if(node !=null){
            System.out.println(" "+node.value);
            transversalPreOrder(node.left);
            transversalPreOrder(node.right);
        }
    }
    
    public void transversalPostOrder(node node){
        if(node !=null){
            transversalPostOrder(node.left);
            transversalPostOrder(node.right);
            System.out.println(" "+node.value);
        }
    }
    
}
