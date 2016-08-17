package controle;

import brinquedo.Brinquedo;

/**
 * Classe criada para representar o controle remoto.
 * @author jefferson
 * @date 16/08/2016
 *
 */
public class ControleRemoto {

	/**
	 * Composição existen entre um controle remoto e um brinquedo (aviao, carro, navio, etc.) 
	 */
	private Brinquedo brinquedo; 

	/**
	 * Construtor da classe Controle Remoto que recebe um referência para um brinquedo.
	 * @param brinquedo
	 */
	public ControleRemoto(Brinquedo brinquedo) {
		this.brinquedo = brinquedo;
	}
	
	/**
	 * Método que representa a ação de clicar no botão do controle remoto. 
	 * Esse método será chamado na classe Principal (classe que contém o método main).
	 */
	public void acao() {
		brinquedo.mover();
	}
}
