package be.laurent.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class JframeJoueur extends JFrame {

	private JPanel contentPane;

	
	public JframeJoueur(JframeLauncher thisframeLauncher, String type) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setVisible(true);
		setContentPane(contentPane);
		JframeJoueur thisframe = this;
		
		JLabel lbltitre;
		
		
		
		List list = new List();
		list.setBounds(29, 55, 617, 445);
		RequetJoueur req = new RequetJoueur();
		contentPane.setLayout(null);
		req.RequetJoueur(list,type);
		contentPane.add(list);
		
		
		if(type == "M")
		{
			lbltitre = new JLabel("Homme");
		}
		else
		{
			lbltitre = new JLabel("Femme");
		}
		lbltitre.setBounds(29, 22, 112, 14);
		contentPane.add(lbltitre);
		
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