package br.edu.iftm.tests;

import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela() {
		this.setFocusable(false);
		this.setSize(700, 500);
		this.setLayout(null);
		this.setTitle("Aa");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.preencheTela();
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public void preencheTela() {
		
	}
}
