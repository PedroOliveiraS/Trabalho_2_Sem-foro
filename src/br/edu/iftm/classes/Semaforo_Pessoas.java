package br.edu.iftm.classes;

public class Semaforo_Pessoas {
	
	private int Tempo_Vermelho;
	private int Tempo_Verde;
	private int Vez;
	private boolean Prosseguir;
	
	public Semaforo_Pessoas(int identif) {
		
		this.Vez = identif;
		this.Prosseguir = false;
		this.Tempo_Verde = 20;
		this.Tempo_Vermelho = 75;
		
	}

	public int getTempo_Vermelho() {
		return Tempo_Vermelho;
	}

	public void setTempo_Vermelho(int tempo_Vermelho) {
		Tempo_Vermelho = tempo_Vermelho;
	}

	public int getTempo_Verde() {
		return Tempo_Verde;
	}

	public void setTempo_Verde(int tempo_Verde) {
		Tempo_Verde = tempo_Verde;
	}

	public int getVez() {
		return Vez;
	}

	public void setVez(int vez) {
		Vez = vez;
	}

	public boolean isProsseguir() {
		return Prosseguir;
	}

	public void setProsseguir(boolean prosseguir) {
		Prosseguir = prosseguir;
	}

}
