package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {


    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(2,160,1400,670);
        panel.setBackground(new Color(109,164,170));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(2,5,1400,150);
        panel1.setBackground(new Color(109,164,170));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Untitled design.png"));
        Image image = i1.getImage().getScaledInstance(225,250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1110,0,250,250);
        panel1.add(label);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/ambulance.png"));
        Image image1 = i3.getImage().getScaledInstance(250,100,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i4);
        label1.setBounds(820,50,300,100);
        panel1.add(label1);
         
        JButton btn1 = new JButton("Add New Patient");
        btn1.setBounds(30,10,200,30);
        btn1.setBackground(new Color(246,215,118));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new New_Patient();
            }
        });

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30,45,200,30);
        btn2.setBackground(new Color(246,215,118));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(30,80,200,30);
        btn3.setBackground(new Color(246,215,118));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();
            }
        });

        JButton btn4 = new JButton("All Employee Info");
        btn4.setBounds(30,115,200,30);
        btn4.setBackground(new Color(246,215,118));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_info();
            }
        });

        JButton btn5 = new JButton("Patient Info");
        btn5.setBounds(240,10,200,30);
        btn5.setBackground(new Color(246,215,118));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new All_Patient_info();
            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(240,45,200,30);
        btn6.setBackground(new Color(246,215,118));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(240,80,200,30);
        btn7.setBackground(new Color(246,215,118));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(240,115,200,30);
        btn8.setBackground(new Color(246,215,118));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(450,10,200,30);
        btn9.setBackground(new Color(246,215,118));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(450,45,200,30);
        btn10.setBackground(new Color(246,215,118));
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setSize(1370,768);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {

        new Reception();
    }
}
