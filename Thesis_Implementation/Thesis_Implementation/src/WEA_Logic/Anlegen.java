package WEA_Logic;

import java.sql.SQLException;

import javax.swing.JFrame;

import com.microsoft.sqlserver.jdbc.SQLServerStatement;

import Data.DBVerbindung;
import GUI.registerBetriebsfuehrer;
import GUI.stammDataEntry;
import GUI.windparkRegister;

public class Anlegen{// extends windparkRegister {

	DBVerbindung connect;   // Speichert die Verbindung zu der Datenbank
	
	// Variablen für Windpark anlegen
	public int wpId, countWEA;
	public String wpName;
	public int plz,cmc,hotel;
	public String land,bland,city,coordD,coordU,location,hotelname;
	public int comp_ID;
	public String company,title,mrmrs,prename,name,tnumber,hnumber,fax,email;
	public String service, date; 
	// Variablen für die WEA anlegen
	// Wea
    public int wea_ID,  power,d, high,weanumb;
    public String ibnDate,seriesn,seriesold,type,concept_wea,tower_concept,manufact,manufact_old,wpname;
	// Steigschutz
    public String savesystem,help,elevator; 
    // Hauptlager
	public String type_mainb,code;  // erstes Hauptlager
	public int countbear, bearnr;
	public String type_mainb2, code2;  // zweites Hauptlager
	public int bearnr2; 
	// Antriebstrang 
	public String conceptbear; 
	// Getriebe
	public String conceptgetr,manufactorg,typeg,seriesnrg,translate;
	public int year;
	// Generator
	public int yeargen,genges,gennr; 		// erster Generator
	public String conceptgen,manufactgen,typegen,seriesnrgen;
	public int yeargen2,gennr2;            // zweiter Generator
	public String conceptgen2,manufactgen2,typegen2,seriesnrgen2;

	
	// Variablen für Betriebsführung
	public String companybf,namebf,prenamebf, titelbf, mr, emailbf,wp;
	public int phone,handy,faxbf, bf_ID, wp_ID,V_ID; 
	public int bb_ID;

	//Variablen für Berichtsberechtigte
	public String companybb, titelbb,mrbb,prenamebb,namebb,emailbb, reportbb, wpbb; 
	
	// ID Variablen einmal pro Klasse festlegen und definieren
	private static int idWEAcounter = 0 ;
	private static int idWPcounter = 99;
	private static int bfcounter = 99;
	private static int bbcounter = 99;
	
	// Methoden
	public Anlegen(){}
	
	
	
	
	public Anlegen(windparkRegister wp){		 
		
	// Aulesen der Werte aus der GUI Windpark anlegen	
		
	idWPcounter = idWPcounter++;	// eindeutige ID setzen
		
	wpId =idWPcounter;
	wpName = wp.textField.getText(); 
	countWEA = wp.getTextField_1();
	
	land  = wp.getComboBox_2();
	bland   = wp.getComboBox_1(); 
	city   = wp.getTextField_11();
	plz    = wp.getTextField_12();
	coordD = wp.getTextField_10();
	coordU = wp.getTextField_13();
	location = wp.getComboBox_3(); 
	cmc    = wp.getTextField_14(); 
	hotel  = wp.getTextField_15();
	hotelname = wp.getTextField_16();
	
	comp_ID = wp.getTextField_19();
	company = wp.getTextField_2(); 
	title   = wp.getTextField_3();  
	 mrmrs  = wp.getComboBox();	 
	 prename = wp.getTextField_4();	 
	name =    wp.getTextField_5();	 
	tnumber = wp.getTextField_6();
	hnumber = wp.getTextField_7();
	fax = wp.getTextField_8(); 
	email   = wp.getTextField_9();
	
	service = wp.getComboBox_4();
	date    = wp.getTextField_17();
	}	
	
	public Anlegen(stammDataEntry wea)
	{
		// Auslesen der Werte aus der GUI stammDataEntry
		
		idWEAcounter = ++idWEAcounter;  // eindeutige ID zuweisen
		
		wea_ID = idWEAcounter; 
		power = wea.getTextField_3(); 
		d = wea.getTextField_4(); 
		high = wea.getTextField_5(); 
		weanumb = wea.getTextField_2(); 
		
		ibnDate = wea.getTextField_6();
		seriesn = wea.getTextField();
		seriesold = wea.getTextField_1();
		wpname = wea.getComboBox();
		type = wea.getComboBox_1(); 
		manufact = wea.getComboBox_2();
		manufact_old = wea.getComboBox_3(); 
		concept_wea = wea.getComboBox_4(); 
		tower_concept = wea.getComboBox_5();
		
		savesystem = wea.getComboBox_7();
		help = wea.getComboBox_6();
		elevator = wea.getComboBox_8();
		
		conceptbear = wea.getComboBox_9();
		
		conceptgetr = wea.getComboBox_10();
		manufactorg = wea.getComboBox_11(); 
		typeg = wea.getComboBox_12();		
		seriesnrg = wea.getTextField_13(); 
		translate = wea.getTextField_12();
		year = wea.getTextField_11(); 
		
		yeargen = wea.getTextField_16(); 
		genges = wea.getTextField_18();
		gennr = wea.getTextField_17();
		conceptgen = wea.getComboBox_14();
		manufactgen = wea.getComboBox_15();
		typegen = wea.getTextField_14();
		seriesnrgen = wea.getTextField_15();
		
		 yeargen2 = wea.getTextField_21();
		 gennr2 = wea.getTextField_22();
		 conceptgen2 = wea.getComboBox_16();
		 manufactgen2 = wea.getComboBox_17();
		 typegen2 = wea.getTextField_19();
		 seriesnrgen2 = wea.getTextField_20();
		 
		 type_mainb = wea.getTextField_7();
		 code = wea.getTextField_8();
		 countbear = wea.getTextField_23();
		 bearnr = wea.getTextField_24();
	     type_mainb2 = wea.getTextField_9();
	     code2 = wea.getTextField_10();
		 bearnr2 = wea.getTextField_25();
	}
	
	public Anlegen(registerBetriebsfuehrer b)
	{
		bf_ID = bfcounter++;
		bb_ID = bbcounter++;
		
		V_ID = 0;
		wp_ID = 0;		
		wp = b.getComboBox_3();
		companybf = b.getTextField(); 
		titelbf = b.getTextField_1(); 
		mr = b.getComboBox();
		prenamebf = b.getTextField_2(); 
		namebf = b.getTextField_3();
		phone = b.getTextField_4(); 
		handy = b.getTextField_5(); 
		faxbf = b.getTextField_6();
		emailbf = b.getTextField_7();
		
			wp = b.getComboBox_4(); 
			companybb = b.getTextField_9(); 
			titelbb = b.getTextField_10(); 
			mrbb = b.getComboBox_1(); 
			prenamebb = b.getTextField_11(); 
			namebb = b.getTextField_12();
			emailbb = b.getTextField_16(); 
			reportbb = b.getComboBox_2();
	}
	
	
	public void wpin(Anlegen a)
	{
		try{
		connect = new DBVerbindung(); 
		
		connect.insertWP(a);
		}catch(Exception e){e.printStackTrace();}
	}
	
	public void weain(Anlegen a)
	{
		try{
			connect = new DBVerbindung(); 
			
			connect.insertWEA(a);
			}catch(Exception e){e.printStackTrace();}
	}
	
	public void bfin(Anlegen a)
	{
		try{
			connect = new DBVerbindung(); 
			;
			connect.insertBF(a);
			}catch(Exception e){e.printStackTrace();}
	}
}

