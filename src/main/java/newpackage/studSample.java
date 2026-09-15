/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class studSample {
    
    private int age;
    private String name;
    
    studSample(int age, String name){
        this.age=age;
        this.name=name;
        
    }
   
    studSample(){

    }

    public void setAge(int age){
        this.age=age;
    }
    
    public void setAge(String name){
        this.name=name;
    }
    
    public void setAge(){
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void displayInfo(){
        System.out.println("Name: "+name+ " Age: "+age);
    }
    
    

    
    
    
     

    
}
