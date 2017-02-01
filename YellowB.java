package Decorateur;

import javax.swing.*;
import java.awt.*;

public class YellowB implements TypeButton{

private final TypeButton IButton;
	
	public YellowB(TypeButton IButton)
	{
		this.IButton=IButton;
		IButton.getButton().setBackground(Color.YELLOW);
	}
	public JButton getButton()
	{
		return IButton.getButton();
	}
}
