package com.javaDA;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable{

    private JPanel contentPanel;
    private JProgressBar progressBar;
    Connection conn;
    int s;
    Thread th;

    public void setUploading(){
        setVisible(false);
        th.start();
    }

    public void run(){
        try{
          for(int i=0;i<200;i++){
              s=s+1;
              int m = progressBar.getMaximum();
              int v =progressBar.getValue();
              if(v<m){
                  progressBar.setValue(progressBar.getValue()+1);
              }else{
                  i=201;
                  setVisible(false);
                  new Home().setVisible(true);
              }
              Thread.sleep(50);
          }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Loading(){
        super("Loading");
        th = new Thread((Runnable) this);

        setBounds(600,300,600,400);
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.BLACK);
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        JLabel vitPremierLeague = new JLabel("Vit CLeague2022");
        vitPremierLeague.setForeground(new Color(72, 209, 204));
        vitPremierLeague.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        vitPremierLeague.setBounds(130, 46, 500, 35);
        contentPanel.add(vitPremierLeague);

        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
        progressBar.setStringPainted(true);
        progressBar.setBounds(130, 135, 300, 25);
        contentPanel.add(progressBar);

        JLabel lblNewLabel2 = new JLabel("Please Wait....");
        lblNewLabel2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        lblNewLabel2.setForeground(new Color(160, 82, 45));
        lblNewLabel2.setBounds(200, 165, 150, 20);
        contentPanel.add(lblNewLabel2);


        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 590, 390);
        contentPanel.add(panel);

        setUploading();

    }

}
