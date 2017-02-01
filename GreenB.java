package Decorateur;

import javax.swing.*;
import java.awt.*;

public class GreenB implements TypeButton{

private final TypeButton IButton;
	
	public GreenB(TypeButton IButton)
	{
		this.IButton=IButton;
		IButton.getButton().setBackground(Color.GREEN);
	}
	public JButton getButton()
	{
		return IButton.getButton();
	}
}
