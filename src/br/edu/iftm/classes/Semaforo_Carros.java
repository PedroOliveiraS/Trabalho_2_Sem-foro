package br.edu.iftm.classes;

public class Semaforo_Carros implements Runnable {
	
	private int Tempo_Vermelho;
	private int Tempo_Verde;
	private int Tempo_Amarelo;
	private int Id;
	private int Vez;
	private boolean Ligado = true;
	private Janela j;
	private Semaforo_Pessoas sp;
	
	public Semaforo_Carros(int identif, Janela j, Semaforo_Pessoas sp) {
		
		this.sp = sp;
		this.Vez = 1;
		this.Id = identif;
		this.j = j;
		this.Tempo_Verde = 5;
		this.Tempo_Amarelo = 2;
		this.Tempo_Vermelho = 8;		
		new Thread(this).start();
				
	}


	
	public void run() {
		
		
		while (Ligado) {
						
			synchronized(this) {
				if(this.Id == this.Vez) {
					
					sp.verificar(this.Id);
					System.out.println("\nSemaforo "+this.Id+" esta verde.");
					j.mudarVerdeS(this.Id);
					try {
						wait(this.Tempo_Verde*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					j.mudarAmareloS(this.Id);
					System.out.println("Semaforo "+this.Id+" esta amarelo.");
					try {
						wait(this.Tempo_Amarelo*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					j.mudarVermelhoS(this.Id);
					System.out.println("Semaforo "+this.Id+" esta vermelho.\n");
					try {
						wait(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					notifyAll();
				}else {					
					try {
						wait(this.Tempo_Vermelho*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				this.Vez ++;
			}
			
			if(this.Vez > 4) {
				this.Vez = 1;
			}
		}
		
	}
	

	
}
