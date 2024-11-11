package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;

public class New_Patient extends JFrame implements ActionListener {

    JComboBox comboBox;
    JTextField textFieldNumber, textName, textFieldDisease,textFieldDeposite;
    JRadioButton r1, r2,r3;
    Choice c1;
    JLabel date;
    JButton b1,b2;

    New_Patient(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,1400,640);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/patient.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550,150,200,200);
        panel.add(label);

        JLabel labelname= new JLabel("New PATIENT FORM");
        labelname.setBounds(118,11,260,53);
        labelname.setFont(new Font("Tahoma", Font.BOLD,20));
        panel.add(labelname);

        JLabel labelId = new JLabel("ID : ");
        labelId.setBounds(35,76,200,14);
        labelId.setFont(new Font("Tahoma",Font.BOLD,14));
        labelId.setForeground(new Color(255, 255, 255));
        panel.add(labelId);

        comboBox = new JComboBox(new String[] {"Aadhar Card","Driving License","Voter Id"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox);

        JLabel labelnumber = new JLabel("Number :");
        labelnumber.setBounds(35,111,200,14);
        labelnumber.setFont(new Font("Tahoma",Font.BOLD,14));
        labelnumber.setForeground(Color.WHITE);
        panel.add(labelnumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel labelname1 = new JLabel("Name :");
        labelname1.setBounds(35,151,150,20);
        labelname1.setFont(new Font("Tahoma",Font.BOLD,14));
        labelname1.setForeground(Color.WHITE);
        panel.add(labelname1);

        textName = new JTextField();
        textName.setBounds(271,151,150,20);
        panel.add(textName);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,191,150,20);
        labelGender.setFont(new Font("Tahoma",Font.BOLD,14));
        labelGender.setForeground(Color.WHITE);
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setBounds(271,191,80,15);
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(109,164,170));
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setBounds(350,191,80,15);
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(109,164,170));
        panel.add(r2);

        r3 = new JRadioButton("Others");
        r3.setFont(new Font("Tahoma",Font.BOLD,14));
        r3.setBounds(430,191,80,15);
        r3.setForeground(Color.WHITE);
        r3.setBackground(new Color(109,164,170));
        panel.add(r3);

        JLabel labelDisease = new JLabel("Disease :");
        labelDisease.setBounds(35,231,200,14);
        labelDisease.setFont(new Font("Tahoma",Font.BOLD,14));
        labelDisease.setForeground(Color.WHITE);
        panel.add(labelDisease);

        textFieldDisease = new JTextField();
        textFieldDisease.setBounds(271,231,150,20);
        panel.add(textFieldDisease);

        JLabel labelRoom = new JLabel("Room :");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setFont(new Font("Tahoma",Font.BOLD,14));
        labelDisease.setForeground(Color.WHITE);
        panel.add(labelRoom);

        c1 = new Choice();
        try {
            connection c = new connection();
            ResultSet resultSet= c.statement.executeQuery("select * from Room");
            while (resultSet.next()){
                c1.add(resultSet.getString("Room_no"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);

        JLabel labelDate = new JLabel("Time :");
        labelDate.setBounds(35,316,200,14);
        labelDate.setFont(new Font("Tahoma",Font.BOLD,14));
        labelDate.setForeground(Color.WHITE);;
        panel.add(labelDate);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271,316,220,14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(date);

        JLabel labelDeposit = new JLabel("Deposite :");
        labelDeposit.setBounds(35,359,200,17);
        labelDeposit.setFont(new Font("Tahoma",Font.BOLD,14));
        labelDeposit.setForeground(Color.WHITE);
        panel.add(labelDeposit);

        textFieldDeposite = new JTextField();
        textFieldDeposite.setBounds(271,359,200,20);
        panel.add(textFieldDeposite);

        b1 = new JButton("Add");
        b1.setBounds(100,430,120,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(260,430,120,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        panel.add(b2);

        setUndecorated(true);

        setSize(850,550);
        setLayout(null);
        setLocation(300,250);
        setVisible(true);

    }

    public static void main(String[] args) {
        new New_Patient();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            connection c = new connection();
            String radioBTN = null;
            if (r1.isSelected()){
                radioBTN = "Male";
            }else if (r2.isSelected()){
                radioBTN = "Female";
            } else if (r3.isSelected()) {
                radioBTN = "Others";

            }
            String s1 = (String) comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textName.getText();
            String s4 = radioBTN;
            String s5 = textFieldDisease.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textFieldDeposite.getText();

            try {
                String q = "Insert into patient_info values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "update Room set Availability = 'Occupied' where Room_no = "+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Added Successfully");
                setVisible(false);


            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }
}
