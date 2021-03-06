package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserLoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginPage frame = new UserLoginPage();
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
	public UserLoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserlogin = new JLabel("UserLogin");
		lblUserlogin.setBounds(154, 11, 93, 23);
		contentPane.add(lblUserlogin);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(32, 68, 87, 14);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(154, 65, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(32, 134, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 131, 138, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					
					String qstr="select * from ureg where uname='"+u+"' and pass='"+p+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/pgpproject","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(qstr);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					
					if(u.equals(uname)&&p.equals(pass))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucess");
						new UserHomePage().setVisible(true);
								
						
					}
					
					
					
					
					
					
					
					
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin, "LoginFail");
					//System.out.println(t);
				}
				
			}
		});
		btnLogin.setBounds(175, 187, 89, 23);
		contentPane.add(btnLogin);
	}

}
