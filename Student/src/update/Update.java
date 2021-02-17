package update;

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
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class Update extends JFrame {

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
					Update frame = new Update();
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
	public Update() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 817, 780);
		contentPane.add(panel);
		
		JLabel lblUpdate = new JLabel("UPDATE");
		lblUpdate.setForeground(Color.WHITE);
		lblUpdate.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblUpdate.setBounds(298, 22, 177, 57);
		panel.add(lblUpdate);
		
		JLabel label_1 = new JLabel("NAME         :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBounds(38, 106, 163, 31);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("AGE            :");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_2.setBounds(38, 209, 163, 31);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("GENDER    :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_3.setBounds(38, 316, 163, 31);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("YEAR         :");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_4.setBounds(38, 382, 163, 31);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("BRANCH    :");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_5.setBounds(38, 265, 163, 31);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("EMAIL ID  :");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_6.setBounds(36, 458, 153, 31);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("ADDRESS  :");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_7.setBounds(36, 531, 153, 31);
		panel.add(label_7);
		
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
		button.setBounds(163, 631, 124, 39);
		panel.add(button);
		
		JLabel label_8 = new JLabel("ROLL NO    :");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_8.setBounds(38, 156, 163, 31);
		panel.add(label_8);
		
		
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 20));
		name.setColumns(10);
		name.setBounds(228, 106, 390, 31);
		panel.add(name);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.BOLD, 20));
		rollno.setColumns(10);
		rollno.setBounds(228, 156, 390, 31);
		panel.add(rollno);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 20));
		age.setColumns(10);
		age.setBounds(228, 209, 96, 31);
		panel.add(age);
		
		JRadioButton cs = new JRadioButton("CS");
		cs.setForeground(Color.WHITE);
		cs.setBackground(new Color(255, 0, 102));
		buttonGroup.add(cs);
		cs.setFont(new Font("Tahoma", Font.BOLD, 25));
		cs.setBounds(235, 261, 71, 39);
		panel.add(cs);
		
		JRadioButton it = new JRadioButton("IT");
		it.setForeground(Color.WHITE);
		it.setBackground(new Color(255, 0, 102));
		buttonGroup.add(it);
		it.setFont(new Font("Tahoma", Font.BOLD, 25));
		it.setBounds(366, 261, 60, 39);
		panel.add(it);
		
		JRadioButton entc = new JRadioButton("ENTC");
		entc.setForeground(Color.WHITE);
		entc.setBackground(new Color(255, 0, 102));
		buttonGroup.add(entc);
		entc.setFont(new Font("Tahoma", Font.BOLD, 25));
		entc.setBounds(502, 261, 106, 39);
		panel.add(entc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Male", "Female"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox.setBounds(228, 316, 142, 31);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "First", "Second", "Third", "Fourth"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox_1.setBounds(228, 381, 142, 32);
		panel.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(384, 540, 5, 22);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textArea_1.setBounds(228, 520, 390, 57);
		panel.add(textArea_1);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.BOLD, 20));
		email.setColumns(10);
		email.setBounds(228, 458, 380, 31);
		panel.add(email);
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","unnati123");
					
					String sql="update info set name=?,age=?,branch=?,gender=?,year=?,email=?,address=? where rollno=?";
							String year;
							String gender;
					gender=comboBox.getSelectedItem().toString();
					year=comboBox_1.getSelectedItem().toString();
					PreparedStatement pt=conn.prepareStatement(sql);
					
					pt.setString(1,name.getText());
					pt.setInt(8,Integer.parseInt(rollno.getText()));
					pt.setString(2,age.getText());
					String branch;
					if(cs.isSelected())
					branch=cs.getText();
					if(it.isSelected())
					branch=it.getText();
					else
				    branch=entc.getText();
				    pt.setString(3,branch);
					 pt.setString(4,gender);
					pt.setString(5,year);
					pt.setString(6,email.getText());
					pt.setString(7,textArea_1 .getText());
				    
					pt.executeUpdate();
				   JOptionPane.showMessageDialog(null,"[   Updated  sucessfully    ]");
				 
				        pt.close();  
				        conn.close();  
				         
				    } catch (SQLException | ClassNotFoundException a) {  
				        JOptionPane.showMessageDialog(null, a);  
				    }  
			
			}
			
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(new Color(255, 0, 102));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnUpdate.setBounds(439, 631, 140, 39);
		panel.add(btnUpdate);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\STUDENT MANAGEMENT\\BG-up.jpg"));
		lblNewLabel.setBounds(0, 0, 827, 770);
		panel.add(lblNewLabel);
	}
}
