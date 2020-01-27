package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Swing2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void page2() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing2 window = new Swing2();
					
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
	public Swing2() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Insert a doctor");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBackground(new Color(128, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 1031, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInpatients = new JLabel("Inpatients");
		lblInpatients.setBackground(new Color(255, 182, 193));
		lblInpatients.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInpatients.setBounds(933, 11, 65, 14);
		frame.getContentPane().add(lblInpatients);
		
		JLabel lblFileNo = new JLabel("File No");
		lblFileNo.setBounds(962, 36, 46, 14);
		frame.getContentPane().add(lblFileNo);
		
		textField = new JTextField();
		textField.setBounds(853, 36, 86, 14);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTheTemporaryNumber = new JLabel("The temporary number");
		lblTheTemporaryNumber.setBounds(725, 36, 130, 14);
		frame.getContentPane().add(lblTheTemporaryNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(629, 36, 86, 14);
		frame.getContentPane().add(textField_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(584, 36, 35, 14);
		frame.getContentPane().add(lblName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(378, 36, 196, 14);
		frame.getContentPane().add(textField_2);
		
		JLabel lblId = new JLabel("I.D");
		lblId.setBounds(347, 36, 21, 14);
		frame.getContentPane().add(lblId);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(236, 36, 101, 14);
		frame.getContentPane().add(textField_3);
		
		JLabel lblTheSequence = new JLabel("The sequence");
		lblTheSequence.setBounds(129, 36, 89, 14);
		frame.getContentPane().add(lblTheSequence);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(0, 36, 125, 14);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(947, 61, 61, 14);
		frame.getContentPane().add(lblNationality);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(853, 61, 86, 14);
		frame.getContentPane().add(textField_5);
		
		JLabel lblGender = new JLabel("gender");
		lblGender.setBounds(725, 61, 68, 14);
		frame.getContentPane().add(lblGender);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(629, 61, 86, 14);
		frame.getContentPane().add(textField_6);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(584, 61, 46, 14);
		frame.getContentPane().add(lblAge);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(528, 58, 46, 14);
		frame.getContentPane().add(textField_7);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(459, 58, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(378, 58, 73, 14);
		frame.getContentPane().add(textField_9);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(246, 58, 46, 14);
		frame.getContentPane().add(lblDate);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(163, 58, 73, 14);
		frame.getContentPane().add(textField_10);
		
		JLabel lblTypesOfEntry = new JLabel("Types of entry");
		lblTypesOfEntry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTypesOfEntry.setBounds(897, 86, 101, 19);
		frame.getContentPane().add(lblTypesOfEntry);
		
		JCheckBox chckbxImmediately = new JCheckBox("immediately");
		chckbxImmediately.setBounds(907, 112, 97, 23);
		frame.getContentPane().add(chckbxImmediately);
		
		JCheckBox chckbxUrgent = new JCheckBox("urgent");
		chckbxUrgent.setBounds(805, 112, 97, 23);
		frame.getContentPane().add(chckbxUrgent);
		
		JCheckBox chckbxOptional = new JCheckBox("optional");
		chckbxOptional.setBounds(702, 112, 97, 23);
		frame.getContentPane().add(chckbxOptional);
		
		JCheckBox chckbxDailyCondition = new JCheckBox("Daily Condition");
		chckbxDailyCondition.setBounds(584, 112, 116, 23);
		frame.getContentPane().add(chckbxDailyCondition);
		
		JCheckBox chckbxDailySurgery = new JCheckBox("Daily Surgery");
		chckbxDailySurgery.setBounds(477, 112, 104, 23);
		frame.getContentPane().add(chckbxDailySurgery);
		
		JCheckBox chckbxAsaClass = new JCheckBox("ASA Class");
		chckbxAsaClass.setBounds(378, 112, 97, 23);
		frame.getContentPane().add(chckbxAsaClass);
		
		JLabel lblAdapterFrom = new JLabel("Adapter from");
		lblAdapterFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdapterFrom.setBounds(256, 88, 101, 14);
		frame.getContentPane().add(lblAdapterFrom);
		
		JRadioButton rdbtnEmergenciesAndAccidents = new JRadioButton("Emergencies and accidents");
		rdbtnEmergenciesAndAccidents.setBounds(183, 112, 185, 23);
		frame.getContentPane().add(rdbtnEmergenciesAndAccidents);
		
		JRadioButton rdbtnOutpatientClinics = new JRadioButton("Outpatient clinics");
		rdbtnOutpatientClinics.setBounds(39, 112, 125, 23);
		frame.getContentPane().add(rdbtnOutpatientClinics);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setBounds(952, 151, 46, 14);
		frame.getContentPane().add(lblSection);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(777, 151, 162, 14);
		frame.getContentPane().add(textField_11);
		
		JLabel lblEntryDate = new JLabel("entry date");
		lblEntryDate.setBounds(687, 151, 80, 14);
		frame.getContentPane().add(lblEntryDate);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(584, 151, 86, 14);
		frame.getContentPane().add(textField_12);
		
		JLabel lblExpectedStayPeriod = new JLabel("Expected stay period");
		lblExpectedStayPeriod.setBounds(415, 151, 140, 14);
		frame.getContentPane().add(lblExpectedStayPeriod);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(329, 151, 73, 14);
		frame.getContentPane().add(textField_13);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis");
		lblDiagnosis.setBounds(222, 151, 65, 14);
		frame.getContentPane().add(lblDiagnosis);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(145, 151, 73, 14);
		frame.getContentPane().add(textField_15);
		
		JLabel lblMeasures = new JLabel("Measures");
		lblMeasures.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMeasures.setBounds(70, 150, 65, 14);
		frame.getContentPane().add(lblMeasures);
		
		JLabel lblExpectedPeriod = new JLabel("Expected period");
		lblExpectedPeriod.setBounds(79, 175, 109, 14);
		frame.getContentPane().add(lblExpectedPeriod);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(0, 175, 73, 14);
		frame.getContentPane().add(textField_16);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setBounds(79, 192, 46, 14);
		frame.getContentPane().add(lblDate_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(0, 192, 73, 14);
		frame.getContentPane().add(textField_17);
		
		JLabel lblInitialDiagnosis = new JLabel("Initial diagnosis");
		lblInitialDiagnosis.setBounds(907, 176, 90, 14);
		frame.getContentPane().add(lblInitialDiagnosis);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(777, 175, 114, 14);
		frame.getContentPane().add(textField_18);
		
		JLabel lblBloodRequestUnits = new JLabel("Blood request units");
		lblBloodRequestUnits.setBounds(614, 176, 125, 14);
		frame.getContentPane().add(lblBloodRequestUnits);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBounds(681, 198, 46, 23);
		frame.getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(627, 197, 43, 23);
		frame.getContentPane().add(rdbtnNo);
		
		JLabel lblBloodUnits = new JLabel("Blood units");
		lblBloodUnits.setBounds(624, 236, 70, 14);
		frame.getContentPane().add(lblBloodUnits);
		
		textField_19 = new JTextField();
		textField_19.setBounds(680, 233, 59, 20);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblTheDoctor = new JLabel("the doctor");
		lblTheDoctor.setBounds(921, 218, 87, 14);
		frame.getContentPane().add(lblTheDoctor);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(825, 218, 86, 14);
		frame.getContentPane().add(textField_20);
		
		JLabel lblSpecialization = new JLabel("Specialization");
		lblSpecialization.setBounds(921, 236, 87, 14);
		frame.getContentPane().add(lblSpecialization);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(825, 236, 86, 14);
		frame.getContentPane().add(textField_21);
		
		JLabel lblPatientStatus = new JLabel("Patient Status");
		lblPatientStatus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPatientStatus.setBounds(478, 191, 118, 14);
		frame.getContentPane().add(lblPatientStatus);
		
		JCheckBox chckbxLifeSaving = new JCheckBox("Life Saving");
		chckbxLifeSaving.setBounds(488, 214, 97, 23);
		frame.getContentPane().add(chckbxLifeSaving);
		
		JCheckBox chckbxLimbSaving = new JCheckBox("Limb Saving");
		chckbxLimbSaving.setBounds(388, 214, 97, 23);
		frame.getContentPane().add(chckbxLimbSaving);
		
		JCheckBox chckbxOrganSaving = new JCheckBox("Organ Saving");
		chckbxOrganSaving.setBounds(284, 214, 102, 23);
		frame.getContentPane().add(chckbxOrganSaving);
		
		JCheckBox chckbxMicu = new JCheckBox("MICU");
		chckbxMicu.setBounds(217, 214, 65, 23);
		frame.getContentPane().add(chckbxMicu);
		
		JCheckBox chckbxNicu = new JCheckBox("NICU");
		chckbxNicu.setBounds(145, 214, 65, 23);
		frame.getContentPane().add(chckbxNicu);
		
		JCheckBox chckbxPatientNeedMonitor = new JCheckBox("Patient Need Monitor");
		chckbxPatientNeedMonitor.setBounds(0, 214, 143, 23);
		frame.getContentPane().add(chckbxPatientNeedMonitor);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing3 pa=new Swing3();
				pa.page3();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(46, 264, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing1 pa=new Swing1();
				pa.main(null);
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(919, 261, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String File_No = textField.getText().toString();
				String The_temporary_number = textField_1.getText().toString();
				String Name = textField_2.getText().toString();
				String ID = textField_3.getText().toString();
				String The_sequence = textField_4.getText().toString();
				String Nationality = textField_5.getText().toString();
				String gender = textField_6.getText().toString();
				String Age = textField_7.getText().toString();
				String Status = textField_9.getText().toString();
				String Date = textField_10.getText().toString();
				String immediately = chckbxImmediately.getText().toString();
				String urgent = chckbxUrgent.getText().toString();
				String optional = chckbxOptional.getText().toString();
				String Daily_Condition = chckbxDailyCondition.getText().toString();
				String Daily_Surgery = chckbxDailySurgery.getText().toString();
				String ASA_Class = chckbxAsaClass.getText().toString();
				String Emergencies_and_accidents = rdbtnEmergenciesAndAccidents.getText().toString();
				String Outpatient_clinics = rdbtnOutpatientClinics.getText().toString();
				String Section = textField_11.getText().toString();
				String entry_date = textField_12.getText().toString();
				String Expected_stay_period = textField_13.getText().toString();
				String Diagnosis = textField_15.getText().toString();
				String Initial_diagnosis = textField_18.getText().toString();
				String Expected_period = textField_16.getText().toString();
				String Date1 = textField_17.getText().toString();
				String the_doctor = textField_20.getText().toString();
				String Specialization = textField_21.getText().toString();
				String Blood_request_units = rdbtnYes.getText().toString();
				String Blood_request_units1 = rdbtnNo.getText().toString();
				String Blood_unit = textField_19.getText().toString();
				String Life_Saving = chckbxLifeSaving.getText().toString();
				String Limb_Saving = chckbxLimbSaving.getText().toString();
				String Organ_Saving = chckbxOrganSaving.getText().toString();
				String MICU = chckbxMicu.getText().toString();
				String NICU = chckbxNicu.getText().toString();
				String Patient_Need_Monitor = chckbxPatientNeedMonitor.getText().toString();
				
				
				
				
				
				Component rootPane = null;
				try {
					
					FileWriter writer = new FileWriter("src\\assignment\\w-2.txt");
					writer.write("File_No = " + File_No+"\n");
					writer.write("The_temporary_number = " + The_temporary_number+"\n");
					writer.write("Name = "+ Name+"\n");
					writer.write("ID = " + ID+"\n");
					writer.write("The_sequence = " + The_sequence+"\n");
					writer.write("Nationality = " + Nationality+"\n");
					writer.write("gender = " +gender +"\n");
					writer.write("Age = " +Age +"\n");
					writer.write("Status = " +Status +"\n");
					writer.write("Date = " +Date1 +"\n");
					writer.write("Section = " +Section +"\n");
					writer.write("entry_date = " +entry_date +"\n");
					writer.write("Expected_stay_period = " +Expected_stay_period +"\n");
					writer.write("Diagnosis = " +Diagnosis +"\n");
					writer.write("Initial_diagnosis = " +Initial_diagnosis +"\n");
					writer.write("Expected_period = " +Expected_period +"\n");
					writer.write("Date1 = " +Date1+"\n");
					writer.write("the_doctor = " +the_doctor+"\n");
					writer.write("Specialization = " +Specialization+"\n");
					writer.write("Blood_unit = " +Blood_unit+"\n");
					
					
					
					
					if(chckbxImmediately.isSelected()) {
					writer.write("immediately = " +immediately +"\n");
					}else {
					writer.write("immediately = " +" " +"\n");
					}
					
					if(chckbxUrgent.isSelected()) {
						writer.write(" urgent= " +urgent +"\n");
						}else {
						writer.write("urgent = " +" " +"\n");
						}
					
					if(chckbxOptional.isSelected()) {
						writer.write("optional= " +optional +"\n");
						}else {
						writer.write("optional = " +" " +"\n");
						}
					
					if(chckbxDailyCondition.isSelected()) {
						writer.write(" Daily_Condition= " +Daily_Condition +"\n");
						}else {
						writer.write("Daily_Condition = " +" " +"\n");
						}
					
					if(chckbxDailySurgery.isSelected()) {
						writer.write(" Daily_Surgery= " +Daily_Surgery +"\n");
						}else {
						writer.write("Daily_Surgery = " +" " +"\n");
						}
					
					if(chckbxAsaClass.isSelected()) {
						writer.write(" ASA_Class= " +ASA_Class +"\n");
						}else {
						writer.write("ASA_Class= " +" " +"\n");
						}
					
					if(rdbtnEmergenciesAndAccidents.isSelected()) {
						writer.write(" Emergencies_and_accidents= " +Emergencies_and_accidents +"\n");
						}else {
						writer.write("Emergencies_and_accidents= " +" " +"\n");
						}
					
					if(rdbtnOutpatientClinics.isSelected()) {
						writer.write(" Outpatient_clinics= " +Outpatient_clinics +"\n");
						}else {
						writer.write("Outpatient_clinics= " +" " +"\n");
						}
					
					if(rdbtnYes.isSelected()) {
						writer.write(" Blood_request_units= " +Blood_request_units +"\n");
						}else {
						writer.write("Blood_request_units= " +" " +"\n");
						}
					
					if(rdbtnNo.isSelected()) {
						writer.write(" Blood_request_units1= " +Blood_request_units1 +"\n");
						}else {
						writer.write("Blood_request_units1= " +" " +"\n");
						}
					
					if(chckbxLifeSaving.isSelected()) {
						writer.write(" Life_Saving= " +Life_Saving +"\n");
						}else {
						writer.write("Life_Saving= " +" " +"\n");
						}
					
					if(chckbxLimbSaving.isSelected()) {
						writer.write(" Limb_Saving= " +Limb_Saving +"\n");
						}else {
						writer.write("Limb_Saving= " +" " +"\n");
						}
					
					if(chckbxOrganSaving.isSelected()) {
						writer.write(" Organ_Saving= " +Organ_Saving +"\n");
						}else {
						writer.write("Organ_Saving= " +" " +"\n");
						}
					
					if(chckbxMicu.isSelected()) {
						writer.write(" MICU= " +MICU +"\n");
						}else {
						writer.write("MICU= " +" " +"\n");
						}
					
					if(chckbxNicu.isSelected()) {
						writer.write(" NICU= " +NICU +"\n");
						}else {
						writer.write("NICU= " +" " +"\n");
						}
					
					if(chckbxPatientNeedMonitor.isSelected()) {
						writer.write(" Patient_Need_Monitor= " +Patient_Need_Monitor +"\n");
						}else {
						writer.write("Patient_Need_Monitor= " +" " +"\n");
						}
					
					
					
					
					
					
					writer.close();
					JOptionPane.showMessageDialog(rootPane, "success");
				}catch (Exception e1) {
				
				
				
					JOptionPane.showMessageDialog(rootPane, "Error");
				}

			}
		});
		btnSave.setBounds(459, 264, 89, 23);
		frame.getContentPane().add(btnSave);
		
		
	}
}
