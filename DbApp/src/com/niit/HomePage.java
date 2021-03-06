package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("HRSYSTEM");
		lblHrsystem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHrsystem.setBackground(Color.PINK);
		lblHrsystem.setBounds(190, 11, 116, 25);
		contentPane.add(lblHrsystem);
		
		final JButton btnUlogin = new JButton("ULogin");
		btnUlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getSource()==btnUlogin)
				{
					new LoginPage().setVisible(true);
				}
					
			}
		});
		btnUlogin.setBounds(165, 61, 89, 23);
		contentPane.add(btnUlogin);
		
		JButton btnAlogin = new JButton("ALogin");
		btnAlogin.setBounds(165, 124, 89, 23);
		contentPane.add(btnAlogin);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt1)
			{ 
				if(evt1.getSource()==btnRegister)
				{
					new RegisterPage().setVisible(true);
				}
			}
		});
		btnRegister.setBounds(165, 193, 89, 23);
		contentPane.add(btnRegister);
	}
}
