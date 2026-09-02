/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsadit2_1;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class studentSample {
    
    private int studNumber;
    private String studName;
    
    studentSample(int studNumber, String studName){
        this.studNumber=studNumber;
        this.studName=studName;
        
    }
    
//    studentSample(){
//        
//    }
    
    
    public void setStudentNumber(int studNumber){
        
    }
    
    public int getStudentNumber(){
        return studNumber;
    }
    
    public void setStudentName(String studName){
        
    }
    
    public String getStudentName(){
        return studName;
    }
    
    public void displayeInfo(){
        System.out.println("Student Name "+studName);
        System.out.println("Student Number "+studNumber);
    }
    
    public void displayeInfo(String studName){
        System.out.println("Student Name "+studName);
        System.out.println("Student Number "+studNumber);
    }
    
    
}
