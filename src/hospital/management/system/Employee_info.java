package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee_info extends JFrame implements ActionListener {
     Employee_info(){



         JPanel panel = new JPanel();
         panel.setBounds(5,5,990,590);
         panel.setBackground(new Color(90,156,163));
         panel.setLayout(null);
         add(panel);


         JTable table = new JTable();
         table.setBounds(10,34,980,450);
         table.setBackground(new Color(109,164,170));
         table.setFont(new Font("Tahoma",Font.BOLD,12));
         panel.add(table);

         try{
             connection c = new connection();
             String q = "select * from emp_info";
             ResultSet resultSet = c.statement.executeQuery(q);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));
         } catch (Exception e) {
             e.printStackTrace();
         }

         JLabel label = new JLabel("Name");
         label.setBounds(12,10,105,20);
         label.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label);

         JLabel label1 = new JLabel("Age");
         label1.setBounds(210,10,105,23);
         label1.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label1);

         JLabel label2 =new JLabel("Phone Number");
         label2.setBounds(405,10,105,23);
         label2.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label2);

         JLabel label3 = new JLabel("Salary");
         label3.setBounds(600,10,105,23);
         label3.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label3);

         JLabel label4 = new JLabel("Gmail");
         label4.setBounds(800,10,105,23);
         label4.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label4);

         JButton back = new JButton("Back");
         back.setBounds(400,500,120,30);
         setBackground(new Color(0,0,0));
         back.setForeground(Color.WHITE);
         panel.add(back);
         back.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 setVisible(false);
             }
         });

         setUndecorated(true);
         setSize(1000,600);
         setLocation(350,230);
         setLayout(null);
         setVisible(true);

    }
    public static void main(String[] args) {
        new Employee_info();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
