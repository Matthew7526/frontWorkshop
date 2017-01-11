package DesignPattern;

import java.awt.Color;

import javax.swing.JButton;

public class StarWarsTheme {

	public JButton createButton(String s)
	{
		StarWarsThemeButton swtb = new StarWarsThemeButton();
		swtb.setText("StarWars");
		swtb.setForeground(Color.WHITE);
		swtb.setBackground(Color.BLACK);
		return swtb;
	}
}
