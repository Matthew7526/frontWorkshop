package DesignPattern;

import java.awt.Color;

import javax.swing.JButton;

public class MarioTheme {

	public JButton createButton(String s)
	{
		MarioThemeButton mtb = new MarioThemeButton();
		mtb.setText(s);
		mtb.setBackground(Color.RED);
		return mtb;
	}
}
