package assignment;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Swing3 {

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
	private JLabel lblOrderNumber;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel lblPatientFile;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JLabel lblTheDateOf;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JLabel lblAdmissionsSource;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JLabel lblCase;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;

	/**
	 * Launch the application.
	 */
	public static void page3() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing3 window = new Swing3();
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
	public Swing3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Book a sick appointment");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 604, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient name ");
		lblPatientName.setBounds(498, 95, 80, 14);
		frame.getContentPane().add(lblPatientName);
		
		textField = new JTextField();
		textField.setBounds(340, 92, 148, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(511, 133, 67, 14);
		frame.getContentPane().add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(340, 130, 148, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblInitialSite = new JLabel("Initial site ");
		lblInitialSite.setBounds(511, 175, 77, 14);
		frame.getContentPane().add(lblInitialSite);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 172, 263, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(188, 92, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(188, 130, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(284, 95, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(284, 133, 46, 14);
		frame.getContentPane().add(lblAge);
		
		textField_5 = new JTextField();
		textField_5.setBounds(0, 92, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(0, 130, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblExpiryDate = new JLabel("Expiry date");
		lblExpiryDate.setBounds(101, 95, 77, 14);
		frame.getContentPane().add(lblExpiryDate);
		
		JLabel lblPatientPhone = new JLabel("Patient phone");
		lblPatientPhone.setBounds(96, 133, 82, 14);
		frame.getContentPane().add(lblPatientPhone);
		
		JLabel lblIcsCodes = new JLabel("Ics codes");
		lblIcsCodes.setBounds(407, 215, 67, 14);
		frame.getContentPane().add(lblIcsCodes);
		
		JLabel lblTheDescription = new JLabel("The description");
		lblTheDescription.setBounds(267, 215, 91, 14);
		frame.getContentPane().add(lblTheDescription);
		
		textField_7 = new JTextField();
		textField_7.setBounds(225, 233, 133, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(357, 233, 131, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(225, 264, 133, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(357, 264, 131, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(225, 292, 133, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(357, 292, 131, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(225, 322, 133, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(357, 322, 131, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(225, 351, 133, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(357, 351, 131, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing2 pa=new Swing2();
				pa.page2();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(499, 391, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(367, 391, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Swing4 pa=new Swing4();
				pa.page4();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(277, 391, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(169, 391, 89, 23);
		frame.getContentPane().add(btnPrint);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(78, 391, 89, 23);
		frame.getContentPane().add(btnNew);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String Order_number = textField_17.getText().toString();
				String Order_number1 = textField_18.getText().toString();
				String Order_number2 = textField_19.getText().toString();
				String Patient_file = textField_20.getText().toString();
				String Patient_file1 = textField_21.getText().toString();
				String Patient_file2 = textField_22.getText().toString();
				
				
Component rootPane = null;
try {
					
					FileWriter writer = new FileWriter("src\\assignment\\w-3.txt");
					
					writer.write("Order_number = " + Order_number+"\n");
					writer.write("Order_number1 = " + Order_number1+"\n");
					writer.write("Order_number2 = "+ Order_number2+"\n");
					writer.write("Patient_file = "+ Patient_file+"\n");
					writer.write("Patient_file1 = " + Patient_file1+"\n");
					writer.write("Patient_file2 = " + Patient_file2+"\n");
					
					
					writer.close();
					JOptionPane.showMessageDialog(rootPane, "success");;
				}catch (Exception e1) {
				
				
				
					JOptionPane.showMessageDialog(rootPane, "Error");
				}


				
				
				
			}
		});
		btnSave.setBounds(0, 391, 89, 23);
		frame.getContentPane().add(btnSave);
		
		lblOrderNumber = new JLabel("Order number");
		lblOrderNumber.setBounds(498, 11, 80, 14);
		frame.getContentPane().add(lblOrderNumber);
		
		textField_17 = new JTextField();
		textField_17.setBounds(492, 24, 86, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(492, 44, 86, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(492, 64, 86, 20);
		frame.getContentPane().add(textField_19);
		
		lblPatientFile = new JLabel("Patient file");
		lblPatientFile.setBounds(391, 11, 65, 14);
		frame.getContentPane().add(lblPatientFile);
		
		textField_20 = new JTextField();
		textField_20.setBounds(357, 24, 136, 20);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(357, 44, 136, 20);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(357, 64, 143, 20);
		frame.getContentPane().add(textField_22);
		
		lblTheDateOf = new JLabel("The date of application ");
		lblTheDateOf.setBounds(210, 11, 148, 14);
		frame.getContentPane().add(lblTheDateOf);
		
		textField_23 = new JTextField();
		textField_23.setBounds(188, 24, 170, 20);
		frame.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(188, 44, 170, 20);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(188, 64, 170, 20);
		frame.getContentPane().add(textField_25);
		
		lblAdmissionsSource = new JLabel("Admissions source");
		lblAdmissionsSource.setBounds(80, 11, 120, 14);
		frame.getContentPane().add(lblAdmissionsSource);
		
		textField_26 = new JTextField();
		textField_26.setBounds(68, 24, 120, 20);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(68, 44, 120, 20);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(68, 64, 120, 20);
		frame.getContentPane().add(textField_28);
		
		lblCase = new JLabel("Case");
		lblCase.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblCase);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(0, 24, 68, 20);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(0, 44, 68, 20);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(0, 64, 68, 20);
		frame.getContentPane().add(textField_31);
	}
}
