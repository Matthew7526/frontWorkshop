package Decorateur;

import javax.swing.*;
import java.awt.*;

public class BlueB implements TypeButton{

private final TypeButton IButton;
	
	public BlueB(TypeButton IButton)
	{
		this.IButton=IButton;
		IButton.getButton().setBackground(Color.BLUE);
	}
	public JButton getButton()
	{
		return IButton.getButton();
	}
}
