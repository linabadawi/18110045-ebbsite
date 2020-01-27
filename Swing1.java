package assignment;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JToggleButton;

public class Swing1 extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	
	
	static String A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q ;
	 
	 
	 
	 
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		new Swing1();
		
		
		
		Lina f = new Lina ();
		f.open();
		f.Read();
		
		A =Lina.Patient_name;
		B = Lina.Gender;
		C = Lina.Expiry_date;
		D = Lina.Address;
		E = Lina.Age;
		F = Lina.Patient_phone;
		G = Lina.Initial_site;
		H = Lina.Desired_entry_date;
		I = Lina.Physician;
		J = Lina.Ward;
		K = Lina.Special_needs;
		L = Lina.Requested_services;
		M = Lina.Order_number;
		N = Lina.Patient_file;
		O = Lina.The_date_of_application;
		P = Lina.Admissions_source;
		Q = Lina.Case;
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing1 window = new Swing1();
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
	public Swing1() {
		initialize();
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Book a patient appointment");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 692, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient name");
		lblPatientName.setBounds(565, 101, 87, 14);
		frame.getContentPane().add(lblPatientName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(575, 126, 77, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblInitialSite = new JLabel("Initial site");
		lblInitialSite.setBounds(575, 154, 77, 14);
		frame.getContentPane().add(lblInitialSite);
		
		textField = new JTextField();
		textField.setBounds(402, 98, 141, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(402, 123, 142, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 151, 245, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		
		
	
		lblGender.setBounds(321, 101, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		
	
		
		lblAge.setBounds(331, 126, 46, 14);
		frame.getContentPane().add(lblAge);
		
		textField_3 = new JTextField();
		textField_3.setBounds(215, 98, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(215, 123, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblExpiryDate = new JLabel("Expiry date");
		lblExpiryDate.setBounds(116, 101, 67, 14);
		frame.getContentPane().add(lblExpiryDate);
		
		JLabel lblPatientPhone = new JLabel("Patient phone");
		lblPatientPhone.setBounds(116, 126, 81, 14);
		frame.getContentPane().add(lblPatientPhone);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 101, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 123, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDesiredEntryDate = new JLabel("Desired entry date");
		lblDesiredEntryDate.setBounds(553, 211, 113, 14);
		frame.getContentPane().add(lblDesiredEntryDate);
		
		JLabel lblWard = new JLabel("Ward");
		lblWard.setBounds(575, 265, 77, 14);
		frame.getContentPane().add(lblWard);
		
		JLabel lblSpecialNeeds = new JLabel("Special needs");
		lblSpecialNeeds.setBounds(565, 302, 87, 14);
		frame.getContentPane().add(lblSpecialNeeds);
		
		JLabel lblRequestedService = new JLabel("Requested service");
		lblRequestedService.setBounds(553, 327, 121, 14);
		frame.getContentPane().add(lblRequestedService);
		
		JLabel lblPhysician = new JLabel("Physician");
		lblPhysician.setBounds(575, 237, 76, 14);
		frame.getContentPane().add(lblPhysician);
		
		textField_7 = new JTextField();
		textField_7.setBounds(298, 208, 245, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(357, 237, 186, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(357, 262, 186, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(357, 299, 186, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(357, 324, 186, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login pa=new Login();
				pa.main(null);
				frame.setVisible(false);
				
			}
		});
		btnBack.setBounds(585, 386, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(403, 386, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Swing2 pa=new Swing2();
				pa.page2();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(298, 386, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(176, 386, 89, 23);
		frame.getContentPane().add(btnPrint);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Address = textField_1.getText().toString();
				String Age = textField_4.getText().toString();
				String Patient_name = textField.getText().toString();
				String Gender = textField_3.getText().toString();
				String Expiry_date = textField_5.getText().toString();
				String Patient_phone = textField_6.getText().toString();
				String Initial_site = textField_2.getText().toString();
				String Desired_entry_date = textField_7.getText().toString();
				String Physician = textField_8.getText().toString();
				String Ward = textField_9.getText().toString();
				String Special_needs = textField_10.getText().toString();
				String Requested_service= textField_11.getText().toString();
				
				String Order_number = textField_12.getText().toString();
				
				String Patient_file = textField_15.getText().toString();
				
				String The_date_of_application = textField_18.getText().toString();
				
				String Admissions_source = textField_21.getText().toString();
				
				String Case = textField_24.getText().toString();
				

				
				
				try {
					
					FileWriter writer = new FileWriter("src\\assignment\\read.txt");
					
					writer.write( Patient_name+"\n");
					writer.write( Gender+"\n");
					writer.write( Expiry_date+"\n");
					writer.write( Address+"\n");
					writer.write( Age+"\n");
					writer.write(  Patient_phone+"\n");
					writer.write(Initial_site +"\n");
					writer.write(Desired_entry_date +"\n");
					writer.write(Physician +"\n");
					writer.write(Ward +"\n");
					writer.write(Special_needs +"\n");
					writer.write( Requested_service +"\n");
					
					writer.write( Order_number+"\n");
					
					writer.write(Patient_file +"\n");
					
					writer.write(The_date_of_application +"\n");
					
					writer.write( Admissions_source+"\n");
					
					writer.write( Case+"\n");
					
					
					
					writer.close();
					JOptionPane.showMessageDialog(rootPane, "success");;
				}catch (Exception e1) {
				
				
				
					JOptionPane.showMessageDialog(rootPane, "Error");
				}


				
				
				
						
				
			}
		});
		btnSave.setBounds(0, 386, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JLabel lblOrderNumber = new JLabel("Order number");
		lblOrderNumber.setBounds(572, 11, 80, 20);
		frame.getContentPane().add(lblOrderNumber);
		
		textField_12 = new JTextField();
		textField_12.setBounds(538, 30, 113, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(538, 50, 113, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(538, 70, 114, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblPatientFile = new JLabel("Patient file");
		lblPatientFile.setBackground(Color.WHITE);
		lblPatientFile.setBounds(433, 14, 77, 14);
		frame.getContentPane().add(lblPatientFile);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(421, 30, 122, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(421, 50, 122, 20);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(421, 70, 122, 20);
		frame.getContentPane().add(textField_17);
		
		JLabel lblTheDateOf = new JLabel("The date of application");
		lblTheDateOf.setBounds(247, 14, 140, 14);
		frame.getContentPane().add(lblTheDateOf);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(215, 30, 208, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(215, 50, 208, 20);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(215, 70, 208, 20);
		frame.getContentPane().add(textField_20);
		
		JLabel lblAdmissionsSource = new JLabel("Admissions source ");
		lblAdmissionsSource.setBounds(99, 14, 117, 14);
		frame.getContentPane().add(lblAdmissionsSource);
		
		textField_21 = new JTextField();
		textField_21.setBounds(87, 30, 129, 20);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(87, 50, 129, 20);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(87, 70, 129, 20);
		frame.getContentPane().add(textField_23);
		
		JLabel lblCase = new JLabel("Case");
		lblCase.setBounds(23, 14, 46, 14);
		frame.getContentPane().add(lblCase);
		
		textField_24 = new JTextField();
		textField_24.setBounds(3, 30, 86, 20);
		frame.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(3, 50, 86, 20);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(3, 70, 86, 20);
		frame.getContentPane().add(textField_26);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(arg0.getSource()==btnView)
				{
					
					textField.setText(A);
					textField_3.setText(B);
					textField_5.setText(C);
					textField_1.setText(D);
					textField_4.setText(E);
					textField_6.setText(F);
					textField_2.setText(G);
					textField_7.setText(H);
					textField_8.setText(I);
					textField_9.setText(J);
					textField_10.setText(K);
					textField_11.setText(L);
					textField_12.setText(M);
					textField_15.setText(N);
					textField_18.setText(O);
					textField_21.setText(P);
					textField_24.setText(Q);
				}
			}
		});
		btnView.setBounds(87, 386, 89, 23);
		frame.getContentPane().add(btnView);
		
		
		
	}
}
