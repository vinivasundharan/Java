package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class stammdatenVerwaltung {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public stammdatenVerwaltung() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 423);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Stammdatenverwaltung");
		frame.getContentPane().setLayout(null);
		
		JButton btnWindenergieanlageRegistrieren = new JButton("Windenergieanlage registrieren");
		btnWindenergieanlageRegistrieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new stammDataEntry();}
		});
		btnWindenergieanlageRegistrieren.setBounds(170, 26, 227, 35);
		frame.getContentPane().add(btnWindenergieanlageRegistrieren);
		
		JButton btnWindparkAnlegen = new JButton("Windpark anlegen");
		btnWindparkAnlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new windparkRegister();}
		});
		btnWindparkAnlegen.setBounds(12, 26, 135, 35);
		frame.getContentPane().add(btnWindparkAnlegen);
		
		JButton btnBeenden = new JButton("Beenden");
		btnBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();}
		});
		btnBeenden.setBounds(403, 342, 97, 25);
		frame.getContentPane().add(btnBeenden);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(12, 91, 486, 225);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
