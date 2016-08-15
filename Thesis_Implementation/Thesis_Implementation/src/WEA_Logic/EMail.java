package WEA_Logic;

import java.awt.Desktop;
import java.net.URI;

public class EMail {

	public void createEmail()
	{
		try {
            Desktop
                    .getDesktop()
                    .mail(
                            new URI(
                                    "mailto:jana.k.kroeger@student.fh-kiel.de?subject=TestEmail&body=Sehr%20geehrte%20Damen%20und%20Herren,%0D%0A%0D%0Adie%20Windenergieanlage%20XY%20weißt%20zur%20Zeit%20folgende%20besonderen%20Merkmale%20auf:%0D%0AFehlfunktion%20X%0D%0A%0D%0AMit%20freundlichen%20Grüßen%0D%0AMax%20Mustermann"));
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
}
