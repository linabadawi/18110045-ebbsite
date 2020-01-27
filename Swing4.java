package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void page4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing4 window = new Swing4();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Record temporary files");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 654, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientSearch = new JLabel("patient search");
		lblPatientSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPatientSearch.setBounds(499, 11, 139, 32);
		frame.getContentPane().add(lblPatientSearch);
		
		JLabel lblDocumentType = new JLabel("Document Type");
		lblDocumentType.setBounds(528, 41, 100, 32);
		frame.getContentPane().add(lblDocumentType);
		
		textField = new JTextField();
		textField.setBounds(423, 50, 95, 13);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDocumentIcon = new JLabel("Document icon");
		lblDocumentIcon.setBounds(528, 72, 86, 14);
		frame.getContentPane().add(lblDocumentIcon);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(423, 74, 95, 13);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPhoneNumber = new JLabel("phone number");
		lblPhoneNumber.setBounds(528, 96, 87, 20);
		frame.getContentPane().add(lblPhoneNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(423, 98, 95, 13);
		frame.getContentPane().add(textField_2);
		
		JLabel lblTheName = new JLabel("The name");
		lblTheName.setBounds(317, 47, 69, 20);
		frame.getContentPane().add(lblTheName);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(231, 41, 86, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(145, 41, 86, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(60, 41, 86, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(0, 41, 62, 22);
		frame.getContentPane().add(textField_6);
		
		JLabel lblFileIcon = new JLabel("File icon");
		lblFileIcon.setBounds(327, 72, 46, 14);
		frame.getContentPane().add(lblFileIcon);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(231, 73, 86, 13);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(83, 73, 148, 13);
		frame.getContentPane().add(textField_8);
		
		JLabel lblTheTemporaryNumber = new JLabel("The temporary number");
		lblTheTemporaryNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTheTemporaryNumber.setBounds(513, 125, 125, 22);
		frame.getContentPane().add(lblTheTemporaryNumber);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(408, 127, 95, 20);
		frame.getContentPane().add(textField_9);
		
		JLabel lblFileNo = new JLabel("File No");
		lblFileNo.setBounds(317, 125, 66, 25);
		frame.getContentPane().add(lblFileNo);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(201, 127, 95, 20);
		frame.getContentPane().add(textField_10);
		
		JLabel lblDateOfRegistration = new JLabel("date of registration");
		lblDateOfRegistration.setBounds(83, 130, 115, 14);
		frame.getContentPane().add(lblDateOfRegistration);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(0, 127, 80, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel lblTheIdNumber = new JLabel("the ID number");
		lblTheIdNumber.setBounds(524, 158, 104, 20);
		frame.getContentPane().add(lblTheIdNumber);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(408, 158, 95, 20);
		frame.getContentPane().add(textField_12);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(264, 157, 74, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(184, 157, 60, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JLabel lblSocialStatus = new JLabel("Social status");
		lblSocialStatus.setBounds(83, 155, 80, 29);
		frame.getContentPane().add(lblSocialStatus);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(0, 158, 80, 20);
		frame.getContentPane().add(textField_13);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing3 pa=new Swing3();
				pa.page3();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(549, 207, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing5 pa=new Swing5();
				pa.page5();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(264, 207, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(0, 207, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}
