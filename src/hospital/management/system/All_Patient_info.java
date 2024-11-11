package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class All_Patient_info extends JFrame {

    All_Patient_info(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(90,156,163));
        table.setFont(new Font("Tahoma",Font.BOLD,11));
        panel.add(table);

        try{
            connection c = new connection();
            String q = "Select * from patient_info";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel label = new JLabel("ID");
        label.setBounds(31,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label1 = new JLabel("ID Number");
        label.setBounds(150,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label2 = new JLabel("Name");
        label.setBounds(270,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label3 = new JLabel("Gender");
        label.setBounds(360,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label4 = new JLabel("Patient Disease");
        label.setBounds(480,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label5 = new JLabel("Room No");
        label.setBounds(600,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label6 = new JLabel("Time");
        label.setBounds(700,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label7 = new JLabel("Deposite");
        label.setBounds(800,11,100,14);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JButton back = new JButton();
        back.setBounds(450,510,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(900,600);
        setLocation(300,160);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new All_Patient_info();
    }
}
