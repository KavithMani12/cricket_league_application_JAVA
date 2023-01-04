package com.javaDA;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JButton b1,b2,b3,b4,b5,b6;



    public Home(){
        setBounds(400,150,1000,800);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menuBar.setBackground(Color.CYAN);
        menuBar.setBounds(0, 10, 1000, 35);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Exit");
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmLogout = new JMenuItem("Logout");
        mntmLogout.setBackground(new Color(211, 211, 211));
        mntmLogout.setForeground(new Color(105, 105, 105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.setForeground(new Color(105, 105, 105));
        mntmExit.setBackground(new Color(211, 211, 211));
        mntmExit.addActionListener(this);
        mnExit.add(mntmExit);

        JMenu mnHelp = new JMenu("Help");
        mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmReadme = new JMenuItem("AboutMe");
        mntmReadme.setBackground(new Color(211, 211, 211));
        mntmReadme.setForeground(new Color(105, 105, 105));
        mntmReadme.addActionListener(this);
        mnHelp.add(mntmReadme);


        JMenu mnRecord = new JMenu("Record");
        mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem playerdetails = new JMenuItem("Player Details");
        playerdetails.addActionListener(this);
        playerdetails.setBackground(new Color(211, 211, 211));
        playerdetails.setForeground(Color.DARK_GRAY);
        mnRecord.add(playerdetails);

        JMenuItem teamdetails = new JMenuItem("Team Details");
        teamdetails.setBackground(new Color(211, 211, 211));
        teamdetails.setForeground(Color.DARK_GRAY);
        teamdetails.addActionListener(this);
        mnRecord.add(teamdetails);

        menuBar.add(mnRecord);
        menuBar.add(mnHelp);
        menuBar.add(mnExit);

        JLabel l1 = new JLabel("VIT CLeaugue2022");
        l1.setForeground(new Color(204, 51, 102));
        l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
        l1.setBounds(268, 30, 701, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        java.net.URL imageURL1 = Home.class.getResource("icons/addPlayer.png");
        ImageIcon i1  = new ImageIcon(imageURL1);
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(60, 140, 159, 152);
        contentPane.add(l2);

        JLabel l3 = new JLabel("");
        java.net.URL imageURL2 = Home.class.getResource("icons/statestics.png");
        ImageIcon i4  = new ImageIcon(imageURL2);
        Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(300, 160, 134, 128);
        contentPane.add(l3);

        JLabel l4 = new JLabel("");
        java.net.URL imageURL3 = Home.class.getResource("icons/team.png");
        ImageIcon i7  = new ImageIcon(imageURL3);
        Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(530, 140, 225, 152);
        contentPane.add(l4);

        b1 = new JButton("Add Players");
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLACK);
        b1.setBounds(60, 320, 159, 44);
        contentPane.add(b1);

        b2 = new JButton("Statistics");
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        b2.setBounds(313, 320, 139, 44);
        contentPane.add(b2);

        b3 = new JButton("Add Teams");
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.BLACK);
        b3.setBounds(562, 320, 167, 44);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(20, 120, 750, 260);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        b4 = new JButton("Auction Player");
        b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.BLACK);
        b4.setBounds(76, 620, 143, 41);
        contentPane.add(b4);

        b5 = new JButton("Remove Player");
        b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.BLACK);
        b5.setBounds(310, 620, 159, 41);
        contentPane.add(b5);

        b6 = new JButton("Schedule Match");
        b6.addActionListener(this);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.BLACK);
        b6.setBounds(562, 620, 159, 41);
        contentPane.add(b6);

        JLabel l5 = new JLabel("");
        java.net.URL imageURL4 = Home.class.getResource("icons/auction.png");
        ImageIcon i10  = new ImageIcon(imageURL4);
        Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(60, 440, 159, 163);
        contentPane.add(l5);

        JLabel l6 = new JLabel("");
        java.net.URL imageURL5 = Home.class.getResource("icons/addPlayer.png");
        ImageIcon i13  = new ImageIcon(imageURL5);
        Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(332, 440, 139, 152);
        contentPane.add(l6);

        JLabel l7 = new JLabel("");
        java.net.URL imageURL6 = Home.class.getResource("icons/schedule.png");
        ImageIcon i16  = new ImageIcon(imageURL6);
        Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(562, 440, 157, 152);
        contentPane.add(l7);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "Action", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(233, 150, 122)));
        panel2.setBounds(20, 420, 750, 270);
        panel2.setBackground(Color.WHITE);
        contentPane.add(panel2);

        getContentPane().setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();

        if(msg.equals("Logout")){
            System.out.println(msg);
            setVisible(false);
            new loginUsers().setVisible(true);
        }else if(msg.equals("Exit")){
            System.exit(ABORT);
        }else if(msg.equals("Player Details")){
            System.out.println(msg);
            setVisible(false);
            new playerDetails().setVisible(true);
        }else if(msg.equals("Team Details")){
            System.out.println(msg);
            setVisible(false);
            new teamDetails().setVisible(true);
        }else if(msg.equals("AboutMe")){
            System.out.println(msg);
            setVisible(false);
            new AboutMe().setVisible(true);
        }
        else{
            System.out.println("Select correct option ");
        }
        if(e.getSource()==b1){
            this.setVisible(false);
            new AddPlayer().setVisible(true);
        }
        if(e.getSource()==b2){
            this.setVisible(false);
            new statistics().setVisible(true);
        }
        if(e.getSource()==b3){
            this.setVisible(false);
            new AddTeam().setVisible(true);
        }
        if(e.getSource()==b4){
            this.setVisible(false);
            new AuctionPlayer().setVisible(true);
        }
        if(e.getSource()==b5){
            this.setVisible(false);
            new RemovePlayer().setVisible(true);
        }
        if(e.getSource()==b6){
            this.setVisible(false);
            new ScheduleMatch().setVisible(true);
        }

    }


}
