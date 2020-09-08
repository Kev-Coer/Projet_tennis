package be.laurent.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JframeParticipant extends JFrame {

	private JPanel contentPane;

	
	public JframeParticipant(JframeLauncher thisframeLauncher, String type) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 987, 718);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setVisible(true);
		setContentPane(contentPane);
		JframeParticipant thisframe = this;
		
		if(type == "simple")
		{
		JLabel lblSoloHomme = new JLabel("Solo homme");
		lblSoloHomme.setBounds(28, 11, 78, 14);
		contentPane.add(lblSoloHomme);
		
		List listsh = new List();
		listsh.setBounds(28, 31, 609, 193);
		RequetMatch reqh = new RequetMatch();
		contentPane.setLayout(null);
		reqh.RequetMatch(listsh,1,127);
		contentPane.add(listsh);
		
		JLabel lblSoloFemme = new JLabel("Solo femme");
		lblSoloFemme.setBounds(28, 230, 78, 14);
		contentPane.add(lblSoloFemme);
		
		List listsf = new List();
		listsf.setBounds(28, 250, 609, 172);
		RequetMatch reqf = new RequetMatch();
		contentPane.setLayout(null);
		reqf.RequetMatch(listsf,128,254);
		contentPane.add(listsf);
		}
		else
		{
		JLabel lblDuoHomme = new JLabel("Duo homme");
		lblDuoHomme.setBounds(28, 11, 78, 14);
		contentPane.add(lblDuoHomme);
		
		List listdh = new List();
		listdh.setBounds(28, 31, 609, 193);
		RequetMatch reqhh = new RequetMatch();
		contentPane.setLayout(null);
		reqhh.RequetMatch(listdh,255,285);
		contentPane.add(listdh);
		
		JLabel lblDuoFemme = new JLabel("Duo Femme");
		lblDuoFemme.setBounds(28, 230, 78, 14);
		contentPane.add(lblDuoFemme);
		
		List listdf = new List();
		listdf.setBounds(28, 250, 609, 172);
		RequetMatch reqff = new RequetMatch();
		contentPane.setLayout(null);
		reqff.RequetMatch(listdf,289,316);
		contentPane.add(listdf);
		
		JLabel lblMix = new JLabel("Mix");
		lblMix.setBounds(28, 428, 58, 19);
		contentPane.add(lblMix);
				
		List mix = new List();
		mix.setBounds(28, 453, 609, 172);
		RequetMatch reqmix = new RequetMatch();
		contentPane.setLayout(null);
		reqmix.RequetMatch(mix,317,347);
		contentPane.add(mix);
		}
		JButton btn_retourLauncher = new JButton("Retour");
		btn_retourLauncher.setBounds(864, 643, 97, 25);
		
		btn_retourLauncher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				thisframeLauncher.setVisible(true);
				thisframe.dispose();			
			}
		});
		contentPane.add(btn_retourLauncher);

	
	}
	
}

