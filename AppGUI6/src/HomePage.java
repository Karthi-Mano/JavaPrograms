import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		
		JButton btnLoginpage = new JButton("LoginPage");
		btnLoginpage.setBounds(165, 38, 89, 23);
		contentPane.add(btnLoginpage);
		
		JButton btnAdminpage = new JButton("AdminPage");
		btnAdminpage.setBounds(165, 105, 89, 23);
		contentPane.add(btnAdminpage);
		
		final JButton btnUregister = new JButton("URegister");
		btnUregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				if(evt.getSource()==btnUregister)
				{
					new URegisterPage().setVisible(true);
				}
			}
		});
		btnUregister.setBounds(165, 163, 89, 23);
		contentPane.add(btnUregister);
	}
}
