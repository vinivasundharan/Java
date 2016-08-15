package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import WEA_Logic.Anlegen;

public class DBVerbindung {

	Connection con; 
	Statement statm; 
	
	public DBVerbindung() throws SQLException
	{
		try
	  {
			String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:54363;"
					+ "databaseName=Stammdaten;integratedSecurity=true";   
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
		   //con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;integratedSecurity=true;");
	  }
	  catch ( Exception e )
	  {
	  e.printStackTrace();
	  }
	  finally
	  {
	  //if ( con != null )
	   // try { con.close(); } catch ( SQLException e ) { e.printStackTrace(); }
	  }
	
	   try 
	   {
		statm =con.createStatement();
	   } 
	   catch (SQLException e) {
		
	   e.printStackTrace();
	   }
	 }
	
	
	
	
	public void insertWP(Anlegen a) throws SQLException{
	
	System.out.println("debug 2");
	String tabWP ="INSERT INTO Windpark(Windparkname,Vertragspartner,"
			+ "Parkvernetzung,Windpark_ID,Anzahl_Anlagen)values(?,?,?,?,?)" ;
	PreparedStatement wp = con.prepareStatement(tabWP);
	wp.setString(1, a.wpName.trim());
	System.out.println("1:"+a.wpName.trim());
	wp.setString(2, a.company);
	System.out.println("1:"+a.company);
	wp.setString(3, "dh");
	System.out.println("1:dh");
	wp.setInt(4, a.wpId);
	System.out.println("1:"+a.wpId);
	wp.setInt(5, a.countWEA);
	System.out.println("1:"+a.countWEA);
	wp.execute();
	
	
	
	String comptab = "INSERT INTO Vertragspartner(Vertragspartner_ID,Firma,Anrede,"
			+ "Vorname,Nachname,Telefon,Telefonmobil,Fax,[E-mailadresse])"
			+ "values(?,?,?,?,?,?,?,?,?)";
	PreparedStatement comp = con.prepareStatement(comptab);
	comp.setInt(1, a.comp_ID);
	comp.setString(2, a.company);
	comp.setString(3, a.mrmrs);
	comp.setString(4, a.prename);
	comp.setString(5, a.name);
	comp.setString(6, a.tnumber);
	comp.setString(7, a.hnumber);
	comp.setString(8, a.fax);
	comp.setString(9, a.email);
	comp.execute(); 
	
	
	PreparedStatement location = con.prepareStatement("INSERT INTO Standort"
			+ "(Land,Bundesland,Ort,Postleitzahl,"
			+ "KoordinatenDez,KoordinatenUTM,Lage,Windpark_ID,[EntfernungWP zu cmc],"
			+ "nächstesHotelEntfernungWP,Hotelname,Standortkrzl)"
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?)");
	location.setString(1, a.land);
	location.setString(2, a.bland);
	location.setString(3, a.city);
	location.setInt(4, a.plz);
	location.setString(5, a.coordD);
	location.setString(6, a.coordU);
	location.setString(7, a.location);
	location.setInt(8, a.wpId);
	location.setInt(9, a.cmc);
	location.setInt(10, a.hotel);
	location.setString(11, a.hotelname);
	location.setString(12, null);
	location.execute();
	
	String fcontacttab = "INSERT INTO Erstkontakt(Windpark_ID,"
			+ "Vertragspartner_ID,Dienstleistung,Datum)values(?,?,?,?)";
	PreparedStatement fcontact = con.prepareStatement(fcontacttab);
	fcontact.setInt(1, a.wpId);
	fcontact.setString(2, "1");
	fcontact.setString(3, a.service);
	fcontact.setString(4,null); // DateSpalte :( 
	fcontact.execute(); 
	System.out.println("debug 3");
	}
	
	
	public void insertWEA(Anlegen a)throws SQLException{		
		
		String weatab ="INSERT INTO Windenergieanlagen(WEA_ID,[IBN Datum],"
				+ "Seriennummer,Seriennummer_alt,Typ,Nennleistung, Rotordurchmesser,Nabenhöhe,"
				+ "Regelungskonzept,[Baukonzept Turm],Hersteller, Hersteller_alt, Windpark, interneParknummer)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
		PreparedStatement wea = con.prepareStatement(weatab);
		wea.setInt(1,a.wea_ID );
		wea.setString(2,a.ibnDate);
		wea.setString(3,a.seriesn );
		wea.setString(4,a.seriesold);
		wea.setString(5, a.type);
		wea.setInt(6, a.power); 
		wea.setInt(7,a.d);
		wea.setInt(8,a.high );
		wea.setString(9, a.concept_wea);
		wea.setString(10, a.tower_concept);
		wea.setString(11,a.manufact);
		wea.setString(12, a.manufact_old);
		wea.setString(13, a.wpname);
		wea.setInt(14, a.weanumb);
		wea.execute();
		
		
		String steigtab = "INSERT INTO Steighilfe(Steigschutzsystem,Steighilfe,"
				+ "Fahrstuhl, WEA_ID) values (?,?,?,?)"; 
	    PreparedStatement steig = con.prepareStatement(steigtab);
	    steig.setString(1, a.savesystem);
	    steig.setString(2, a.help);
	    steig.setString(3, a.elevator);
	    steig.setInt(4, a.wea_ID);
	    steig.execute();
	    
	    String generatortab = "INSERT INTO Generator(Konzept,Hersteller,Typ, "
	    		+ "Seriennummer, bauhjahr,AnzahlGeneratorenGes, GeneratorNr, WEA_ID)values(?,?,?,?,?,?,?,?)"; 
	    PreparedStatement  generator = con.prepareStatement(generatortab);
	    generator.setString(1, a.conceptgen);
	    generator.setString(2, a.manufactgen);
	    generator.setString(3, a.typegen);
	    generator.setString(4, a.seriesnrgen);
	    generator.setInt(5, a.yeargen);
	    generator.setInt(6, a.genges);
	    generator.setInt(7, a.gennr);
	    generator.setInt(8, a.wea_ID);
	    generator.execute();
	    
	    String generatortab2 = "INSERT INTO Generator(Konzept,Hersteller,Typ, "
	    		+ "Seriennummer, bauhjahr,AnzahlGeneratorenGes, GeneratorNr, WEA_ID)values(?,?,?,?,?,?,?,?)"; 
	    PreparedStatement  generator2 = con.prepareStatement(generatortab2);
	    generator2.setString(1, a.conceptgen2);
	    generator2.setString(2, a.manufactgen2);
	    generator2.setString(3, a.typegen2);
	    generator2.setString(4, a.seriesnrgen2);
	    generator2.setInt(5, a.yeargen2);
	    generator2.setInt(6, a.genges);
	    generator2.setInt(7, a.gennr2);
	    generator2.setInt(8, a.wea_ID);
	    generator2.execute();
	
	    String getriebetab = "INSERT INTO Getriebe(Konzept, Hersteller, Typ, "
	    		+ "Seriennummer, Übersetzungsverhältnis, Baujahr, WEA_ID)values(?,?,?,?,?,?,?)"; 
	    PreparedStatement  getriebe = con.prepareStatement(getriebetab);
	    getriebe.setString(1, a.conceptgetr);
	    getriebe.setString(2, a.manufactorg);
	    getriebe.setString(3, a.typeg);
	    getriebe.setString(4, a.seriesnrg);
	    getriebe.setString(5, a.translate);
	    getriebe.setInt(6, a.year);
	    getriebe.setInt(7, a.wea_ID);
	    getriebe.execute();
	    
	    
	    String hauptlagertab ="INSERT INTO Hauptlager(Typ,Code,GesamtanzahlLager,"
	    		+ "LagerNr, WEA_ID)values(?,?,?,?,?)";
	    PreparedStatement  hauptlager = con.prepareStatement(hauptlagertab);
	    hauptlager.setString(1, a.type_mainb);
	    hauptlager.setString(2, a.code);
	    hauptlager.setInt(3, a.countbear);
	    hauptlager.setInt(4, a.bearnr);
	    hauptlager.setInt(5, a.wea_ID);
	    hauptlager.execute();
	    
	    String hauptlagertab2 ="INSERT INTO Hauptlager(Typ,Code,GesamtanzahlLager,"
	    		+ "LagerNr, WEA_ID)values(?,?,?,?,?)";
	    PreparedStatement  hauptlager2 = con.prepareStatement(hauptlagertab2);
	    hauptlager2.setString(1, a.type_mainb2);
	    hauptlager2.setString(2, a.code2);
	    hauptlager2.setInt(3, a.countbear);
	    hauptlager2.setInt(4, a.bearnr2);
	    hauptlager2.setInt(5, a.wea_ID);
	    hauptlager2.execute();
	    
	    String antriebsstrangtab = "INSERT INTO Antriebsstrang"
	    		+ "(Lagerungskonzept,WEA_ID)values(?,?)"; 
	    PreparedStatement  antriebsstrang = con.prepareStatement(antriebsstrangtab);
	    antriebsstrang.setString(1, a.conceptbear);
	    antriebsstrang.setInt(2, a.wea_ID);
	    antriebsstrang.execute();
	    
	   	
	}
		public void insertBF(Anlegen a) throws SQLException
		{
			String bf = "INSERT INTO Betriebsführung(Betriebsführung_ID,Vertragspartner_ID,Windpark_ID,Firma,Titel,Anrede,Vorname,Name,Telefon,TelefonMobil,Fax,[E-Mailadresse])values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement bef = con.prepareStatement(bf);
			bef.setInt(1,a.bf_ID);
			bef.setInt(2, a.V_ID);
			bef.setInt(3,a.wp_ID);
			bef.setString(4, a.companybf);
			bef.setString(5, a.title);
			bef.setString(6, a.mr);
			bef.setString(7, a.prenamebf);
			bef.setString(8, a.namebf);
			bef.setInt(9,a.phone);
			bef.setInt(10,a.handy);
			bef.setInt(11,a.faxbf);
			bef.setString(12,a.emailbf);
			bef.execute();
			
			String bb = "INSERT INTO Berichtsberechtigte(Berichtsberecht_ID,Windpark_ID,Firma,Anrede,Vorname,Nachname,[E-Mailadresse],Berichtsart)values(?,?,?,?,?,?,?,?)";
			PreparedStatement bbb = con.prepareStatement(bb);
			bbb.setInt(1,a.bb_ID);
			bbb.setInt(2, a.V_ID);
			bbb.setInt(3,a.wp_ID);
			bbb.setString(4, a.companybb);
			bbb.setString(5, a.mrbb);
			bbb.setString(6, a.prenamebb);
			bbb.setString(7, a.namebb);
			bbb.setString(8,a.emailbb);
			bbb.execute();
			
		}
	
public	ResultSet getWPname() throws SQLException 
	{
		ResultSet rs; 
		String name ="SELECT Windparkname FROM Windpark";
		Statement n = con.createStatement();
		n.executeQuery(name);
        rs=n.getResultSet();
		
		return rs;
	}
	
	
	
	
	
	
}
