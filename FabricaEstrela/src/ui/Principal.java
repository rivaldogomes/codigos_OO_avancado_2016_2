package ui;

import brinquedo.Aviao;
import brinquedo.Brinquedo;
import brinquedo.Carro;
import brinquedo.Navio;
import brinquedo.Peao;
import controle.ControleRemoto;

public class Principal {

	public static void main(String[] args) {
		
		Brinquedo ferrari = new Carro();
		
		Brinquedo titanic = new Navio();
		
		Brinquedo _14bis = new Aviao(); 
		
		Brinquedo cocacola = new Peao();
		
		ControleRemoto controle = new ControleRemoto(cocacola);
		
		controle.acao();

	}

}
