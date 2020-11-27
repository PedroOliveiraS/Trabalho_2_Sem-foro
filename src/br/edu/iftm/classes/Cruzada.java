package br.edu.iftm.classes;

public class Cruzada {
	
	//private boolean funcionando;
	public Cruzada() {
		//this.funcionando = true;
		Janela j = new Janela();
		cruzamento(j);
	}
	
	
	public void cruzamento(Janela j) {
		System.out.println("Todos os semaforos estão inicialmente vermelhos\n");
		for(int i = 1;i != 5;i++) {
			Semaforo_Pessoas sp = new Semaforo_Pessoas(i, j);
			new Semaforo_Carros(i,j, sp);
				
		}
			
		
	}

}
