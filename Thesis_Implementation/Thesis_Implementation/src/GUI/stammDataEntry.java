package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

import WEA_Logic.Anlegen;
import WEA_Logic.Preparation;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class stammDataEntry {

	private JFrame frmWeaAnlegen;
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

	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_5;
	private JComboBox<String> comboBox_6;
	private JComboBox<String> comboBox_7;
	private JComboBox<String> comboBox_8;
	private JComboBox<String> comboBox_9;
	private JComboBox<String> comboBox_10;
	private JComboBox<String> comboBox_11;
	private JComboBox<String> comboBox_12;
	private JComboBox<String> comboBox_14;
	private JComboBox<String> comboBox_15;
	private JComboBox<String> comboBox_16;
	private JComboBox<String> comboBox_17;
	
	public stammDataEntry wea;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	
	/**
	 * Create the application.
	 */
	public stammDataEntry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		wea = this; 
		frmWeaAnlegen = new JFrame();
		frmWeaAnlegen.setTitle("WEA anlegen");
		frmWeaAnlegen.setBounds(100, 100, 985, 639);
		frmWeaAnlegen.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 429, 280, -424);
		frmWeaAnlegen.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(286, 429, -276, -424);
		frmWeaAnlegen.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 13, 336, 428);
		frmWeaAnlegen.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMaschinendaten = new JLabel("Maschinendaten");
		lblMaschinendaten.setBounds(23, 13, 125, 16);
		panel_2.add(lblMaschinendaten);
		lblMaschinendaten.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblIbndatum = new JLabel("IBN-Datum");
		lblIbndatum.setBounds(12, 41, 87, 16);
		panel_2.add(lblIbndatum);
		
		JLabel lblWeaSeriennummer = new JLabel("WEA Seriennummer");
		lblWeaSeriennummer.setBounds(12, 70, 125, 16);
		panel_2.add(lblWeaSeriennummer);
		
		JLabel lblWeaSeriennummerAlt = new JLabel("WEA Seriennummer alt");
		lblWeaSeriennummerAlt.setBounds(12, 99, 143, 16);
		panel_2.add(lblWeaSeriennummerAlt);
		
		JLabel lblWindpark = new JLabel("Windpark");
		lblWindpark.setBounds(12, 130, 56, 16);
		panel_2.add(lblWindpark);
		
		JLabel lblWindparkNr = new JLabel("Windpark Nr");
		lblWindparkNr.setBounds(12, 159, 87, 16);
		panel_2.add(lblWindparkNr);
		
		JLabel lblWeatyp = new JLabel("WEA-Typ");
		lblWeatyp.setBounds(12, 186, 56, 16);
		panel_2.add(lblWeatyp);
		
		JLabel lblHerstellerAktuell = new JLabel("Hersteller aktuell");
		lblHerstellerAktuell.setBounds(12, 212, 125, 16);
		panel_2.add(lblHerstellerAktuell);
		
		JLabel lblHerstellerAlt = new JLabel("Hersteller alt");
		lblHerstellerAlt.setBounds(12, 241, 87, 16);
		panel_2.add(lblHerstellerAlt);
		
		JLabel lblNennleistung = new JLabel("Nennleistung");
		lblNennleistung.setBounds(12, 270, 81, 16);
		panel_2.add(lblNennleistung);
		
		JLabel lblRotordurchmesser = new JLabel("Rotordurchmesser");
		lblRotordurchmesser.setBounds(12, 299, 105, 16);
		panel_2.add(lblRotordurchmesser);
		
		JLabel lblNabenhhe = new JLabel("Nabenh\u00F6he");
		lblNabenhhe.setBounds(12, 328, 81, 16);
		panel_2.add(lblNabenhhe);
		
		JLabel lblNewLabel = new JLabel("Regelungskonzept");
		lblNewLabel.setBounds(12, 357, 105, 16);
		panel_2.add(lblNewLabel);
		
		JLabel lblBaukonzeptturm = new JLabel("Baukonzeptturm");
		lblBaukonzeptturm.setBounds(12, 387, 105, 16);
		panel_2.add(lblBaukonzeptturm);
		
		this.textField = new JTextField();
		textField.setBounds(208, 67, 116, 22);
		panel_2.add(textField);
		textField.setColumns(10);
		
		this.textField_1 = new JTextField();
		textField_1.setBounds(208, 99, 116, 22);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		this.comboBox = new JComboBox<String>();
		comboBox.setBounds(208, 127, 116, 22);
		panel_2.add(comboBox);
		Preparation p = new Preparation();
		try {
			ResultSet r = p.fillCombo();
			while (r.next()){
				comboBox.addItem(r.getNString(1));
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.textField_2 = new JTextField();
		textField_2.setBounds(208, 156, 116, 22);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		 this.comboBox_1 = new JComboBox<String>();
		 comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"WEA 1", "WEA 2 ", "WEA 3"}));
		comboBox_1.setBounds(208, 183, 116, 22);
		panel_2.add(comboBox_1);
		
		 this.comboBox_2 = new JComboBox<String>();
		 comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Vestas", "Prokon ", "Senvion"}));
		comboBox_2.setBounds(208, 209, 116, 22);
		panel_2.add(comboBox_2);
		
		 this.comboBox_3 = new JComboBox<String>();
		 comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Vestas", "Prokon ", "Senvion"}));
		comboBox_3.setBounds(208, 238, 116, 22);
		panel_2.add(comboBox_3);
		
		this.textField_3 = new JTextField();
		textField_3.setBounds(208, 267, 87, 22);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		this.textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(208, 296, 87, 22);
		panel_2.add(textField_4);
		
		this.textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(208, 325, 87, 22);
		panel_2.add(textField_5);
		
		 this.comboBox_4 = new JComboBox<String>();
		 comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Pitch ", "Stall"}));
		comboBox_4.setBounds(208, 354, 116, 22);
		panel_2.add(comboBox_4);
		
	      this.comboBox_5 = new JComboBox<String>();
	      comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Stahlturm"}));
		comboBox_5.setBounds(208, 384, 116, 22);
		panel_2.add(comboBox_5);
		
		JLabel lblMw = new JLabel("MW");
		lblMw.setBounds(299, 270, 25, 16);
		panel_2.add(lblMw);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(307, 299, 11, 16);
		panel_2.add(lblM);
		
		JLabel label_7 = new JLabel("m");
		label_7.setBounds(307, 328, 17, 16);
		panel_2.add(label_7);
		
		this.textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(208, 38, 116, 22);
		panel_2.add(textField_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(320, 454, -310, 125);
		frmWeaAnlegen.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBounds(320, 454, -293, 125);
		frmWeaAnlegen.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(320, 454, -310, 112);
		frmWeaAnlegen.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 454, 334, 125);
		frmWeaAnlegen.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblSteighilfe = new JLabel("Steighilfe");
		lblSteighilfe.setBounds(12, 100, 56, 16);
		panel_6.add(lblSteighilfe);
		
		JLabel lblFahrstuhl = new JLabel("Fahrstuhl");
		lblFahrstuhl.setBounds(12, 71, 56, 16);
		panel_6.add(lblFahrstuhl);
		
		JLabel lblNewLabel_2 = new JLabel("Steigschutzsystem");
		lblNewLabel_2.setBounds(12, 42, 112, 16);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Steighilfe");
		lblNewLabel_1.setBounds(12, 13, 89, 16);
		panel_6.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		 this.comboBox_7 = new JComboBox<String>();
		 comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Test 1 ", "Test 2"}));
		comboBox_7.setBounds(206, 39, 116, 22);
		panel_6.add(comboBox_7);
		
		 this.comboBox_6 = new JComboBox<String>();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Ja", "Nein"}));
		comboBox_6.setBounds(206, 68, 116, 22);
		panel_6.add(comboBox_6);
		
		 this.comboBox_8 = new JComboBox<String>();
		 comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Schiene"}));
		comboBox_8.setBounds(206, 97, 116, 22);
		panel_6.add(comboBox_8);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_7.setBounds(358, 13, 258, 256);
		frmWeaAnlegen.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblHauptlager = new JLabel("Hauptlager");
		lblHauptlager.setBounds(12, 13, 77, 20);
		panel_7.add(lblHauptlager);
		lblHauptlager.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblLagerI = new JLabel("Lager I");
		lblLagerI.setBounds(12, 46, 56, 16);
		panel_7.add(lblLagerI);
		
		JLabel lblTyp = new JLabel("Typ");
		lblTyp.setBounds(12, 75, 56, 16);
		panel_7.add(lblTyp);
		
		JLabel lblLagerIi = new JLabel("Lager II");
		lblLagerIi.setBounds(12, 171, 56, 16);
		panel_7.add(lblLagerIi);
		
		JLabel label = new JLabel("Typ");
		label.setBounds(12, 200, 56, 16);
		panel_7.add(label);
		
		this.textField_7 = new JTextField();
		textField_7.setBounds(130, 43, 116, 22);
		panel_7.add(textField_7);
		textField_7.setColumns(10);
		
		this.textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(130, 72, 116, 22);
		panel_7.add(textField_8);
		
		this.textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(130, 168, 116, 22);
		panel_7.add(textField_9);
		
		this.textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(130, 197, 116, 22);
		panel_7.add(textField_10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(206, 98, 40, 22);
		panel_7.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(206, 133, 40, 22);
		panel_7.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(206, 221, 40, 22);
		panel_7.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel lblLagernr = new JLabel("LagerNr");
		lblLagernr.setBounds(12, 101, 56, 16);
		panel_7.add(lblLagernr);
		
		JLabel lblGesamtanzahl = new JLabel("Gesamtanzahl");
		lblGesamtanzahl.setBounds(12, 136, 106, 16);
		panel_7.add(lblGesamtanzahl);
		
		JLabel lblLagernr_1 = new JLabel("LagerNr");
		lblLagernr_1.setBounds(12, 224, 56, 16);
		panel_7.add(lblLagernr_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_8.setBounds(358, 273, 258, 74);
		frmWeaAnlegen.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblLagerungskonzept_1 = new JLabel("Lagerungskonzept");
		lblLagerungskonzept_1.setBounds(12, 45, 103, 16);
		panel_8.add(lblLagerungskonzept_1);
		
		this.comboBox_9 = new JComboBox<String>();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Drehmomentst\u00FCtzen ", "Drehmomentst\u00FCtzen  1 Hauptlager ", "Drehmomentst\u00FCtzen  2 Hauptlager"}));
		comboBox_9.setBounds(135, 42, 111, 22);
		panel_8.add(comboBox_9);
		
		JLabel lblLagerungskonzept = new JLabel("Antriebsstrang");
		lblLagerungskonzept.setBounds(12, 16, 143, 16);
		panel_8.add(lblLagerungskonzept);
		lblLagerungskonzept.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_9.setBounds(358, 360, 258, 219);
		frmWeaAnlegen.getContentPane().add(panel_9);
		panel_9.setLayout(null);
		
		this.textField_11 = new JTextField();
		textField_11.setBounds(130, 187, 116, 22);
		panel_9.add(textField_11);
		textField_11.setColumns(10);
		
		this.textField_12 = new JTextField();
		textField_12.setBounds(130, 152, 116, 22);
		panel_9.add(textField_12);
		textField_12.setColumns(10);
		
		this.textField_13 = new JTextField();
		textField_13.setBounds(130, 128, 116, 22);
		panel_9.add(textField_13);
		textField_13.setColumns(10);
		
		 this.comboBox_10 = new JComboBox<String>();
		 comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"1 Planetenstufe 2 Stirnradstufen ", "2 Planetenstufen 2 Stirnradstuden ", "3 Stirnradstufen"}));
		comboBox_10.setBounds(130, 39, 116, 22);
		panel_9.add(comboBox_10);
		
		 this.comboBox_11 = new JComboBox<String>();
		 comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Firma1", "Firma2 "}));
		comboBox_11.setBounds(130, 66, 116, 22);
		panel_9.add(comboBox_11);
		
		 this.comboBox_12 = new JComboBox<String>();
		 comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"T1", "T2"}));
		comboBox_12.setBounds(130, 95, 116, 22);
		panel_9.add(comboBox_12);
		
		JLabel lblBaujahr = new JLabel("Baujahr");
		lblBaujahr.setBounds(12, 184, 56, 16);
		panel_9.add(lblBaujahr);
		
		JLabel lblbersetzung = new JLabel("\u00DCbersetzung");
		lblbersetzung.setBounds(12, 155, 77, 16);
		panel_9.add(lblbersetzung);
		
		JLabel lblSeriennummer = new JLabel("SerienNr");
		lblSeriennummer.setBounds(12, 131, 77, 16);
		panel_9.add(lblSeriennummer);
		
		JLabel lblTypIi = new JLabel("Typ I");
		lblTypIi.setBounds(12, 98, 56, 16);
		panel_9.add(lblTypIi);
		
		JLabel lblTypI = new JLabel("Hersteller");
		lblTypI.setBounds(12, 69, 56, 16);
		panel_9.add(lblTypI);
		
		JLabel lblKonzept = new JLabel("Konzept");
		lblKonzept.setBounds(12, 42, 56, 16);
		panel_9.add(lblKonzept);
		
		JLabel lblGetriebe = new JLabel("Getriebe");
		lblGetriebe.setBounds(12, 13, 77, 16);
		panel_9.add(lblGetriebe);
		lblGetriebe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblGenerator = new JLabel("Generator");
		lblGenerator.setBounds(648, 41, 56, -12);
		frmWeaAnlegen.getContentPane().add(lblGenerator);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_10.setBounds(628, 13, 318, 444);
		frmWeaAnlegen.getContentPane().add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblGenerator_1 = new JLabel("Generator");
		lblGenerator_1.setBounds(12, 13, 70, 20);
		panel_10.add(lblGenerator_1);
		lblGenerator_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblKonzept_1 = new JLabel("Konzept");
		lblKonzept_1.setBounds(12, 46, 56, 16);
		panel_10.add(lblKonzept_1);
		
		JLabel lblHersteller = new JLabel("Hersteller");
		lblHersteller.setBounds(12, 75, 56, 16);
		panel_10.add(lblHersteller);
		
		JLabel lblTyp_1 = new JLabel("Typ");
		lblTyp_1.setBounds(12, 104, 56, 16);
		panel_10.add(lblTyp_1);
		
		JLabel lblSeriennr = new JLabel("SerienNr");
		lblSeriennr.setBounds(12, 130, 56, 16);
		panel_10.add(lblSeriennr);
		
		JLabel lblBaujahr_1 = new JLabel("Baujahr");
		lblBaujahr_1.setBounds(12, 156, 56, 16);
		panel_10.add(lblBaujahr_1);
		
		JLabel lblGeneratorNr = new JLabel("Generator Nr");
		lblGeneratorNr.setBounds(12, 185, 84, 22);
		panel_10.add(lblGeneratorNr);
		
		JLabel label_1 = new JLabel("Konzept");
		label_1.setBounds(12, 251, 56, 16);
		panel_10.add(label_1);
		
		JLabel label_2 = new JLabel("Hersteller");
		label_2.setBounds(12, 278, 56, 16);
		panel_10.add(label_2);
		
		JLabel label_3 = new JLabel("Typ");
		label_3.setBounds(12, 322, 56, 16);
		panel_10.add(label_3);
		
		JLabel label_4 = new JLabel("SerienNr");
		label_4.setBounds(12, 351, 56, 16);
		panel_10.add(label_4);
		
		JLabel label_5 = new JLabel("Baujahr");
		label_5.setBounds(12, 380, 56, 16);
		panel_10.add(label_5);
		
		JLabel label_6 = new JLabel("Generator Nr");
		label_6.setBounds(12, 409, 84, 22);
		panel_10.add(label_6);
		
		JLabel lblNewLabel_3 = new JLabel("Anzahl Generatoren gesamt");
		lblNewLabel_3.setBounds(91, 220, 168, 16);
		panel_10.add(lblNewLabel_3);
		
		this.comboBox_14 = new JComboBox<String>();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"Synchrongenerator", "Asynchrongenerator", "Permanentmagner erregte Generatoren"}));
		comboBox_14.setBounds(136, 43, 111, 22);
		panel_10.add(comboBox_14);
		
		this.comboBox_15 = new JComboBox<String>();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"Firma3 ", "Firma4"}));
		comboBox_15.setBounds(136, 72, 111, 22);
		panel_10.add(comboBox_15);
		
		this.textField_14 = new JTextField();
		textField_14.setBounds(136, 101, 116, 22);
		panel_10.add(textField_14);
		textField_14.setColumns(10);
		
		this.textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(136, 127, 116, 22);
		panel_10.add(textField_15);
		
		this.textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(136, 153, 116, 22);
		panel_10.add(textField_16);
		
		this.textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(221, 185, 31, 22);
		panel_10.add(textField_17);
		
		this.textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(271, 217, 31, 22);
		panel_10.add(textField_18);
		
		this.comboBox_16 = new JComboBox<String>();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"Synchrongenerator", "Asynchrongenerator", "Permanentmagner erregte Generatoren"}));
		comboBox_16.setBounds(136, 248, 111, 22);
		panel_10.add(comboBox_16);
		
		this.comboBox_17 = new JComboBox<String>();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"Firma3 ", "Firma4"}));
		comboBox_17.setBounds(136, 275, 111, 22);
		panel_10.add(comboBox_17);
		
		this.textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(136, 319, 116, 22);
		panel_10.add(textField_19);
		
		this.textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(136, 348, 116, 22);
		panel_10.add(textField_20);
		
		this.textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(136, 377, 116, 22);
		panel_10.add(textField_21);
		
		this.textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(221, 409, 31, 22);
		panel_10.add(textField_22);
		
		JButton btnBeenden = new JButton("Beenden");
		btnBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWeaAnlegen.dispose();}
		});
		btnBeenden.setBounds(796, 527, 150, 25);
		frmWeaAnlegen.getContentPane().add(btnBeenden);
		
		JButton btnbernehmen = new JButton("Speichern");
		btnbernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Anlegen a = new Anlegen(wea);
			//	System.out.println("Debug 0.2");
				try {
			//		System.out.println("Debug 0.3");
					a.weain(a);
					btnbernehmen.setLabel("gespeichert");;
			//		System.out.println("debug 1");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnbernehmen.setBounds(628, 527, 150, 25);
		frmWeaAnlegen.getContentPane().add(btnbernehmen);
		
		JButton btnKatalogeVerwalten = new JButton("Kataloge verwalten");
		btnKatalogeVerwalten.setEnabled(false);
		btnKatalogeVerwalten.setBounds(628, 489, 318, 25);
		frmWeaAnlegen.getContentPane().add(btnKatalogeVerwalten);
		//frmWeaAnlegen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWeaAnlegen.setVisible(true);
	}

	public int getTextField_23() {
		int s = Integer.parseInt(textField_23.getText());
		return s;
	}

	public int getTextField_24() {
		int s = Integer.parseInt(textField_24.getText());
		return s;
	}

	public int getTextField_25() {
		int s = Integer.parseInt(textField_25.getText());
		return s;
	}

	

	public String getComboBox() {
		String s = comboBox.getSelectedItem().toString() ; 
		return s; 
	}

	public String getComboBox_1() {
		String s = comboBox_1.getSelectedItem().toString() ; 
		return s; 
	}

	public String getComboBox_2() {
		String s = comboBox_2.getSelectedItem().toString() ; 
		return s; 
	}

	public String getComboBox_3() {
		String s = comboBox_3.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_4() {
		String s = comboBox_4.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_5() {
		String s = comboBox_5.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_6() {
		String s = comboBox_6.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_7() {
		String s = comboBox_7.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_8() {
		String s = comboBox_8.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_9() {
		String s = comboBox_9.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_10() {
		String s = comboBox_10.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_11() {
		String s = comboBox_11.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_12() {
		String s = comboBox_12.getSelectedItem().toString() ; 
		return s;
	}

	//public String getComboBox_13() {
	//	String s = comboBox_13.getSelectedItem().toString() ; 
	//	return s;
	//}

	public String getComboBox_14() {
		String s = comboBox_14.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_15() {
		String s = comboBox_15.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_16() {
		String s = comboBox_16.getSelectedItem().toString() ; 
		return s;
	}

	public String getComboBox_17() {
		String s = comboBox_17.getSelectedItem().toString() ; 
		return s;
	}

	

	public String getTextField() {
		String s = textField.getText();
		return s; 
	}

	public String getTextField_1() {
		String s = textField_1.getText();
		return s;
	}

	public int getTextField_2() {
		int s = Integer.parseInt(textField_2.getText());
		return s;
	}

	public int getTextField_3() {
		int s = Integer.parseInt(textField_3.getText());
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

	public String getTextField_10() {
		String s = textField_10.getText();
		return s; 
	}

	public int getTextField_11() {
		int s = Integer.parseInt(textField_11.getText());
		return s;
	}

	public String getTextField_12() {
		String s = textField_12.getText();
		return s;
	}

	public String getTextField_13() {
		String s = textField_13.getText();
		return s;	}

	public String getTextField_14() {
		String s = textField_14.getText();
		return s;
	}

	public String getTextField_15() {
		String s = textField_15.getText();
		return s;
	}

	public int getTextField_16() {
		int s = Integer.parseInt(textField_16.getText());
		return s;
	}

	public int getTextField_17() {
		int s = Integer.parseInt(textField_17.getText());
		return s;
	}

	public int getTextField_18() {
		int s = Integer.parseInt(textField_18.getText());
		return s;
	}

	public String getTextField_19() {
		String s = textField_19.getText();
		return s;
	}

	public String getTextField_20() {
		String s = textField_20.getText();
		return s;
	}

	public int getTextField_21() {
		int s = Integer.parseInt(textField_21.getText());
		return s;
	}

	public int getTextField_22() {
		int s = Integer.parseInt(textField_22.getText());
		return s;
	}
}
