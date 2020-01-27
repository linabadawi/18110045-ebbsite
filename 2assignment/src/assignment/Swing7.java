package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing7 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JButton btnBack;
	private JButton btnSave;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */
	public static void page7() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing7 window = new Swing7();
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
	public Swing7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Patients Discharge");
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 812, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSearchCriteria = new JLabel("Search Criteria");
		lblSearchCriteria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSearchCriteria.setBounds(10, 11, 119, 21);
		frame.getContentPane().add(lblSearchCriteria);
		
		JLabel lblWard = new JLabel("Ward");
		lblWard.setBounds(20, 43, 46, 14);
		frame.getContentPane().add(lblWard);
		
		JLabel lblFileNo = new JLabel("File No.");
		lblFileNo.setBounds(10, 82, 56, 14);
		frame.getContentPane().add(lblFileNo);
		
		textField = new JTextField();
		textField.setBounds(70, 40, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 79, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 40, 274, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(155, 79, 274, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblRoomNo = new JLabel("Room No.");
		lblRoomNo.setBounds(473, 43, 64, 14);
		frame.getContentPane().add(lblRoomNo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(557, 40, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(477, 82, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(557, 79, 239, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblBedNo = new JLabel("Bed No.");
		lblBedNo.setBounds(653, 43, 61, 14);
		frame.getContentPane().add(lblBedNo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(717, 40, 79, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPatientAdmissions = new JLabel("Patient Admissions");
		lblPatientAdmissions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPatientAdmissions.setBounds(10, 129, 146, 28);
		frame.getContentPane().add(lblPatientAdmissions);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 168, 796, 207);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"File No.", "No.", "Name", "Adm. Date ", "Patient Location ", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(116);
		table.getColumnModel().getColumn(1).setPreferredWidth(63);
		table.getColumnModel().getColumn(2).setPreferredWidth(132);
		table.getColumnModel().getColumn(3).setPreferredWidth(119);
		table.getColumnModel().getColumn(4).setPreferredWidth(153);
		table.getColumnModel().getColumn(5).setPreferredWidth(131);
		scrollPane.setViewportView(table);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing6 pa=new Swing6();
				pa.page6();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(707, 397, 89, 23);
		frame.getContentPane().add(btnBack);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(353, 397, 89, 23);
		frame.getContentPane().add(btnSave);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing8 pa=new Swing8();
				pa.page8();
				frame.setVisible(false);
			}
		});
		btnConfirm.setBounds(40, 397, 89, 23);
		frame.getContentPane().add(btnConfirm);
	}
}
