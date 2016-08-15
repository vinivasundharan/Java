package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import WEA_Logic.Anlegen;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class windparkRegister {

	public JFrame frmWindparkAnlegen;
	public JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_10;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JComboBox<String>  comboBox_1;
	private JComboBox<String>  comboBox_2;
	private JComboBox<String>  comboBox;
	private JComboBox<String>  comboBox_3;
	private JComboBox<String>  comboBox_4;
	

	private JButton btnWeaAnlegen; 
	private JButton btnBeenden;
	private JButton btnBetriebsfhrungEintragen;
	private JButton btnBeenden_1;
    public windparkRegister wp;
    public JPanel panel;
    private JTextField textField_19;
    
    
	/**
	 * Create the application.
	 */
	public windparkRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		wp = this;
		frmWindparkAnlegen = new JFrame();
		frmWindparkAnlegen.setTitle("Windpark anlegen");
		frmWindparkAnlegen.setBounds(100, 100, 647, 690);
		frmWindparkAnlegen.getContentPane().setLayout(null);
		
		btnBeenden = new JButton("Speichern");
		btnBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Anlegen a = new Anlegen(wp);
			;
				try {				
					a.wpin(a);			
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}});
		
		btnBeenden.setBounds(344, 577, 116, 25);
		frmWindparkAnlegen.getContentPane().add(btnBeenden);
		
	    btnWeaAnlegen = new JButton("WEA anlegen");
		btnWeaAnlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new stammDataEntry();}
		});
		btnWeaAnlegen.setBounds(375, 539, 194, 25);
		frmWindparkAnlegen.getContentPane().add(btnWeaAnlegen);
		
		this.textField = new JTextField();
		textField.setBounds(148, 78, 116, 22);
		frmWindparkAnlegen.getContentPane().add(textField);
		textField.setColumns(10);
		
		this.textField_1 = new JTextField();
		textField_1.setBounds(148, 107, 116, 22);
		frmWindparkAnlegen.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	    panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(12, 13, 279, 258);
		frmWindparkAnlegen.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWindpark = new JLabel("Windpark");
		lblWindpark.setBounds(12, 13, 81, 16);
		panel.add(lblWindpark);
		lblWindpark.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblWindparkname = new JLabel("WindparkID");
		lblWindparkname.setBounds(12, 42, 97, 16);
		panel.add(lblWindparkname);
		
		JLabel label = new JLabel("Windparkname");
		label.setBounds(12, 71, 97, 16);
		panel.add(label);
		
		JLabel lblAnzahlAnlagen = new JLabel("Anzahl Anlagen");
		lblAnzahlAnlagen.setBounds(12, 100, 97, 16);
		panel.add(lblAnzahlAnlagen);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(303, 13, 314, 334);
		frmWindparkAnlegen.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVertragspartner = new JLabel("Vertragspartner");
		lblVertragspartner.setBounds(12, 13, 117, 16);
		panel_1.add(lblVertragspartner);
		lblVertragspartner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblVertragspartnerid = new JLabel("VertragspartnerID");
		lblVertragspartnerid.setBounds(12, 42, 117, 16);
		panel_1.add(lblVertragspartnerid);
		
		JLabel lblFirma = new JLabel("Firma");
		lblFirma.setBounds(12, 70, 97, 16);
		panel_1.add(lblFirma);
		
		JLabel lblTitel = new JLabel("Titel");
		lblTitel.setBounds(12, 99, 56, 16);
		panel_1.add(lblTitel);
		
		JLabel lblAnrede = new JLabel("Anrede");
		lblAnrede.setBounds(12, 128, 56, 16);
		panel_1.add(lblAnrede);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(12, 157, 56, 16);
		panel_1.add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(12, 186, 81, 16);
		panel_1.add(lblNachname);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(12, 214, 56, 16);
		panel_1.add(lblTelefon);
		
		JLabel lblTelefonMobil = new JLabel("Telefon Mobil");
		lblTelefonMobil.setBounds(12, 243, 81, 16);
		panel_1.add(lblTelefonMobil);
		
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(12, 273, 56, 16);
		panel_1.add(lblFax);
		
		JLabel lblEmailadresse = new JLabel("E-Mailadresse");
		lblEmailadresse.setBounds(12, 302, 81, 16);
		panel_1.add(lblEmailadresse);
		
		this.textField_2 = new JTextField();
		textField_2.setBounds(165, 67, 116, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		this.textField_3 = new JTextField();
		textField_3.setBounds(165, 96, 116, 22);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		this.comboBox = new JComboBox<String>();
		comboBox.setBounds(165, 125, 116, 22);
		panel_1.add(comboBox);
		this.comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Herr ", "Frau"}));
		
		
		this.textField_4 = new JTextField();
		textField_4.setBounds(165, 154, 116, 22);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		this.textField_5 = new JTextField();
		textField_5.setBounds(165, 183, 116, 22);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		this.textField_6 = new JTextField();
		textField_6.setBounds(165, 211, 116, 22);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		this.textField_7 = new JTextField();
		textField_7.setBounds(165, 240, 116, 22);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		this.textField_8 = new JTextField();
		textField_8.setBounds(165, 270, 116, 22);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		this.textField_9 = new JTextField();
		textField_9.setBounds(165, 299, 116, 22);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(165, 39, 116, 22);
		panel_1.add(textField_19);
		textField_19.setColumns(10);
		
		JButton btnBetriebsfhrungEintragen = new JButton("Betriebsf\u00FChrung eintragen");
		btnBetriebsfhrungEintragen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new registerBetriebsfuehrer();
			}
		});
		btnBetriebsfhrungEintragen.setBounds(375, 501, 196, 25);
		frmWindparkAnlegen.getContentPane().add(btnBetriebsfhrungEintragen);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(285, 284, -260, 224);
		frmWindparkAnlegen.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(22, 288, 268, 326);
		frmWindparkAnlegen.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblStandort = new JLabel("Standort");
		lblStandort.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStandort.setBounds(12, 13, 99, 16);
		panel_3.add(lblStandort);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setBounds(12, 42, 56, 16);
		panel_3.add(lblLand);
		
		JLabel lblBundesland = new JLabel("Bundesland");
		lblBundesland.setBounds(12, 71, 65, 16);
		panel_3.add(lblBundesland);
		
		JLabel lblOrt = new JLabel("Ort");
		lblOrt.setBounds(12, 100, 56, 16);
		panel_3.add(lblOrt);
		
		JLabel lblPlz = new JLabel("PLZ");
		lblPlz.setBounds(12, 129, 56, 16);
		panel_3.add(lblPlz);
		
		JLabel lblKoordinatenDez = new JLabel("Koordinaten Dez");
		lblKoordinatenDez.setBounds(12, 156, 99, 16);
		panel_3.add(lblKoordinatenDez);
		
		JLabel lblKoordinatenUtm = new JLabel("Koordinaten UTM");
		lblKoordinatenUtm.setBounds(12, 180, 99, 16);
		panel_3.add(lblKoordinatenUtm);
		
		JLabel lblLage = new JLabel("Lage");
		lblLage.setBounds(12, 209, 56, 16);
		panel_3.add(lblLage);
		
		JLabel lblEntfernungZuCmc = new JLabel("Entfernung cmc");
		lblEntfernungZuCmc.setBounds(12, 235, 112, 16);
		panel_3.add(lblEntfernungZuCmc);
		
		JLabel lblEntfernungZumHotel = new JLabel("Entfernung Hotel");
		lblEntfernungZumHotel.setBounds(12, 263, 112, 21);
		panel_3.add(lblEntfernungZumHotel);
		
		JLabel lblHotelname = new JLabel("Hotelname");
		lblHotelname.setBounds(12, 297, 65, 16);
		panel_3.add(lblHotelname);
		
		this.comboBox_1 = new JComboBox<String>();
		this.comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Baden-W\u00FCrtemberg", "Bayern", "Berlin", "Brandenburg", "Bremen", "Hamburg", "Hessen", "Mecklenburg-Vorpommern", "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz", "Saarland", "Sachsen", "Sachsen-Anhalt", "Schleswig-Holstein", "Th\u00FCringen"}));
		comboBox_1.setBounds(126, 68, 116, 22);
		panel_3.add(comboBox_1);
		
		this.textField_11 = new JTextField();
		textField_11.setBounds(126, 97, 116, 22);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		this.textField_12 = new JTextField();
		textField_12.setBounds(126, 126, 116, 22);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		
		this.comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Germany"}));
		wp.comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"Deutschland"}));
		comboBox_2.setBounds(126, 39, 116, 22);
		panel_3.add(comboBox_2);
		
		this.textField_10 = new JTextField();
		textField_10.setBounds(126, 153, 116, 22);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		this.textField_13 = new JTextField();
		textField_13.setBounds(126, 177, 116, 22);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		this.comboBox_3 = new JComboBox<String>();
		this.comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"OnShore", "OffShore"}));
		comboBox_3.setBounds(126, 206, 116, 22);
		panel_3.add(comboBox_3);
		
		this.textField_14 = new JTextField();
		textField_14.setBounds(126, 232, 116, 22);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		this.textField_15 = new JTextField();
		textField_15.setBounds(126, 262, 116, 22);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		this.textField_16 = new JTextField();
		textField_16.setBounds(126, 294, 116, 22);
		panel_3.add(textField_16);
		textField_16.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBounds(303, 360, 314, 128);
		frmWindparkAnlegen.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblErstkontakt = new JLabel("Erstkontakt");
		lblErstkontakt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblErstkontakt.setBounds(12, 13, 79, 16);
		panel_4.add(lblErstkontakt);
		
		JLabel lblDienstleistung = new JLabel("Dienstleistung");
		lblDienstleistung.setBounds(12, 52, 98, 16);
		panel_4.add(lblDienstleistung);
		
		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setBounds(12, 81, 56, 16);
		panel_4.add(lblDatum);
		
		this.comboBox_4 = new JComboBox<String>();
	    this.comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Condition Monitoring", "Schadensbegutachtung ", "Videoendoskopie"}));
		comboBox_4.setBounds(162, 49, 116, 22);
		panel_4.add(comboBox_4);
		
		this.textField_17 = new JTextField();
		textField_17.setText("01.01.1990");
		textField_17.setBounds(162, 78, 116, 22);
		panel_4.add(textField_17);
		textField_17.setColumns(10);
		
		btnBeenden_1 = new JButton("Beenden");
		btnBeenden_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWindparkAnlegen.dispose();}
		});
		btnBeenden_1.setBounds(485, 577, 116, 25);
		frmWindparkAnlegen.getContentPane().add(btnBeenden_1);
		//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frmWindparkAnlegen.setVisible(true);
	}

	

	//public int getTextField_18() {
	//	int s = Integer.parseInt(textField_18.getText());
	//	return s;
	//}

	public int getTextField_19() {
		int s = Integer.parseInt(textField_19.getText());
		return s;
	}	

	public String getTextField() {
		String s = textField.getText();
		return s;
	}

	public int  getTextField_1() 
	{
		int s = Integer.parseInt(textField_1.getText());
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



	public String getTextField_4() {
		String s = textField_4.getText();
		return s;
	}



	public String getTextField_5() {
		String s = textField_5.getText();
		return s;
	}



	public String getTextField_6() {
		String s = textField_6.getText();
		return s;
	}



	public String getTextField_7() {
		String s = textField_7.getText();
		return s;
	}



	public String getTextField_8() {
		String s = textField_8.getText();
		return s;
	}



	public String getTextField_9() {
		String s = textField_9.getText();
		return s;
	}



	public String getTextField_11() {
		String s = textField_11.getText();
		return s;
	}



	public int getTextField_12() {
		int s = Integer.parseInt(textField_12.getText());
		return s;
	}



	public String getTextField_10() {
		String s = textField_10.getText();
		return s;
	}



	public String getTextField_13() {
		String s = textField_13.getText();
		return s;
	}



	public int getTextField_14() {
		int s = Integer.parseInt(textField_14.getText());
		return s;
	}



	public int getTextField_15() {
		int s = Integer.parseInt(textField_15.getText());
		return s;
	}



	public String getTextField_16() {
		String s = textField_16.getText();
		return s;
	}



	public String getTextField_17() {
		String s = textField_17.getText();
		return s;
	}



	public String getComboBox_1() {
		String s = comboBox_1.getSelectedItem().toString();
		return s;
	}



	public String getComboBox_2() {
		String s = comboBox_2.getSelectedItem().toString();
		return s;
	}



	public String getComboBox() {
		String s = comboBox.getSelectedItem().toString();
		return s;
	}



	public String getComboBox_3() {
		String s = comboBox_3.getSelectedItem().toString();
		return s;
	}



	public String getComboBox_4() {
		String s = comboBox_4.getSelectedItem().toString();
		return s;
	}



	public void setTextField(JTextField textField) {
		this.textField = textField;
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



	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}



	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}



	public void setTextField_11(JTextField textField_11) {
		this.textField_11 = textField_11;
	}



	public void setTextField_12(JTextField textField_12) {
		this.textField_12 = textField_12;
	}



	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}



	public void setTextField_13(JTextField textField_13) {
		this.textField_13 = textField_13;
	}



	public void setTextField_14(JTextField textField_14) {
		this.textField_14 = textField_14;
	}



	public void setTextField_15(JTextField textField_15) {
		this.textField_15 = textField_15;
	}



	public void setTextField_16(JTextField textField_16) {
		this.textField_16 = textField_16;
	}



	public void setTextField_17(JTextField textField_17) {
		this.textField_17 = textField_17;
	}



	public void setComboBox_1(JComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}



	public void setComboBox_2(JComboBox<String> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}



	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}



	public void setComboBox_3(JComboBox<String> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}



	public void setComboBox_4(JComboBox<String> comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}



	



	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}
}
