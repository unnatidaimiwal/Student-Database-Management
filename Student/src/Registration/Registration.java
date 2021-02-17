package Registration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.Menu;
import search.Search;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.ButtonGroup;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField rollno;
	private JTextField age;
	private JTextField email;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(228, 20, 416, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME         :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(38, 106, 163, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AGE            :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(38, 209, 163, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER    :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(38, 316, 163, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("YEAR         :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(38, 382, 163, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BRANCH    :");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setBounds(38, 265, 163, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("EMAIL ID  :");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(36, 458, 153, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("ADDRESS  :");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(38, 531, 153, 31);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 0, 102));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(113, 609, 124, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("ROLL NO    :");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8.setBounds(38, 156, 163, 31);
		contentPane.add(lblNewLabel_8);
				
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 20));
		name.setBounds(228, 106, 390, 31);
		contentPane.add(name);
		name.setColumns(10);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.BOLD, 20));
		rollno.setBounds(228, 156, 390, 31);
		contentPane.add(rollno);
		rollno.setColumns(10);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 20));
		age.setBounds(228, 209, 96, 31);
		contentPane.add(age);
		age.setColumns(10);
		
		JRadioButton cs = new JRadioButton("CS");
		cs.setForeground(Color.WHITE);
		cs.setBackground(new Color(255, 0, 102));
		buttonGroup.add(cs);
		cs.setFont(new Font("Tahoma", Font.BOLD, 25));
		cs.setBounds(238, 261, 60, 39);
		contentPane.add(cs);
		
		JRadioButton it = new JRadioButton("IT");
		it.setForeground(Color.WHITE);
		it.setBackground(new Color(255, 0, 102));
		buttonGroup.add(it);
		it.setFont(new Font("Tahoma", Font.BOLD, 25));
		it.setBounds(376, 261, 60, 39);
		contentPane.add(it);
		
		JRadioButton entc = new JRadioButton("ENTC");
		entc.setForeground(Color.WHITE);
		entc.setBackground(new Color(255, 0, 102));
		buttonGroup.add(entc);
		entc.setFont(new Font("Tahoma", Font.BOLD, 25));
		entc.setBounds(511, 261, 96, 39);
		contentPane.add(entc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "MALE", "FEMALE"}));
		comboBox.setBounds(228, 316, 142, 31);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "FIRST", "SECOND ", "THIRD", "FOURTH"}));
		comboBox_1.setBounds(228, 381, 142, 32);
		contentPane.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(384, 540, 5, 22);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textArea_1.setBounds(228, 520, 390, 57);
		contentPane.add(textArea_1);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.BOLD, 20));
		email.setColumns(10);
		email.setBounds(228, 458, 390, 31);
		contentPane.add(email);

		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","unnati123");
					
					String sql="insert into info values(?,?,?,?,?,?,?,?)";
							String year;
							String gender;
					gender=comboBox.getSelectedItem().toString();
					year=comboBox_1.getSelectedItem().toString();
					PreparedStatement pt=conn.prepareStatement(sql);
					
					pt.setString(2,name.getText());
					pt.setInt(1,Integer.parseInt(rollno.getText()));
					pt.setString(3,age.getText());
					String branch;
					if(cs.isSelected())
					branch=cs.getText();
					if(it.isSelected())
					branch=it.getText();
					else
				    branch=entc.getText();
				    pt.setString(4,branch);
					 pt.setString(5,gender);
					pt.setString(6,year);
					pt.setString(7,email.getText());
					pt.setString(8,textArea_1 .getText());
				    
					pt.executeUpdate();
				   JOptionPane.showMessageDialog(null,"[   Registration  sucessfully    ]");
				 
				
				   
				 
				        pt.close();  
				        conn.close();  
				         
				    } catch (SQLException | ClassNotFoundException a) {  
				        JOptionPane.showMessageDialog(null, a);  
				    }  
			
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 0, 102));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(439, 609, 140, 39);
		contentPane.add(btnNewButton_1);
		
		JLabel a = new JLabel("");
		a.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\STUDENT MANAGEMENT\\BG-reg.jpg"));
		a.setBounds(0, 0, 739, 699);
		contentPane.add(a);
	}
}
