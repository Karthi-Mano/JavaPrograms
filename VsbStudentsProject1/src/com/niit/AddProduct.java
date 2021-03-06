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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProduct extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("ADDPRODUCT");
		lblAddproduct.setBounds(154, 22, 80, 27);
		contentPane.add(lblAddproduct);
		
		JLabel lblPid = new JLabel("PID");
		lblPid.setBounds(22, 74, 46, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(130, 71, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("PNAME");
		lblPname.setBounds(22, 149, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 146, 135, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPcategory = new JLabel("PCATEGORY");
		lblPcategory.setBounds(10, 224, 58, 14);
		contentPane.add(lblPcategory);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 221, 137, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPprice = new JLabel("PPRICE");
		lblPprice.setBounds(22, 292, 46, 14);
		contentPane.add(lblPprice);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 289, 137, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnAddproduct = new JButton("ADDPRODUCT");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String pcag=textField_2.getText();
					String price=textField_3.getText();
					
					String str="insert into product values(?,?,?,?)";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vsbjava","sa","");
					PreparedStatement pt=conn.prepareStatement(str);
					pt.setString(1,pid);
					pt.setString(2, pname);
					pt.setString(3, pcag);
					pt.setString(4, price);
					pt.executeUpdate();
					JOptionPane.showMessageDialog(btnAddproduct, "ProductAddSucess!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
				
			}
		});
		btnAddproduct.setBounds(39, 359, 126, 23);
		contentPane.add(btnAddproduct);
		
		final JButton btnReset = new JButton("VIEWPRODUCT");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				try
				{
					String pid=textField.getText();
					String str="select pname,pcategory,price from product where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vsbjava","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					textField_1.setText(rs.getString(1).trim());
					textField_2.setText(rs.getString(2).trim());
					textField_3.setText(rs.getString(3).trim());
					JOptionPane.showMessageDialog(btnReset, "Searching...");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnReset.setBounds(198, 359, 112, 23);
		contentPane.add(btnReset);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					
					String price=textField_3.getText();
					String str="update product set price='"+price+"' where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vsbjava","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnUpdate, "UpdateSucess!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(309, 224, 89, 23);
		contentPane.add(btnUpdate);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					String str="delete from product where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vsbjava","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnDelete, "deleted..");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnDelete.setBounds(309, 288, 89, 23);
		contentPane.add(btnDelete);
	}
}
