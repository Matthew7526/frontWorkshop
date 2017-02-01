package Decorateur;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

	public Main ()
	{
		JButton selectButton1=new JButton("Premier Decorateur");
		selectButton1.setBounds(60,350,100,35);
		JButton selectButton2=new JButton("Deuxième Decorateur");
		selectButton2.setBounds(200,350,100,35);
		JButton selectButton3=new JButton("Troisième Decorateur");
		selectButton3.setBounds(340,350,100,35);
		add(selectButton1);
		add(selectButton2);
		add(selectButton3);
		setSize(700,500);
		JButtonBase Monbouton=new JButtonBase();
		add(Monbouton.getButton());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		selectButton1.addMouseListener(new java.awt.event.MouseAdapter()
		{
		       public void mouseClicked(java.awt.event.MouseEvent e) {
		   			Monbouton=new YellowB(Monbouton);
		   			getContentPane().repaint();
		       }
		 });
		selectButton2.addMouseListener(new java.awt.event.MouseAdapter()
		{
		       public void mouseClicked(java.awt.event.MouseEvent e) {
		   			Monbouton=new BlueB(Monbouton);
		   			getContentPane().repaint();
		       }
		 });
		selectButton3.addMouseListener(new java.awt.event.MouseAdapter()
		{
		       public void mouseClicked(java.awt.event.MouseEvent e) {
		   			Monbouton=new GreenB(Monbouton);
		   			getContentPane().repaint();
		       }
		 });

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main run = new Main();
	}

}
