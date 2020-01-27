package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing6 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JTextField textField_4;
	private JLabel lblCaseNo;
	private JTextField textField_5;
	private JLabel lblAge;
	private JTextField textField_6;
	private JLabel lblGender;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblAdmission;
	private JLabel lblApprovalNote;
	private JTextField textField_13;
	private JLabel lblTreatingDr;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblGuarantor;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblClassCode;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel lblAdmiisionDate;
	private JTextField textField_20;
	private JLabel lblDealling;
	private JTextField textField_21;
	private JLabel lblEstimatedResidency;
	private JTextField textField_22;
	private JButton btnBack;
	private JButton btnConfirm;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void page6() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing6 window = new Swing6();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("patient admission");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 721, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFileInfo = new JLabel("File info");
		lblFileInfo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		lblFileInfo.setBounds(10, 11, 90, 23);
		frame.getContentPane().add(lblFileInfo);
		
		JLabel lblFileNo = new JLabel("File No");
		lblFileNo.setBounds(30, 34, 46, 14);
		frame.getContentPane().add(lblFileNo);
		
		textField = new JTextField();
		textField.setBounds(76, 32, 90, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 57, 306, 17);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPatName = new JLabel("Pat. Name");
		lblPatName.setBounds(10, 59, 66, 14);
		frame.getContentPane().add(lblPatName);
		
		JLabel lblGurName = new JLabel("Gur. Name");
		lblGurName.setBounds(10, 84, 66, 14);
		frame.getContentPane().add(lblGurName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 81, 206, 17);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(282, 81, 100, 17);
		frame.getContentPane().add(textField_3);
		
		label = new JLabel("Temp. No.");
		label.setBounds(229, 34, 66, 14);
		frame.getContentPane().add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(296, 31, 86, 17);
		frame.getContentPane().add(textField_4);
		
		lblCaseNo = new JLabel("Case No.");
		lblCaseNo.setBounds(509, 34, 56, 14);
		frame.getContentPane().add(lblCaseNo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(563, 31, 86, 17);
		frame.getContentPane().add(textField_5);
		
		lblAge = new JLabel("Age");
		lblAge.setBounds(509, 59, 44, 14);
		frame.getContentPane().add(lblAge);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(563, 57, 86, 17);
		frame.getContentPane().add(textField_6);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(509, 84, 46, 14);
		frame.getContentPane().add(lblGender);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(563, 81, 86, 17);
		frame.getContentPane().add(textField_7);
		
		JLabel lblTransferredPatient = new JLabel("Transferred patient ");
		lblTransferredPatient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTransferredPatient.setBounds(10, 122, 156, 23);
		frame.getContentPane().add(lblTransferredPatient);
		
		JLabel lblClinicNo = new JLabel("Clinic No.");
		lblClinicNo.setBounds(10, 171, 66, 14);
		frame.getContentPane().add(lblClinicNo);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(95, 169, 100, 17);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(194, 169, 206, 17);
		frame.getContentPane().add(textField_9);
		
		JCheckBox chckbxCompanionsAllowed = new JCheckBox("Companions Allowed");
		chckbxCompanionsAllowed.setBounds(391, 139, 174, 23);
		frame.getContentPane().add(chckbxCompanionsAllowed);
		
		JLabel lblVisitNo = new JLabel("Visit No.");
		lblVisitNo.setBounds(571, 143, 56, 14);
		frame.getContentPane().add(lblVisitNo);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(623, 141, 72, 17);
		frame.getContentPane().add(textField_10);
		
		JLabel lblAdmissionNo = new JLabel("Admission No. ");
		lblAdmissionNo.setBounds(0, 199, 90, 14);
		frame.getContentPane().add(lblAdmissionNo);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(94, 197, 90, 17);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(94, 226, 90, 17);
		frame.getContentPane().add(textField_12);
		
		JLabel lblApprovedBy = new JLabel("Approved By");
		lblApprovedBy.setBounds(10, 228, 77, 14);
		frame.getContentPane().add(lblApprovedBy);
		
		lblAdmission = new JLabel("Admission");
		lblAdmission.setBounds(10, 253, 66, 14);
		frame.getContentPane().add(lblAdmission);
		
		lblApprovalNote = new JLabel("Approval Note");
		lblApprovalNote.setBounds(3, 269, 87, 14);
		frame.getContentPane().add(lblApprovalNote);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(94, 254, 294, 26);
		frame.getContentPane().add(textField_13);
		
		lblTreatingDr = new JLabel("Treating Dr.");
		lblTreatingDr.setBounds(10, 294, 77, 14);
		frame.getContentPane().add(lblTreatingDr);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(182, 292, 206, 17);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(94, 292, 90, 17);
		frame.getContentPane().add(textField_15);
		
		lblGuarantor = new JLabel("Guarantor");
		lblGuarantor.setBounds(20, 320, 70, 14);
		frame.getContentPane().add(lblGuarantor);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(94, 318, 90, 17);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(182, 318, 206, 17);
		frame.getContentPane().add(textField_17);
		
		lblClassCode = new JLabel("Class Code");
		lblClassCode.setBounds(20, 346, 70, 14);
		frame.getContentPane().add(lblClassCode);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(94, 346, 90, 17);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(182, 346, 206, 17);
		frame.getContentPane().add(textField_19);
		
		lblAdmiisionDate = new JLabel("Admiision Date");
		lblAdmiisionDate.setBounds(465, 199, 100, 14);
		frame.getContentPane().add(lblAdmiisionDate);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(577, 196, 100, 17);
		frame.getContentPane().add(textField_20);
		
		lblDealling = new JLabel("Dealling");
		lblDealling.setBounds(496, 228, 46, 14);
		frame.getContentPane().add(lblDealling);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(577, 226, 100, 17);
		frame.getContentPane().add(textField_21);
		
		lblEstimatedResidency = new JLabel("Estimated Residency");
		lblEstimatedResidency.setBounds(436, 253, 129, 14);
		frame.getContentPane().add(lblEstimatedResidency);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(577, 250, 100, 17);
		frame.getContentPane().add(textField_22);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing5 pa=new Swing5();
				pa.page5();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(606, 386, 89, 23);
		frame.getContentPane().add(btnBack);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing7 pa=new Swing7();
				pa.page7();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(23, 386, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(334, 386, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}
