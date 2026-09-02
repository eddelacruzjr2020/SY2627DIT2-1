/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsadit2_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/**
 *
 * @author Edmundo Dela Cruz
 */
public class mcDollibee extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblBurger, lblFries, lblSoda, lblBurgerCount, lblFriesCount, lblSodaCount;
    private JButton btnAddBurger, btnMinusBurger, btnAddFries, btnMinusFries, btnAddSoda, btnMinusSoda, btnReviewOrder, btnResetOrder;
    private JComboBox<String> cmbBurger, cmbFries, cmbSoda;
    private JTextArea txaSummary;
    private static final String[] sizes = {"Small", "Medium", "Large"};
    private int intBurger = 0;
    private int intFries = 0;
    private int intSoda = 0;
    
    mcDollibee(){
        setSize(600, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Setting of header
        lblHeader = new JLabel("McDollibee", SwingConstants.CENTER);
        lblHeader.setBounds(0, 10, 600, 30);
        add(lblHeader);
        
        //Setting of label Burger
        lblBurger = new JLabel("Burger:");
        lblBurger.setBounds(50, 50, 100, 30);
        add(lblBurger);
        
        lblBurgerCount = new JLabel("0");
        lblBurgerCount.setBounds(170, 50, 30, 30);
        add(lblBurgerCount);
        
         //Setting of label Fries
        lblFries = new JLabel("Fries:");
        lblFries.setBounds(50, 100, 100, 30);
        add(lblFries);
        
        lblFriesCount = new JLabel("0");
        lblFriesCount.setBounds(170, 100, 30, 30);
        add(lblFriesCount);
        
         //Setting of label Soda
        lblSoda = new JLabel("Soda:");
        lblSoda.setBounds(50, 150, 100, 30);
        add(lblSoda);
        
        lblSodaCount = new JLabel("0");
        lblSodaCount.setBounds(170, 150, 30, 30);
        add(lblSodaCount);
        
        //Adding of add and minus buttons for Burger
        btnAddBurger = new JButton("+");
        btnAddBurger.setBounds(220, 50, 50, 30);
        add(btnAddBurger);
        
        btnMinusBurger = new JButton("-");
        btnMinusBurger.setBounds(290, 50, 50, 30);
        add(btnMinusBurger);
        
        //Adding of add and minus buttons for Fries
        btnAddFries = new JButton("+");
        btnAddFries.setBounds(220, 100, 50, 30);
        add(btnAddFries);
        
        btnMinusFries = new JButton("-");
        btnMinusFries.setBounds(290, 100, 50, 30);
        add(btnMinusFries);
        
        //Adding of add and minus buttons for Soda
        btnAddSoda = new JButton("+");
        btnAddSoda.setBounds(220, 150, 50, 30);
        add(btnAddSoda);
        
        btnMinusSoda = new JButton("-");
        btnMinusSoda.setBounds(290, 150, 50, 30);
        add(btnMinusSoda);
        
        //Adding combo box for Burger
        cmbBurger = new JComboBox<>(sizes);
        cmbBurger.setBounds(380, 50, 100, 30);
        add(cmbBurger);
        
        //Adding combo box for Fries
        cmbFries = new JComboBox<>(sizes);
        cmbFries.setBounds(380, 100, 100, 30);
        add(cmbFries);
        
        //Adding combo box for Soda
        cmbSoda = new JComboBox<>(sizes);
        cmbSoda.setBounds(380, 150, 100, 30);
        add(cmbSoda);
        
        //Adding of Review and Reset button
        btnReviewOrder = new JButton("Review Order");
        btnReviewOrder.setBounds(50, 200, 150, 30);
        add(btnReviewOrder);
        
        btnResetOrder = new JButton("Reset Order");
        btnResetOrder.setBounds(220, 200, 150, 30);
        add(btnResetOrder);
        
        txaSummary = new JTextArea();
        txaSummary.setBounds(50, 250, 500, 200);
        add(txaSummary);
        txaSummary.setEditable(false);
        
        //Add buttons to ActionListener
        btnAddBurger.addActionListener(this);
        btnMinusBurger.addActionListener(this);
        btnAddFries.addActionListener(this);
        btnMinusFries.addActionListener(this);
        btnAddSoda.addActionListener(this);
        btnMinusSoda.addActionListener(this);
        btnReviewOrder.addActionListener(this);
        btnResetOrder.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddBurger){
            intBurger++;
            lblBurgerCount.setText(String.valueOf(intBurger));   
        }else if(e.getSource() == btnMinusBurger){
            if(intBurger > 0){
                intBurger--;
                lblBurgerCount.setText(String.valueOf(intBurger));   
            }
        }else if(e.getSource() == btnAddFries){
            intFries++;
            lblFriesCount.setText(String.valueOf(intFries));   
        }else if(e.getSource() == btnMinusFries){
            if(intFries > 0){
                intFries--;
                lblFriesCount.setText(String.valueOf(intFries));   
            }
        }else if(e.getSource() == btnAddSoda){
            intSoda++;
            lblSodaCount.setText(String.valueOf(intSoda));   
        }else if(e.getSource() == btnMinusSoda){
            if(intSoda > 0){
                intSoda--;
                lblSodaCount.setText(String.valueOf(intSoda));   
            }
        }else if(e.getSource() == btnReviewOrder){
            double totalCost = 0.00;
            totalCost+=calculateCost(intBurger, (String) cmbBurger.getSelectedItem());
            totalCost+=calculateCost(intFries, (String) cmbFries.getSelectedItem());
            totalCost+=calculateCost(intSoda, (String) cmbSoda.getSelectedItem());
            
            txaSummary.setText("Burger ("+cmbBurger.getSelectedItem()+"): "+intBurger+"\n" +
                               "Fries ("+cmbFries.getSelectedItem()+"): "+intFries+"\n" +
                               "Soda ("+cmbSoda.getSelectedItem()+"): "+intSoda+"\n" +
                               "Total Cost: $"+totalCost);
        }else if(e.getSource() == btnResetOrder){
            txaSummary.setText("");
            intBurger = 0;
            lblBurgerCount.setText(String.valueOf(intBurger));
            
            intFries = 0;
            lblFriesCount.setText(String.valueOf(intFries));
            
            intSoda = 0;
            lblSodaCount.setText(String.valueOf(intSoda));
            
            cmbBurger.setSelectedIndex(0);
            cmbFries.setSelectedIndex(0);
            cmbSoda.setSelectedIndex(0);
            
        }
    }
    
    private double calculateCost(int count, String size){
        double price = 0.0;
        switch(size){
            case "Small" -> price = 5.00;
            case "Medium" -> price = 7.50;
            case "Large" -> price = 10.00;
        }
        
        return count*price;
    }
    
}
