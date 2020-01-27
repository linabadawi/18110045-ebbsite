package assignment;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void setLocationRelativeTo(Object object) {
		
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
		frame = new JFrame("Login");
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(new Color(240, 255, 240));
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLogin.setBounds(67, 11, 127, 35);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 182, 193));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(10, 79, 80, 26);
		frame.getContentPane().add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(100, 84, 141, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 182, 193));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 128, 80, 26);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me");
		chckbxRememberMe.setForeground(new Color(255, 182, 193));
		chckbxRememberMe.setBounds(10, 178, 132, 23);
		frame.getContentPane().add(chckbxRememberMe);
		
		JLabel lblForgetYourPassword = new JLabel("Forget your password?");
		lblForgetYourPassword.setForeground(new Color(255, 182, 193));
		lblForgetYourPassword.setBounds(10, 208, 148, 27);
		frame.getContentPane().add(lblForgetYourPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				 
				
				if (password.contains("1234") && username.contains("lina.badawi")) {
					
					
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					Swing1 info =new Swing1();
					Swing1.main(null);
					
					
				}
				
				else
				{
					 JOptionPane.showMessageDialog(null, "Invalid Login Details" , "Login Error", JOptionPane.ERROR_MESSAGE);
					 txtPassword.setText(null);
					 txtUsername.setText(null);
					 
						
				}
				 
			
		
				
				
			}
		});
		btnLogin.setForeground(new Color(255, 182, 193));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnLogin.setBounds(168, 198, 141, 52);
		frame.getContentPane().add(btnLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(100, 133, 141, 20);
		frame.getContentPane().add(txtPassword);
	}
}
