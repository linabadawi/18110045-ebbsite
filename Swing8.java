package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing8 {

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
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void page8() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing8 window = new Swing8();
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
	public Swing8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Daily Appointment");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 712, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblParameters = new JLabel("Parameters");
		lblParameters.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParameters.setBounds(10, 11, 108, 28);
		frame.getContentPane().add(lblParameters);
		
		JLabel lblFormDate = new JLabel("Form Date");
		lblFormDate.setBounds(125, 41, 72, 21);
		frame.getContentPane().add(lblFormDate);
		
		JLabel lblToDate = new JLabel("To Date");
		lblToDate.setBounds(135, 77, 46, 14);
		frame.getContentPane().add(lblToDate);
		
		JLabel lblPatientId = new JLabel("Patient ID.");
		lblPatientId.setBounds(125, 114, 62, 14);
		frame.getContentPane().add(lblPatientId);
		
		JLabel lblTempNo = new JLabel("Temp No.");
		lblTempNo.setBounds(135, 150, 62, 14);
		frame.getContentPane().add(lblTempNo);
		
		JLabel lblClinicName = new JLabel("Clinic Name");
		lblClinicName.setBounds(125, 183, 72, 14);
		frame.getContentPane().add(lblClinicName);
		
		JLabel lblDoctorId = new JLabel("Doctor ID");
		lblDoctorId.setBounds(135, 221, 72, 14);
		frame.getContentPane().add(lblDoctorId);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(161, 254, 46, 14);
		frame.getContentPane().add(lblDay);
		
		JLabel lblPeriod = new JLabel("Period");
		lblPeriod.setBounds(151, 291, 46, 14);
		frame.getContentPane().add(lblPeriod);
		
		JLabel lblCategory = 
				
				new JLabel("Category");
		lblCategory.setBounds(125, 325, 56, 14);
		frame.getContentPane().add(lblCategory);
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setBounds(151, 361, 46, 14);
		frame.getContentPane().add(lblOrder);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValue.setBounds(261, 20, 46, 14);
		frame.getContentPane().add(lblValue);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescription.setBounds(435, 16, 72, 19);
		frame.getContentPane().add(lblDescription);
		
		textField = new JTextField();
		textField.setBounds(207, 41, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(335, 41, 238, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(207, 74, 129, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(335, 74, 238, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(207, 111, 129, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(335, 111, 238, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(207, 147, 129, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(335, 147, 238, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(207, 180, 129, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(335, 180, 238, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(207, 218, 129, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(335, 218, 238, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(207, 251, 129, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(335, 251, 238, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(207, 288, 129, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(335, 288, 238, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(207, 322, 129, 20);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(335, 322, 238, 20);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(207, 358, 129, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(335, 358, 238, 20);
		frame.getContentPane().add(textField_19);
		
		JLabel lblName = new JLabel("Name ");
		lblName.setBounds(151, 405, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(112, 441, 85, 14);
		frame.getContentPane().add(lblEmailAddress);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(207, 402, 366, 20);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(207, 438, 366, 20);
		frame.getContentPane().add(textField_23);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing9 pa=new Swing9();
				pa.page9();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(10, 503, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(301, 503, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing7 pa=new Swing7();
				pa.page7();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(607, 503, 89, 23);
		frame.getContentPane().add(btnBack);
	}

}
