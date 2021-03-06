import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
public class ViewDataTable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDataTable frame = new ViewDataTable();
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
	public ViewDataTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(10, 11, 424, 437);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnView = new JButton("ViewProduct");
		btnView.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
	            String pid=textField.getText();
				String str="select * from product where pid='"+pid+"'";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:p1");
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery(str);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnView.setBounds(15, 120, 114, 28);
		panel.add(btnView);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 181, 385, 245);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(139, 62, 114, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ProductId");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(15, 65, 89, 14);
		panel.add(lblNewLabel);
		
		JButton btnDeleteproduct = new JButton("DeleteProduct");
		btnDeleteproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDeleteproduct.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDeleteproduct.setBounds(139, 120, 114, 28);
		panel.add(btnDeleteproduct);
		
		final JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnNewButton)
				{
					new ViewDetailsPage().setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(277, 120, 114, 26);
		panel.add(btnNewButton);
		
		JLabel lblViewProductDetails = new JLabel("VIEW PRODUCT DETAILS");
		lblViewProductDetails.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblViewProductDetails.setBounds(131, 11, 146, 20);
		panel.add(lblViewProductDetails);
	}

}
