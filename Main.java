package DesignPattern;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame fenetre = new JFrame();
		String[] tab = {"Select Theme", "Theme Mario", "Theme StarWars"};
		JLabel theme = new JLabel("Thème :");
		JComboBox select = new JComboBox(tab);
		select.setEditable(true);
		JLabel bouton = new JLabel("Bouton :");
		JButton field = new JButton();
		MarioTheme mt = new MarioTheme();
		StarWarsTheme swt = new StarWarsTheme();
		//Définit un titre pour notre fenêtre
	    fenetre.setTitle("Choisir son theme");
	    //Définit sa taille : 500 pixels de large et 300 pixels de haut
	    fenetre.setSize(500, 300);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Instanciation d'un objet JPanel
	    JPanel pan = new JPanel();
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);        
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    fenetre.setContentPane(pan);
	    //Ajout du bouton à notre content pane
	    fenetre.setContentPane(pan);
	    pan.add(theme);
	    pan.add(select);
	    select.setPreferredSize(new Dimension(130, 20));
	    pan.add(bouton);
	    bouton.setLocation(200, 150);
	    select.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Object selected = select.getSelectedItem();
				if(selected.toString().equals("Theme Mario"))
					field.equals(mt.createButton("Theme Mario"));
					pan.remove(field);
					pan.add(field);
				else if(selected.toString().equals("Theme StarWars"))
	            			field.equals(swt.createButton("Theme StarWars"));
					pan.remove(field);
					pan.add(field);
	        }
	    });
	    fenetre.getContentPane().add(field);
	    fenetre.setVisible(true);
	    
	}  
}
