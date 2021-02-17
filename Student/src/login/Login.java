package login;


import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import Registration.Registration;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

import menu.Menu;

import java.awt.Color;
import javax.swing.JPasswordField;

import java.sql.*;
import javax.swing.JPanel;

;public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		
		
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setResizable(false);
		frame.setBounds(100, 100, 784, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME    :");
		lblNewLabel.setBounds(123, 335, 215, 38);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD    :");
		lblNewLabel_1.setBounds(123, 391, 215, 54);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user.setBounds(358, 335, 288, 38);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN");
		lblNewLabel_3.setBounds(322, 245, 138, 67);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel_3);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pass.setBounds(358, 407, 288, 38);
		frame.getContentPane().add(pass);
		
		
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(310, 488, 150, 61);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 0, 102));
		btnNewButton.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/id","root","unnati123");
					Statement stmt=conn.createStatement();
					String sql="Select * from admin where userName='"+user.getText()+"'and password ='"+pass.getText()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
					
					JOptionPane.showMessageDialog(null,"[    Login sucessfully    ]");
					new Menu().setVisible(true);
					frame.dispose();
					}
					else
					JOptionPane.showMessageDialog(null,"[    FAILED    ]");
					
					}
					catch(Exception E)
					{
						System.out.println(E);
					}
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel Avatat = new JLabel("");
		Avatat.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\STUDENT MANAGEMENT\\Student\\Resource\\Avatar.png"));
		Avatat.setBounds(297, 38, 180, 180);
		frame.getContentPane().add(Avatat);
		
		JLabel BG = new JLabel("");
		BG.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\STUDENT MANAGEMENT\\Student\\Resource\\BG-LOGIN.jpg"));
		BG.setBounds(0, 0, 783, 600);
		frame.getContentPane().add(BG);
		
	}
}
