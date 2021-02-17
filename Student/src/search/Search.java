package search;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.Menu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField name;
	private JTextField age;
	private JTextField email;
	private JTextField branch;
	private JTextField gender;
	private JTextField year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 757, 780);
		contentPane.add(panel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(384, 540, 5, 22);
		panel.add(textArea);
		
		JLabel label_1 = new JLabel("ROLL NO    :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBounds(158, 77, 163, 31);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(348, 79, 184, 31);
		panel.add(textField);
		
		JLabel label_2 = new JLabel("NAME         :");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_2.setBounds(72, 209, 163, 31);
		panel.add(label_2);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 20));
		name.setColumns(10);
		name.setBounds(262, 209, 351, 31);
		panel.add(name);
		
		JLabel label_3 = new JLabel("AGE            :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_3.setBounds(72, 271, 163, 31);
		panel.add(label_3);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 20));
		age.setColumns(10);
		age.setBounds(262, 271, 96, 31);
		panel.add(age);
		
		JLabel label_4 = new JLabel("BRANCH    :");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_4.setBounds(72, 327, 163, 31);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("GENDER    :");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_5.setBounds(72, 378, 163, 31);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("YEAR         :");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_6.setBounds(72, 444, 163, 31);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("EMAIL ID  :");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_7.setBounds(70, 520, 153, 31);
		panel.add(label_7);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.BOLD, 20));
		email.setColumns(10);
		email.setBounds(262, 520, 351, 31);
		panel.add(email);
		
		JLabel label_8 = new JLabel("ADDRESS  :");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_8.setBounds(72, 593, 153, 31);
		panel.add(label_8);
		
		JTextArea address = new JTextArea();
		address.setFont(new Font("Tahoma", Font.BOLD, 20));
		address.setBounds(262, 582, 351, 57);
		panel.add(address);
		
		JLabel lblNewLabel = new JLabel("SEARCH");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(291, 10, 197, 39);
		panel.add(lblNewLabel);
		
		branch = new JTextField();
		branch.setFont(new Font("Tahoma", Font.BOLD, 20));
		branch.setColumns(10);
		branch.setBounds(262, 329, 351, 31);
		panel.add(branch);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.BOLD, 20));
		gender.setColumns(10);
		gender.setBounds(262, 378, 351, 31);
		panel.add(gender);
		
		year = new JTextField();
		year.setFont(new Font("Tahoma", Font.BOLD, 20));
		year.setColumns(10);
		year.setBounds(262, 444, 351, 31);
		panel.add(year);
		
		JButton button = new JButton("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 0, 102));
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBounds(95, 138, 124, 39);
		panel.add(button);
		
		JButton button_1 = new JButton("SEARCH");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","unnati123");
					
					String sql="SELECT * FROM info where rollno=?";
					
					PreparedStatement pt=conn.prepareStatement(sql);
					pt.setInt(1,Integer.parseInt(textField.getText()));
					ResultSet rs=pt.executeQuery();
					if(rs.next())
					{
						name.setText(rs.getString("name"));
						age.setText(rs.getString("age"));
						branch.setText(rs.getString("branch"));
						gender.setText(rs.getString("gender"));
						year.setText(rs.getString("year"));
						email.setText(rs.getString("email"));
						address.setText(rs.getString("address"));
						JOptionPane.showMessageDialog(null,"[   Record Found   ]");
					}
					else
						JOptionPane.showMessageDialog(null,"[  Record not found   ]");
					   
					 
					        pt.close();  
					        conn.close();  
					         
					    } catch (SQLException | ClassNotFoundException a) {  
					        JOptionPane.showMessageDialog(null, a);  
					    }  
				
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(255, 0, 102));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_1.setBounds(276, 138, 140, 39);
		panel.add(button_1);
		
		JButton button_2 = new JButton("CLEAR");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				name.setText(null);
				age.setText(null);
				branch.setText(null);
				gender.setText(null);
				year.setText(null);
				email.setText(null);
				address.setText(null);
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(new Color(255, 0, 102));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_2.setBounds(473, 138, 140, 39);
		panel.add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(34, 0, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\STUDENT MANAGEMENT\\BG-search.jpg"));
		lblNewLabel_2.setBounds(0, 0, 747, 703);
		panel.add(lblNewLabel_2);
	}

}
