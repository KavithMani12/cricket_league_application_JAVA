package com.javaDA;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class loginUsers extends JFrame implements ActionListener{
    private JPanel pannel;
    private JTextField userName;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;

    public loginUsers() {

        setBackground(new Color(169,169,169));
        setBounds(600,300,600,400);


        pannel = new JPanel();
        pannel.setBackground(new Color(176, 224, 230));
        setContentPane(pannel);
        pannel.setLayout(null);

        JLabel l = new JLabel("");


        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(124,89,95,24);
        pannel.add(l1);


        userName = new JTextField();
        userName.setBounds(210, 93, 157, 20);
        pannel.add(userName);


        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(124,124,95,24);
        pannel.add(l2);

        passwordField = new JPasswordField();
        passwordField.setBounds(210,128,157,20);
        pannel.add(passwordField);

        JLabel l3 = new JLabel("");
        l3.setBounds(377,79,46,34);
        pannel.add(l3);


        JLabel l4 = new JLabel("");
        l3.setBounds(377,124,46,34);
        pannel.add(l4);

        b1 = new JButton("Login");
        b1.addActionListener(this);
        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(250,250,210));
        b1.setBounds(149,181,113,39);
        pannel.add(b1);

        b2 = new JButton("SignUp");
        b2.addActionListener(this);
        b2.setForeground(new Color(139,69,19));
        b2.setBackground(new Color(255, 235, 205));
        b2.setBounds(289,181,113,39);
        pannel.add(b2);

        b3 = new JButton("Forgot password");
        b3.addActionListener(this);

        b3.setForeground(new Color(205, 92, 92));
        b3.setBackground(new Color(253, 245, 230));
        b3.setBounds(199, 231, 179, 39);
        pannel.add(b3);

        JLabel l5 = new JLabel("Trouble in Login?");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l5.setForeground(new Color(255, 0, 0));
        l5.setBounds(70, 240, 130, 20);
        pannel.add(l5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(176, 224, 230));
        panel2.setBounds(24, 40, 434, 263);
        pannel.add(panel2);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            Boolean status = false;
            try{
                conn con = new conn();
                String sql = "select * from admin where username=? and password=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1,userName.getText());
                st.setString(2,String.valueOf(passwordField.getPassword()));

                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    this.setVisible(false);
                    new Loading().setVisible(true);
                }else{
                    System.out.println("No record found");
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }


            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        if(e.getSource() == b2){
            setVisible(false);
            signUp su = new signUp();
            su.setVisible(true);
        }
        if(e.getSource() == b3){
            setVisible(false);
            Forgot forgot = new Forgot();
            forgot.setVisible(true);
        }

    }


}
