package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

import WEA_Logic.Anlegen;
import WEA_Logic.Preparation;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class registerBetriebsfuehrer {

	private JFrame frmBetriebsfhrungEintragen;
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
	private JTextField textField_16;
	
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2 ;
	private JComboBox<String> comboBox_3 ;
	private JComboBox<String> comboBox_4 ;
	
	public registerBetriebsfuehrer bf;
	

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the application.
	 */
	public registerBetriebsfuehrer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bf= this; 
		frmBetriebsfhrungEintragen = new JFrame();
		frmBetriebsfhrungEintragen.setTitle("Betriebsf\u00FChrung eintragen");
		frmBetriebsfhrungEintragen.setBounds(100, 100, 685, 435);
		frmBetriebsfhrungEintragen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBetriebsfhrungEintragen.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(12, 13, 314, 334);
		frmBetriebsfhrungEintragen.getContentPane().add(panel);
		
		JLabel lblBetriebsfhrung = new JLabel("Betriebsf\u00FChrung");
		lblBetriebsfhrung.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBetriebsfhrung.setBounds(12, 13, 117, 16);
		panel.add(lblBetriebsfhrung);
		
		JLabel lblWindpark = new JLabel("Windpark ");
		lblWindpark.setBounds(12, 42, 117, 16);
		panel.add(lblWindpark);
		
		JLabel label_2 = new JLabel("Firma");
		label_2.setBounds(12, 70, 97, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Titel");
		label_3.setBounds(12, 99, 56, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Anrede");
		label_4.setBounds(12, 128, 56, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Vorname");
		label_5.setBounds(12, 157, 56, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Nachname");
		label_6.setBounds(12, 186, 81, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Telefon");
		label_7.setBounds(12, 214, 56, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Telefon Mobil");
		label_8.setBounds(12, 243, 81, 16);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Fax");
		label_9.setBounds(12, 273, 56, 16);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("E-Mailadresse");
		label_10.setBounds(12, 302, 81, 16);
		panel.add(label_10);
		
		this.textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(165, 67, 116, 22);
		panel.add(textField);
		
		this.textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(165, 96, 116, 22);
		panel.add(textField_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Herr ", "Frau"}));
		comboBox.setBounds(165, 125, 116, 22);
		panel.add(comboBox);
		
		this.textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(165, 154, 116, 22);
		panel.add(textField_2);
		
		this.textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(165, 183, 116, 22);
		panel.add(textField_3);
		
		this.textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(165, 211, 116, 22);
		panel.add(textField_4);
		
		this.textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(165, 240, 116, 22);
		panel.add(textField_5);
		
		this.textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(165, 270, 116, 22);
		panel.add(textField_6);
		
		this.textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(165, 299, 116, 22);
		panel.add(textField_7);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(165, 39, 116, 22);
		panel.add(comboBox_3);
		Preparation p = new Preparation();
		try {
			ResultSet r = p.fillCombo();
			while (r.next()){
				comboBox_3.addItem(r.getNString(1));
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(338, 13, 314, 334);
		frmBetriebsfhrungEintragen.getContentPane().add(panel_1);
		
		JLabel lblBerichtsberechtigter = new JLabel("Berichtsberechtigter");
		lblBerichtsberechtigter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBerichtsberechtigter.setBounds(12, 13, 156, 16);
		panel_1.add(lblBerichtsberechtigter);
		
		JLabel lblWindpark_1 = new JLabel("Windpark");
		lblWindpark_1.setBounds(12, 42, 117, 16);
		panel_1.add(lblWindpark_1);
		
		JLabel label_13 = new JLabel("Firma");
		label_13.setBounds(12, 70, 97, 16);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Titel");
		label_14.setBounds(12, 99, 56, 16);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Anrede");
		label_15.setBounds(12, 128, 56, 16);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Vorname");
		label_16.setBounds(12, 157, 56, 16);
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("Nachname");
		label_17.setBounds(12, 186, 81, 16);
		panel_1.add(label_17);
		
		JLabel label_21 = new JLabel("E-Mailadresse");
		label_21.setBounds(12, 215, 81, 16);
		panel_1.add(label_21);
		
		this.textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(165, 67, 116, 22);
		panel_1.add(textField_9);
		
		this.textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(165, 96, 116, 22);
		panel_1.add(textField_10);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Herr ", "Frau"}));
		comboBox_1.setBounds(165, 125, 116, 22);
		panel_1.add(comboBox_1);
		
		this.textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(165, 154, 116, 22);
		panel_1.add(textField_11);
		
		this.textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(165, 183, 116, 22);
		panel_1.add(textField_12);
		
		this.textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(165, 215, 116, 22);
		panel_1.add(textField_16);
		
		JLabel lblBerichtsart = new JLabel("Berichtsart");
		lblBerichtsart.setBounds(12, 272, 81, 16);
		panel_1.add(lblBerichtsart);
		
		JComboBox<String> comboBox_2  = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Monatsbericht", "Kurzbericht", "St\u00F6rungsmeldung ", "Monatsbericht+ Kurzbericht", "Monatsbericht+ St\u00F6rungsmeldung", "Kurzbericht+ St\u00F6rungsmeldung ", "Alle"}));
		comboBox_2.setBounds(165, 269, 116, 22);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(165, 39, 116, 22);
		panel_1.add(comboBox_4);
		Preparation pr = new Preparation();
		try {
			ResultSet r = pr.fillCombo();
			while (r.next()){
				comboBox_4.addItem(r.getNString(1));
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anlegen a = new Anlegen(bf);
				
					try {				
						a.bfin(a);			
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
			}
		});
		btnSpeichern.setBounds(441, 360, 97, 25);
		frmBetriebsfhrungEintragen.getContentPane().add(btnSpeichern);
		
		JButton btnBeenden = new JButton("Beenden");
		btnBeenden.setBounds(555, 360, 97, 25);
		frmBetriebsfhrungEintragen.getContentPane().add(btnBeenden);
		
		frmBetriebsfhrungEintragen.setVisible(true);
	}

	public String getTextField() {
		String s = textField.getText();
		return s;
	}

	public String getTextField_1() {
		String s = textField_1.getText();
		return s;
		
	}

	public String getTextField_2() {
		String s = textField_2.getText();
		return s;
	}

	public String getTextField_3() {
		String s = textField_3.getText();
		return s;
	}

	public int getTextField_4() {
		int s = Integer.parseInt(textField_4.getText());
		return s;
	}

	public int getTextField_5() {
		int s = Integer.parseInt(textField_5.getText());
		return s;
	}

	public int getTextField_6() {
		int s = Integer.parseInt(textField_6.getText());
		return s;
	}

	public String getTextField_7() {
		String s = textField_7.getText();
		return s;
		
	}

	public String getTextField_9() {
		String s = textField_9.getText();
		return s;
	}

	public String getTextField_10() {
		String s = textField_10.getText();
		return s;
	}

	public String getTextField_11() {
		String s = textField_11.getText();
		return s;
	}

	public String getTextField_12() {
		String s = textField_12.getText();
		return s;
	}

	public String getTextField_16() {
		String s = textField_16.getText();
		return s;
	}

	public String getComboBox_1() {
		String s = comboBox_1.getSelectedItem().toString();
		return s;
		
	}

	public String getComboBox_2() {
		String s = comboBox_2.getSelectedItem().toString();
		return s;}

	public String getComboBox_3() {
		String s = comboBox_1.getSelectedItem().toString();
		return s;
	}

	public String getComboBox_4() {
		String s = comboBox_1.getSelectedItem().toString();
		return s;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}

	public void setTextField_11(JTextField textField_11) {
		this.textField_11 = textField_11;
	}

	public void setTextField_12(JTextField textField_12) {
		this.textField_12 = textField_12;
	}

	public void setTextField_16(JTextField textField_16) {
		this.textField_16 = textField_16;
	}

	public void setComboBox_1(JComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public void setComboBox_2(JComboBox<String> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public void setComboBox_3(JComboBox<String> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	public void setComboBox_4(JComboBox<String> comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}

	public String getComboBox() {
		// TODO Auto-generated method stub
		return null;
	}
}
