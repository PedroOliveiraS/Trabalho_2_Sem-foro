package br.edu.iftm.classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela extends JFrame{
	
	int cont = 1;
	boolean[] Sem = {false, false, false, false};
	boolean[] Pes = {false, false, false, false};
	
	JPanel panelFundo;
	
	JLabel labelFundo;
	
	JLabel labelSem1;
	JLabel labelSem2;
	JLabel labelSem3;
	JLabel labelSem4;
	
	JLabel labelP1;
	JLabel labelP2;
	JLabel labelP3;
	JLabel labelP4;
	
	JButton btnTeste;
	
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
		
		panelFundo = new JPanel();
		panelFundo.setLayout(null);
		panelFundo.setSize(700, 500);
		panelFundo.setVisible(true);
		panelFundo.setBackground(Color.decode("#9e9fba"));
		this.add(panelFundo);
		
		labelSem1 = new JLabel();   // SEMAFORO  CIMA
		labelSem1.setLayout(null);
		labelSem1.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		labelSem1.setVisible(true);
		labelSem1.setBounds(325,10,100,180);
		panelFundo.add(labelSem1);
		labelP1 = new JLabel();
		labelP1.setLayout(null);
		labelP1.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		labelP1.setVisible(true);
		labelP1.setBounds(350,50,40,42);
		panelFundo.add(labelP1);
		
		panelFundo.add(labelSem1);
		labelSem2 = new JLabel(); // SEMAFORO  BAIXO
		labelSem2.setLayout(null);
		labelSem2.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		labelSem2.setVisible(true);
		labelSem2.setBounds(250,200,700,100);
		panelFundo.add(labelSem2);
		labelP2 = new JLabel();
		labelP2.setLayout(null);
		labelP2.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		labelP2.setVisible(true);
		labelP2.setBounds(275,200,40,42);
		panelFundo.add(labelP2);
		
		labelSem3 = new JLabel(); // SEMAFORO ESQUERDA
		labelSem3.setLayout(null);
		labelSem3.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		labelSem3.setVisible(true);
		labelSem3.setBounds(325,260,100,180);
		panelFundo.add(labelSem3);
		labelP3 = new JLabel();
		labelP3.setLayout(null);
		labelP3.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		labelP3.setVisible(true);
		labelP3.setBounds(350,300,40,42);
		panelFundo.add(labelP3);
		
		labelSem4 = new JLabel(); // SEMAFORO DIRETA
		labelSem4.setLayout(null);
		labelSem4.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		labelSem4.setVisible(true);
		labelSem4.setBounds(420,200,700,100);
		panelFundo.add(labelSem4);
		labelP4 = new JLabel();
		labelP4.setLayout(null);
		labelP4.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		labelP4.setVisible(true);
		labelP4.setBounds(445,200,40,42);
		panelFundo.add(labelP4);
		

		
		
		
		labelFundo = new JLabel();
		labelFundo.setLayout(null);
		labelFundo.setIcon(new ImageIcon("./imagens/fundo.png"));
		labelFundo.setVisible(true);
		labelFundo.setBounds(0,0,700,500);
		panelFundo.add(labelFundo);
		
	}
	
	public void mudarVermelhoS(int sem) {
		if(sem == 1) {
			labelSem1.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		}
		
		else if(sem == 2) {
			labelSem2.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		}
		
		else if(sem == 3) {
			labelSem3.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		}
		else if(sem == 4) {
			labelSem4.setIcon(new ImageIcon("./imagens/sinal_vermelho.png"));
		}
	}
	
	public void mudarAmareloS(int sem) {
		if(sem == 1) {
			labelSem1.setIcon(new ImageIcon("./imagens/sinal_amarelo.png"));
		}
		
		else if(sem == 2) {
			labelSem2.setIcon(new ImageIcon("./imagens/sinal_amarelo.png"));
		}
		
		else if(sem == 3) {
			labelSem3.setIcon(new ImageIcon("./imagens/sinal_amarelo.png"));
		}
		else if(sem == 4) {
			labelSem4.setIcon(new ImageIcon("./imagens/sinal_amarelo.png"));
		}
	}
	

	public void mudarVerdeS(int sem) {
		if(sem == 1) {
			labelSem1.setIcon(new ImageIcon("./imagens/sinal_verde.png"));
		}
		
		else if(sem == 2) {
			labelSem2.setIcon(new ImageIcon("./imagens/sinal_verde.png"));
		}
		
		else if(sem == 3) {
			labelSem3.setIcon(new ImageIcon("./imagens/sinal_verde.png"));
		}
		else if(sem == 4) {
			labelSem4.setIcon(new ImageIcon("./imagens/sinal_verde.png"));
		}
	}
	
	public void mudarVermelhoP(int sem) {
		if(sem == 1) {
			labelP1.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		}
		
		else if(sem == 2) {
			labelP2.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		}
		
		else if(sem == 3) {
			labelP3.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		}
		else if(sem == 4) {
			labelP4.setIcon(new ImageIcon("./imagens/sinal_vermelho_p.png"));
		}
	}
	
	public void mudarVerdeP(int sem) {
		if(sem == 1) {
			labelP1.setIcon(new ImageIcon("./imagens/sinal_verde_p.png"));
		}
		
		else if(sem == 2) {
			labelP2.setIcon(new ImageIcon("./imagens/sinal_verde_p.png"));
		}
		
		else if(sem == 3) {
			labelP3.setIcon(new ImageIcon("./imagens/sinal_verde_p.png"));
		}
		else if(sem == 4) {
			labelP4.setIcon(new ImageIcon("./imagens/sinal_verde_p.png"));
		}
	}
}
