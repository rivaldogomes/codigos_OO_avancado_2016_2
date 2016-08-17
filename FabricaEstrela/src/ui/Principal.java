package ui;

import brinquedo.Aviao;

import brinquedo.Brinquedo;
import brinquedo.Carro;
import brinquedo.Navio;
import brinquedo.Peao;
import controle.ControleRemoto;

/**
 * Classe utilizada para testar o controle remoto criado. Sempre deve existir uma classe com o método main.
 * @author jefferson
 * @date 16/08/2016
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Brinquedo ferrari = new Carro();
		
		Brinquedo titanic = new Navio();
		
		Brinquedo _14bis = new Aviao(); 
		
		Brinquedo cocacola = new Peao();
		
//		Associando um brinquedo ao controle remoto.
		ControleRemoto controle = new ControleRemoto(cocacola);
		
//		Ato de clicar no botão do controle remoto.
		controle.acao();
	}
}