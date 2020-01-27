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

public class Swing5 {

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

	/**
	 * Launch the application.
	 */
	public static void page5() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing5 window = new Swing5();
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
	public Swing5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Record emergency visits");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 857, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientInformation = new JLabel("patient information");
		lblPatientInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPatientInformation.setBounds(670, 11, 161, 19);
		frame.getContentPane().add(lblPatientInformation);
		
		JLabel lblFileNo = new JLabel("File No");
		lblFileNo.setBounds(610, 49, 46, 14);
		frame.getContentPane().add(lblFileNo);
		
		textField = new JTextField();
		textField.setBounds(514, 46, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTheTemporaryNumber = new JLabel("The temporary number");
		lblTheTemporaryNumber.setBounds(379, 49, 134, 14);
		frame.getContentPane().add(lblTheTemporaryNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 46, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPreliminaryExaminationNumber = new JLabel("Preliminary examination number");
		lblPreliminaryExaminationNumber.setBounds(91, 49, 187, 14);
		frame.getContentPane().add(lblPreliminaryExaminationNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(0, 46, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCaseNumber = new JLabel("Case number");
		lblCaseNumber.setBounds(745, 49, 86, 14);
		frame.getContentPane().add(lblCaseNumber);
		
		textField_3 = new JTextField();
		textField_3.setBounds(656, 46, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTheName = new JLabel("The name");
		lblTheName.setBounds(759, 86, 72, 14);
		frame.getContentPane().add(lblTheName);
		
		textField_4 = new JTextField();
		textField_4.setBounds(561, 83, 195, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblReferalNo = new JLabel("Referal No");
		lblReferalNo.setBounds(472, 86, 64, 14);
		frame.getContentPane().add(lblReferalNo);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(320, 86, 46, 14);
		frame.getContentPane().add(lblAge);
		
		textField_5 = new JTextField();
		textField_5.setBounds(376, 83, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(214, 83, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(64, 82, 64, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(6, 82, 56, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(137, 86, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblDoctorsNumber = new JLabel("Doctor's number");
		lblDoctorsNumber.setBounds(692, 114, 139, 20);
		frame.getContentPane().add(lblDoctorsNumber);
		
		JLabel lblEmergencyDepartment = new JLabel("Emergency department");
		lblEmergencyDepartment.setBounds(692, 145, 149, 14);
		frame.getContentPane().add(lblEmergencyDepartment);
		
		JLabel lblEmergencyZone = new JLabel("Emergency zone");
		lblEmergencyZone.setBounds(692, 170, 125, 14);
		frame.getContentPane().add(lblEmergencyZone);
		
		JLabel lblConsultationType = new JLabel("Consultation type");
		lblConsultationType.setBounds(692, 195, 125, 14);
		frame.getContentPane().add(lblConsultationType);
		
		textField_7 = new JTextField();
		textField_7.setBounds(542, 114, 140, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(542, 142, 140, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(542, 167, 140, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(542, 192, 140, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblDateOfVisit = new JLabel("Date of visit");
		lblDateOfVisit.setBounds(405, 117, 86, 14);
		frame.getContentPane().add(lblDateOfVisit);
		
		textField_11 = new JTextField();
		textField_11.setBounds(242, 114, 140, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblVisitNumber = new JLabel("Visit number");
		lblVisitNumber.setBounds(405, 145, 72, 14);
		frame.getContentPane().add(lblVisitNumber);
		
		textField_12 = new JTextField();
		textField_12.setBounds(242, 142, 140, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblSessionNumber = new JLabel("Session number");
		lblSessionNumber.setBounds(405, 170, 108, 14);
		frame.getContentPane().add(lblSessionNumber);
		
		textField_13 = new JTextField();
		textField_13.setBounds(242, 167, 140, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblModelNumber = new JLabel("Model number");
		lblModelNumber.setBounds(405, 195, 86, 14);
		frame.getContentPane().add(lblModelNumber);
		
		textField_14 = new JTextField();
		textField_14.setBounds(242, 192, 140, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblDealingType = new JLabel("Dealing type");
		lblDealingType.setBounds(112, 117, 84, 14);
		frame.getContentPane().add(lblDealingType);
		
		JLabel lblNumberOfVisits = new JLabel("number of visits");
		lblNumberOfVisits.setBounds(112, 145, 110, 14);
		frame.getContentPane().add(lblNumberOfVisits);
		
		JLabel lblAttendanceNumber = new JLabel("Attendance number");
		lblAttendanceNumber.setBounds(112, 170, 120, 14);
		frame.getContentPane().add(lblAttendanceNumber);
		
		JLabel lblVisitCategory = new JLabel("visit category");
		lblVisitCategory.setBounds(112, 195, 104, 14);
		frame.getContentPane().add(lblVisitCategory);
		
		textField_15 = new JTextField();
		textField_15.setBounds(16, 112, 86, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(16, 142, 86, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(16, 167, 86, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(16, 192, 86, 20);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing4 pa=new Swing4();
				pa.page4();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(759, 240, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing6 pa=new Swing6();
				pa.page6();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(405, 240, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(6, 240, 89, 23);
		frame.getContentPane().add(btnSave);
	}

}
