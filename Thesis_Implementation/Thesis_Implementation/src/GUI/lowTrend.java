package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class lowTrend {

	private JFrame frmErgebnistrendanalyse;

	/**
	 * Create the application.
	 */
	public lowTrend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmErgebnistrendanalyse = new JFrame();
		frmErgebnistrendanalyse.setTitle("Ergebnistrendanalyse");
		frmErgebnistrendanalyse.setBounds(100, 100, 905, 595);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmErgebnistrendanalyse.getContentPane().setLayout(null);
		
		JLabel lblWindenergieanlage = new JLabel("Windenergieanlage");
		lblWindenergieanlage.setBounds(12, 13, 124, 16);
		frmErgebnistrendanalyse.getContentPane().add(lblWindenergieanlage);
		
		JLabel lblTestWea = new JLabel("Test WEA");
		lblTestWea.setBounds(148, 13, 56, 16);
		frmErgebnistrendanalyse.getContentPane().add(lblTestWea);
		
		JLabel lblWindpark = new JLabel("Windpark");
		lblWindpark.setBounds(254, 13, 56, 16);
		frmErgebnistrendanalyse.getContentPane().add(lblWindpark);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(322, 13, 56, 16);
		frmErgebnistrendanalyse.getContentPane().add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 80, 863, 455);
		frmErgebnistrendanalyse.getContentPane().add(panel);
		
		JLabel lblMesspunkt = new JLabel("Messpunkt");
		lblMesspunkt.setBounds(411, 13, 73, 16);
		frmErgebnistrendanalyse.getContentPane().add(lblMesspunkt);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(487, 13, 56, 16);
		frmErgebnistrendanalyse.getContentPane().add(lblX);
		
		
		
		frmErgebnistrendanalyse.setVisible(true);
	}

	//fjkdsfshfjdnfd test for github
}
