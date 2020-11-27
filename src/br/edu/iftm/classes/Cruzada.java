package br.edu.iftm.classes;

public class Cruzada {
	
	//private boolean funcionando;
	public Cruzada() {
		//this.funcionando = true;
		cruzamento();
	}
	
	
	public void cruzamento() {
		System.out.println("Todos os semaforos estão inicialmente vermelhos\n");
		for(int i = 1;i != 5;i++) {
			new Semaforo_Carros(i);
				
		}
			
		
	}

}
