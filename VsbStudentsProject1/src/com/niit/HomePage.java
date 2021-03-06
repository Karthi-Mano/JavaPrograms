package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(27, 21, 379, 334);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JButton btnUlogin = new JButton("ULogin");
		btnUlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(arg0.getSource()==btnUlogin)
				{
					new ULoginPage().setVisible(true);
				}
			}
		});
		btnUlogin.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnUlogin.setBounds(143, 71, 89, 23);
		panel.add(btnUlogin);
		
		final JButton btnAlogin = new JButton("ALogin");
		btnAlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				if(evt.getSource()==btnAlogin)
				{
					new AdminLoginPage().setVisible(true);
				}
			}
		});
		btnAlogin.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnAlogin.setBounds(143, 125, 89, 23);
		panel.add(btnAlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnRegister.setBounds(143, 179, 89, 23);
		panel.add(btnRegister);
	}
}
