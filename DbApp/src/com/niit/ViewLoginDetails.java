package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ViewLoginDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLoginDetails frame = new ViewLoginDetails();
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
	public ViewLoginDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewlogindetails = new JLabel("ViewLoginDetails");
		lblViewlogindetails.setBounds(137, 11, 156, 23);
		contentPane.add(lblViewlogindetails);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(23, 45, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(93, 42, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnViewmydetails = new JButton("ViewMyDetails");
		btnViewmydetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				try
				{
					 String uname=textField.getText();
    				String str="select * from ureg where uname='"+uname+"'";
//					String str="select * from ureg";
						Class.forName("org.h2.Driver");
						  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
						Statement stm=con.createStatement();
						ResultSet rs=stm.executeQuery(str);
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						//table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception t)
				{
					System.out.println("***"+t);
				}
			}
		});
		btnViewmydetails.setBounds(282, 45, 122, 23);
		contentPane.add(btnViewmydetails);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(23, 108, 401, 286);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Important code for view tables
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 11, 381, 264);
				panel.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);


		
	}
}
