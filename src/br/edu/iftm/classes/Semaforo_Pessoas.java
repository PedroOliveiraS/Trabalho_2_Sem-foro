package br.edu.iftm.classes;

public class Semaforo_Pessoas {
	
	private int Tempo_Vermelho;
	private int Tempo_Verde;
	private int Id;
	private Janela j;
	
	public Semaforo_Pessoas(int identif, Janela j) {
		
		this.j = j;
		this.Id = identif;
		this.Tempo_Verde = 20;
		this.Tempo_Vermelho = 75;
		
		
	}

	public void verificar(int id) {
		
		j.mudarVermelhoP(id);
		for(int i = 1;i < 5;i++) {
			if(i != id) {
				j.mudarVerdeP(i);
			}
		}
	}


}
