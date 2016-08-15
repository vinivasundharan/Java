package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Analysis.BatchStart;
import WEA_Logic.EMail;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.JList;

public class mainWindow extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
	/**
	 * Create the frame.
	 */
	public mainWindow() {
		setTitle("Hauptfenster");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 298);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mnDatei.add(mntmBeenden);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Stammdaten");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 new stammdatenVerwaltung();
			
			}
		});
		btnNewButton.setBounds(12, 13, 118, 38);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Logbuch");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(142, 13, 103, 38);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 488, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button_1 = new JButton("Karte");
		button_1.setBounds(369, 13, 103, 38);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 EMail etest = new EMail();
			 etest.createEmail();}}
		);
		
		button_2.setBounds(12, 141, 60, 16);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			BatchStart knm = new BatchStart();
			knm.runKnime();}
		});
		button_3.setBounds(12, 83, 60, 16);
		contentPane.add(button_3);
		
		JLabel lblNeueVerbindungstrungen = new JLabel("E-Mail erstellen");
		lblNeueVerbindungstrungen.setBounds(90, 141, 155, 16);
		contentPane.add(lblNeueVerbindungstrungen);
		
		JLabel lblNeueTrendrckgnge = new JLabel("Trendr\u00FCckgang Analyse");
		lblNeueTrendrckgnge.setBounds(90, 83, 155, 16);
		contentPane.add(lblNeueTrendrckgnge);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BatchStart btch = new BatchStart();
				btch.runBatch();
				new lowTrend(); 
			}
		});
		button_4.setBounds(12, 112, 60, 16);
		contentPane.add(button_4);
		
		JLabel lblTrendrckgang = new JLabel("Trendr\u00FCckgang");
		lblTrendrckgang.setBounds(90, 112, 103, 16);
		contentPane.add(lblTrendrckgang);
	}
}
