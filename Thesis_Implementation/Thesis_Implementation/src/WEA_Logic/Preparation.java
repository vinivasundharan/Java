package WEA_Logic;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;

import Data.DBVerbindung;

public class Preparation {

	
	public ResultSet fillCombo() throws SQLException
	{   ResultSet rs;
		DBVerbindung db  = new DBVerbindung();
		rs =db.getWPname();
		
		return rs ; 
	}
}
