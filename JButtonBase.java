package Decorateur;

import javax.swing.*;

public class JButtonBase implements TypeButton{

JButton button;
	
	public JButtonBase()
	{
		button=new JButton("Mon Bouton");
		button.setBounds(x,y,width,height);
	}
	public JButton getButton()
	{
		return button;
	}
}
