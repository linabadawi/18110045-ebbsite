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

public class Swing9 {

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

	/**
	 * Launch the application.
	 */
	public static void page9() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing9 window = new Swing9();
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
	public Swing9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Change Status");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 577, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFileNo = new JLabel("File No.");
		lblFileNo.setBounds(31, 47, 56, 14);
		frame.getContentPane().add(lblFileNo);
		
		JLabel lblSearchCriteria = new JLabel("Search criteria");
		lblSearchCriteria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSearchCriteria.setBounds(21, 11, 127, 25);
		frame.getContentPane().add(lblSearchCriteria);
		
		textField = new JTextField();
		textField.setBounds(105, 46, 108, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(21, 87, 71, 14);
		frame.getContentPane().add(lblNationality);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 84, 108, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(213, 128, 61, 14);
		frame.getContentPane().add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(279, 125, 108, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblLastVisitBefore = new JLabel("Last Visit Before");
		lblLastVisitBefore.setBounds(309, 47, 101, 14);
		frame.getContentPane().add(lblLastVisitBefore);
		
		textField_3 = new JTextField();
		textField_3.setBounds(403, 44, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(505, 47, 46, 14);
		frame.getContentPane().add(lblYear);
		
		JLabel lblDiedBefor = new JLabel("Died Befor");
		lblDiedBefor.setBounds(339, 87, 71, 14);
		frame.getContentPane().add(lblDiedBefor);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(403, 84, 86, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblYear_1 = new JLabel("Year");
		lblYear_1.setBounds(505, 87, 46, 14);
		frame.getContentPane().add(lblYear_1);
		
		JLabel lblFileCreationDate = new JLabel("File Creation Date");
		lblFileCreationDate.setBounds(407, 153, 101, 14);
		frame.getContentPane().add(lblFileCreationDate);
		
		JLabel lblForm = new JLabel("Form");
		lblForm.setBounds(382, 186, 46, 14);
		frame.getContentPane().add(lblForm);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(382, 217, 46, 14);
		frame.getContentPane().add(lblTo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(442, 183, 109, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(442, 214, 109, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(41, 153, 77, 14);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblForm_1 = new JLabel("Form");
		lblForm_1.setBounds(10, 186, 39, 14);
		frame.getContentPane().add(lblForm_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(59, 183, 120, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblTo_1 = new JLabel("To");
		lblTo_1.setBounds(10, 217, 32, 14);
		frame.getContentPane().add(lblTo_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(61, 214, 118, 20);
		frame.getContentPane().add(textField_8);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(29, 259, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing8 pa=new Swing8();
				pa.page8();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(462, 259, 89, 23);
		frame.getContentPane().add(btnBack);
	}

}
