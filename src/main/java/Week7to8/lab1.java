/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class lab1 extends JFrame implements ActionListener{
    
    private JTextField txtInput;
    private DefaultListModel<String> listModel;
    private JList<String> listTask;
    private JScrollPane scrollPane;
    private JButton btnAdd, btnRemove, btnCompleted, btnClear;
    private LinkedList<String> linkedList;
    
    lab1(){
        setTitle("Lab 1 Activity");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txtInput = new JTextField();
        txtInput.setBounds(50, 50, 400, 30);
        add(txtInput);
        
        //FE
        listModel = new DefaultListModel<>();
        //BE
        linkedList = new LinkedList<>();
        
        //Jlist
        listTask = new JList<>(listModel);
        scrollPane = new JScrollPane(listTask);
        scrollPane.setBounds(50, 100, 400, 250);
        add(scrollPane);
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 400, 80, 30);
        add(btnAdd);
        
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(156, 400, 80, 30);
        add(btnRemove);
        
        btnCompleted = new JButton("Completed");
        btnCompleted.setBounds(262, 400, 80, 30);
        add(btnCompleted);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(368, 400, 80, 30);
        add(btnClear);
        
        //Add to ActionListener
        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        btnCompleted.addActionListener(this); 
        btnClear.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
            String task = txtInput.getText().trim();
            
            if(!task.isEmpty()){
                //Gagawin ko to pang hindi blanko
                listModel.addElement(task); //FE
                linkedList.add(task); //BE
                txtInput.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Enter task first before adding", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(e.getSource() == btnRemove){
            int indexSelected = listTask.getSelectedIndex();
            
            if(indexSelected != -1){
                //gagawin ko to if may ni select ako sa Jlist
                listModel.removeElementAt(indexSelected); //FE
                linkedList.remove(indexSelected); //BE
            }else{
                //gagawin ko to kapag walang ni select sa Jlist
                JOptionPane.showMessageDialog(this, "Select task first before removing", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }else if(e.getSource() == btnCompleted){
            int indexSelected = listTask.getSelectedIndex();
            if(indexSelected != -1){
                String completedTask = listTask.getSelectedValue() + "(Completed)";
                listModel.set(indexSelected, completedTask);
                listTask.setSelectedIndex(-1);
            }else{
                JOptionPane.showMessageDialog(this, "Select task first before completing", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnClear){
            listModel.clear();
            linkedList.clear();
        }
        
    }
    
}
