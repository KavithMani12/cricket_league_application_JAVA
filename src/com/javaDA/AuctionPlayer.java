package com.javaDA;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AuctionPlayer extends JFrame implements ActionListener{
    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    private JButton b1,b2,b3,b4;



    public AuctionPlayer() {
        setBounds(300, 200, 900, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Player_id");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setForeground(new Color(47, 79, 79));
        l1.setBounds(47, 63, 100, 23);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(47, 79, 79));
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(47, 97, 100, 23);
        contentPane.add(l2);

        JLabel l3 = new JLabel("department");
        l3.setForeground(new Color(47, 79, 79));
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(47, 131, 100, 23);
        contentPane.add(l3);

        JLabel l4 = new JLabel("regNo");
        l4.setForeground(new Color(47, 79, 79));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(47, 165, 100, 23);
        contentPane.add(l4);

        JLabel l5 = new JLabel("LastMatch");
        l5.setForeground(new Color(47, 79, 79));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(47, 199, 100, 23);
        contentPane.add(l5);

        JLabel l6 = new JLabel("HostelBlock");
        l6.setForeground(new Color(47, 79, 79));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(47, 233, 100, 23);
        contentPane.add(l6);

        JLabel l7 = new JLabel("RoomNo");
        l7.setForeground(new Color(47, 79, 79));
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(47, 267, 100, 23);
        contentPane.add(l7);

        t1 = new JTextField();
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t1.setBounds(126, 66, 86, 20);
        contentPane.add(t1);

        b1 = new JButton("Search player");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(234, 59, 100, 30);

        contentPane.add(b1);

        t2 = new JTextField();
        t2.setEditable(false);
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t2.setBounds(126, 100, 208, 20);
        contentPane.add(t2);
        t2.setColumns(10);

        t3 = new JTextField();
        t3.setEditable(false);
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t3.setColumns(10);
        t3.setBounds(126, 131, 208, 20);
        contentPane.add(t3);

        t4 = new JTextField();
        t4.setEditable(false);
        t4.setForeground(new Color(47, 79, 79));
        t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setColumns(10);
        t4.setBounds(126, 168, 208, 20);
        contentPane.add(t4);

        t5 = new JTextField();
        t5.setEditable(false);
        t5.setForeground(new Color(47, 79, 79));
        t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t5.setColumns(10);
        t5.setBounds(126, 202, 208, 20);
        contentPane.add(t5);

        t6 = new JTextField();
        t6.setEditable(false);
        t6.setForeground(new Color(47, 79, 79));
        t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setColumns(10);
        t6.setBounds(126, 236, 208, 20);
        contentPane.add(t6);

        t7 = new JTextField();
        t7.setEditable(false);
        t7.setForeground(new Color(47, 79, 79));
        t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t7.setColumns(10);
        t7.setBounds(126, 270, 208, 20);
        contentPane.add(t7);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Auction-Player",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
        panel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.setBounds(10, 38, 345, 288);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        JLabel l8 = new JLabel("Team_id");
        l8.setForeground(new Color(47, 79, 79));
        l8.setFont(new Font("Tahoma", Font.BOLD, 14));
        l8.setBounds(384, 63, 100, 23);
        contentPane.add(l8);

        JLabel l9 = new JLabel("Coach name");
        l9.setForeground(new Color(47, 79, 79));
        l9.setFont(new Font("Tahoma", Font.BOLD, 14));
        l9.setBounds(384, 103, 100, 23);
        contentPane.add(l9);

        JLabel l10 = new JLabel("Team Name");
        l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Tahoma", Font.BOLD, 14));
        l10.setBounds(384, 147, 100, 23);
        contentPane.add(l10);

        JLabel l11 = new JLabel("collage name");
        l11.setForeground(new Color(47, 79, 79));
        l11.setFont(new Font("Tahoma", Font.BOLD, 14));
        l11.setBounds(384, 187, 100, 23);
        contentPane.add(l11);

        JLabel l12 = new JLabel("last time played");
        l12.setForeground(new Color(47, 79, 79));
        l12.setFont(new Font("Tahoma", Font.BOLD, 14));
        l12.setBounds(384, 233, 100, 23);
        contentPane.add(l12);

        JLabel l13 = new JLabel("current year");
        l13.setForeground(new Color(47, 79, 79));
        l13.setFont(new Font("Tahoma", Font.BOLD, 14));
        l13.setBounds(384, 284, 100, 23);
        contentPane.add(l13);


        t8 = new JTextField();
        t8.setForeground(new Color(47, 79, 79));
        t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t8.setColumns(10);
        t8.setBounds(508, 66, 86, 20);
        contentPane.add(t8);

        b2 = new JButton("Search Team");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        contentPane.add(b2);

        t9 = new JTextField();
        t9.setForeground(new Color(47, 79, 79));
        t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t9.setEditable(false);
        t9.setColumns(10);
        t9.setBounds(508, 106, 208, 20);
        contentPane.add(t9);

        t10 = new JTextField();
        t10.setForeground(new Color(47, 79, 79));
        t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t10.setEditable(false);
        t10.setColumns(10);
        t10.setBounds(508, 150, 208, 20);
        contentPane.add(t10);

        t11 = new JTextField();
        t11.setForeground(new Color(47, 79, 79));
        t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t11.setEditable(false);
        t11.setColumns(10);
        t11.setBounds(508, 190, 208, 20);
        contentPane.add(t11);

        t12 = new JTextField();
        t12.setForeground(new Color(47, 79, 79));
        t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t12.setEditable(false);
        t12.setColumns(10);
        t12.setBounds(508, 236, 208, 20);
        contentPane.add(t12);

        t13 = new JTextField();
        t13.setForeground(new Color(47, 79, 79));
        t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t13.setEditable(false);
        t13.setColumns(10);
        t13.setBounds(508, 286, 208, 20);
        contentPane.add(t13);


        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "Team-Details",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
        panel_1.setForeground(new Color(0, 100, 0));
        panel_1.setBounds(360, 38, 378, 372);
        panel_1.setBackground(Color.WHITE);
        contentPane.add(panel_1);

        JLabel l15 = new JLabel(" Date of Issue :");
        l15.setForeground(new Color(105, 105, 105));
        l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l15.setBounds(20, 340, 118, 26);
        contentPane.add(l15);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        contentPane.add(dateChooser);

        b3 = new JButton("Auction Player");
        b3.addActionListener(this);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b3.setBounds(47, 377, 118, 33);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.BLACK);
        contentPane.add(b3);

        b4 = new JButton("Back");
        b4.addActionListener(this);
        b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b4.setBounds(199, 377, 100, 33);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.BLACK);
        contentPane.add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        conn con = new conn();
        if(e.getSource()==b1){
            String sql = "select * from players where player_id=?";
            try {
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    t2.setText(rs.getString("Name"));
                    t3.setText(rs.getString("department"));
                    t4.setText(rs.getString("regNo"));
                    t5.setText(rs.getString("LastMatch"));
                    t6.setText(rs.getString("hostelBloack"));
                    t7.setText(rs.getString("roomNo"));
                }
                st.close();
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(e.getSource()==b2){
            String sql = "select * from team where team_id=?";
            try {
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, t8.getText());
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    t9.setText(rs.getString("c_name"));
                    t10.setText(rs.getString("team_name"));
                    t11.setText(rs.getString("collage_name"));
                    t12.setText(rs.getString("last_time_played"));
                    t13.setText(rs.getString("current_year"));
                }
                st.close();
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if(e.getSource() == b4){
            this.setVisible(false);
            new Home().setVisible(true);
        }

        if(e.getSource() == b3){
            String sql = "insert into AuctionPlayer(players_id,team_id,pname,tname,cname,dateOfIssue) values(?,?,?,?,?,?)";
            try {
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1,t1.getText());
                st.setString(2,t8.getText());
                st.setString(3, t2.getText());
                st.setString(4, t10.getText());
                st.setString(5, t9.getText());
                DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
                st.setString(6, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                int i = st.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully assigned Player..!");
                    this.setVisible(false);
                    new Home().setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(null, "error");



            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
