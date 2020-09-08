package be.laurent.vue;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class JframeGagnant extends JFrame {

	private JPanel contentPane;

	
	public JframeGagnant(JframeLauncher thisframeLauncher) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setVisible(true);
		setContentPane(contentPane);
		JframeGagnant thisframe = this;
		
		JLabel lblSoloHomme = new JLabel("Solo homme");
		lblSoloHomme.setBounds(40, 11, 78, 14);
		contentPane.add(lblSoloHomme);
		
		List listsh = new List();
		listsh.setBounds(40, 31, 575, 64);
		RequetDernierMatch reqh = new RequetDernierMatch();
		contentPane.setLayout(null);
		reqh.RequetDernierMatch(listsh,127);
		contentPane.add(listsh);
		
		JLabel lblSoloFemme = new JLabel("Solo femme");
		lblSoloFemme.setBounds(40, 98, 78, 14);
		contentPane.add(lblSoloFemme);
		
		List listsf = new List();
		listsf.setBounds(40, 118, 575, 64);
		RequetDernierMatch reqf = new RequetDernierMatch();
		contentPane.setLayout(null);
		reqf.RequetDernierMatch(listsf,254);
		contentPane.add(listsf);
		
		JLabel lblDuoHomme = new JLabel("Duo homme");
		lblDuoHomme.setBounds(40, 198, 78, 14);
		contentPane.add(lblDuoHomme);
		
		List listdh = new List();
		listdh.setBounds(40, 218, 575, 69);
		RequetDernierMatch reqhh = new RequetDernierMatch();
		contentPane.setLayout(null);
		reqhh.RequetDernierMatch(listdh,285);
		contentPane.add(listdh);
		
		JLabel lblDuoFemme = new JLabel("Duo Femme");
		lblDuoFemme.setBounds(40, 301, 78, 14);
		contentPane.add(lblDuoFemme);
		
		List listdf = new List();
		listdf.setBounds(40, 321, 575, 69);
		RequetDernierMatch reqff = new RequetDernierMatch();
		contentPane.setLayout(null);
		reqff.RequetDernierMatch(listdf,316);
		contentPane.add(listdf);
		
		JLabel lblMix = new JLabel("Mix");
		lblMix.setBounds(38, 396, 58, 19);
		contentPane.add(lblMix);
				
		List mix = new List();
		mix.setBounds(40, 421, 575, 64);
		RequetDernierMatch reqmix = new RequetDernierMatch();
		contentPane.setLayout(null);
		reqmix.RequetDernierMatch(mix,347);
		contentPane.add(mix);
		
		JButton btn_retourLauncher = new JButton("Retour");
		btn_retourLauncher.setBounds(677, 475, 97, 25);
		
		btn_retourLauncher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				thisframeLauncher.setVisible(true);
				thisframe.dispose();			
			}
		});
		contentPane.add(btn_retourLauncher);

	
	}
}
