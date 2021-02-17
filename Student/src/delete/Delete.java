package delete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.Menu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DELETE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(205, 35, 171, 47);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(285, 134, 171, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		button.setBounds(75, 229, 124, 39);
		contentPane.add(button);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try { 
					 Class.forName("com.mysql.jdbc.Driver");
						Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","unnati123");
						
						String sql="delete  from info where rollno=? ";
						
						PreparedStatement pt=conn.prepareStatement(sql);
						pt.setInt(1,Integer.parseInt(textField.getText()));
						pt.executeUpdate();
						   JOptionPane.showMessageDialog(null,"[   Record deleted...  sucessfully    ]");
						 
						        pt.close();  
						        conn.close();  
						         
					         
					    } catch (SQLException | ClassNotFoundException se) {  
					        JOptionPane.showMessageDialog(null, se);  
					    }  
				         
				        
				      
			}
			
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(255, 0, 102));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDelete.setBounds(321, 229, 140, 39);
		contentPane.add(btnDelete);
		
		JLabel label = new JLabel("ROLL NO    :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(64, 134, 163, 31);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\STUDENT MANAGEMENT\\BG-del.jpg"));
		lblNewLabel_1.setBounds(0, 0, 553, 308);
		contentPane.add(lblNewLabel_1);
	}

}
