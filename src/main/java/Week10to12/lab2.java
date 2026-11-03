/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10to12;

/**
 *
 * @author Edmundo Dela Cruz
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class lab2 extends JFrame implements ActionListener{
    private Queue<String> queue;
    private JTextField txtCustomerName;
    private JButton btnAddCustomer, btnServeCustomer, btnShowQueue;
    private JList<String> customerList;
    private DefaultListModel<String> listModel;


    public lab2() {
        // Initialize components
        queue = new LinkedList<>();
        listModel = new DefaultListModel<>();

        // Frame settings
        setTitle("Customer Service Queue Manager");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Customer name input field
        JLabel lblCustomerName = new JLabel("Customer Name:");
        lblCustomerName.setBounds(20, 20, 120, 30);
        add(lblCustomerName);

        txtCustomerName = new JTextField();
        txtCustomerName.setBounds(170, 20, 300, 30);
        add(txtCustomerName);

        // Button to add a customer (left side)
        btnAddCustomer = new JButton("Add Customer");
        btnAddCustomer.setBounds(20, 70, 140, 30);
        add(btnAddCustomer);

        // Button to serve the next customer (left side)
        btnServeCustomer = new JButton("Serve Customer");
        btnServeCustomer.setBounds(20, 110, 140, 30);
        add(btnServeCustomer);

        // Button to show the current queue of customers (left side)
        btnShowQueue = new JButton("Show Queue");
        btnShowQueue.setBounds(20, 150, 140, 30);
        add(btnShowQueue);

        // List to display the customers
        customerList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(customerList);
        scrollPane.setBounds(170, 70, 300, 180);
        add(scrollPane);
        
        //Add to ActionListener
        btnAddCustomer.addActionListener(this); 
        btnServeCustomer.addActionListener(this); 
        btnShowQueue.addActionListener(this); 
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddCustomer){
            String customerName = txtCustomerName.getText().trim();
            if(!customerName.isEmpty()){
                //Kung may laman ang text field ko gagawin ko to
                queue.offer(customerName); //BE
                txtCustomerName.setText("");
                JOptionPane.showMessageDialog(this, "Customer added to the queue : "+customerName);  
            }else{
                //kung walang laman and text field ko gagawin ko to
                JOptionPane.showMessageDialog(this, "Please enter a customer name", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }else if(e.getSource() == btnServeCustomer){
            if(!queue.isEmpty()){
                //gagawin ko to pag may laman ang aking queue
                String servingCustomer = queue.poll();
                JOptionPane.showMessageDialog(this, "Serving customer : "+servingCustomer);
            }else{
                 //gagawin ko to pag walang laman ang aking queue
                 JOptionPane.showMessageDialog(this, "No Customer in Queue", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(e.getSource() == btnShowQueue){
            listModel.clear();
            if(!queue.isEmpty()){
                //gagawin ko to pag may laman ang aking queue
                for(String customerQueue: queue){
                    listModel.addElement(customerQueue);
                }
              
            }else{
                //gagawin ko to pag walang laman ang aking queue 
                JOptionPane.showMessageDialog(this, "No Customer in Queue", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

  

}

