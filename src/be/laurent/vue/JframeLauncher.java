package be.laurent.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.laurent.java.Ordonnancement;
import be.laurent.java.Tournois;

public class JframeLauncher extends JFrame {

	private JPanel contentPane;
	private Tournois tournois = new Tournois();
	private Ordonnancement Ordon ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeLauncher frame = new JframeLauncher();
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
	public JframeLauncher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JframeLauncher thisframe = this;
		
		JButton btn_launcher = new JButton("Launcher");
		JButton btn_joueurh = new JButton("Joueur Homme");
		JButton btn_joueurf = new JButton("Joueur femme");
		JButton btn_partiesolo = new JButton("Match solo");
		JButton btn_partieduo = new JButton("Match duo");
		JButton btn_gagnant = new JButton("Afficher le dernier match de chaque match");
		
		btn_launcher.addActionListener(new ActionListener() { 
			
			public void actionPerformed(ActionEvent arg0) {
					
					btn_launcher.setVisible(false);
					btn_joueurh.setVisible(true);
					btn_joueurf.setVisible(true);
					btn_partiesolo.setVisible(true);
					btn_partieduo.setVisible(true);
					btn_gagnant.setVisible(true);						
				}
			});
	
	
	btn_joueurh.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent arg0) {
			JframeJoueur frame = new JframeJoueur(thisframe, "M"); 
			thisframe.setVisible(false);
			}
		});
	
	btn_joueurf.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent arg0) {
			JframeJoueur frame = new JframeJoueur(thisframe, "F"); 
			thisframe.setVisible(false);
			}
		});
	
	btn_partiesolo.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent arg0) {
			JframeParticipant frame = new JframeParticipant(thisframe,"simple"); 
			thisframe.setVisible(false);
			}
		});
	
	btn_partieduo.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent arg0) {
			JframeParticipant frame = new JframeParticipant(thisframe,"duo"); 
			thisframe.setVisible(false);
			}
		});

	btn_gagnant.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent arg0) {
			JframeGagnant frame = new JframeGagnant(thisframe);
			thisframe.setVisible(false);
			}
		});
	
	btn_launcher.setBounds(10, 11, 123, 25);
	btn_joueurh.setBounds(10, 60, 123, 27);
	btn_joueurf.setBounds(10, 98, 123, 25);
	btn_partiesolo.setBounds(173, 62, 99, 25);
	btn_partieduo.setBounds(173, 103, 99, 25);
	btn_gagnant.setBounds(166, 10, 288, 27);
	
	btn_joueurh.setVisible(false);
	btn_joueurf.setVisible(false);
	btn_partiesolo.setVisible(false);
	btn_partieduo.setVisible(false);
	btn_gagnant.setVisible(false);	
	contentPane.setLayout(null);
	
	
	contentPane.add(btn_launcher);
	contentPane.add(btn_joueurh);
	contentPane.add(btn_joueurf);
	contentPane.add(btn_partiesolo);	
	contentPane.add(btn_partieduo);	
	contentPane.add(btn_gagnant);	
	

	}

}