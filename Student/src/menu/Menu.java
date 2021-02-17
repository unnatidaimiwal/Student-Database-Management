package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Registration.Registration;
import delete.Delete;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import search.Search;
import update.Update;
public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin !!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 57));
		lblNewLabel.setBounds(135, 45, 553, 77);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Registration().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 102));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(132, 162, 200, 200);
		contentPane.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Update().setVisible(true);
				dispose();
			}
		});
		btnUpdate.setBackground(new Color(255, 0, 102));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnUpdate.setBounds(457, 162, 200, 200);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Delete().setVisible(true);
				dispose();
			}
		});
		btnDelete.setBackground(new Color(255, 0, 102));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDelete.setBounds(132, 413, 200, 200);
		contentPane.add(btnDelete);
		
		JButton btnDispaly = new JButton("SEARCH");
		btnDispaly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Search().setVisible(true);
				dispose();
			}
		});
		btnDispaly.setBackground(new Color(255, 0, 102));
		btnDispaly.setForeground(Color.WHITE);
		btnDispaly.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDispaly.setBounds(457, 413, 200, 200);
		contentPane.add(btnDispaly);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 102));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(327, 659, 139, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\STUDENT MANAGEMENT\\BG-MENU.jpg"));
		lblNewLabel_1.setBounds(0, 0, 807, 753);
		contentPane.add(lblNewLabel_1);
	}
}
