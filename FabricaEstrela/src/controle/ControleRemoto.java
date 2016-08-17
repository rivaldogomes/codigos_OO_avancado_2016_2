package controle;

import brinquedo.Brinquedo;

public class ControleRemoto {
	
//	Composição
	private Brinquedo brinquedo; 

	public ControleRemoto(Brinquedo brinquedo) {
		this.brinquedo = brinquedo;
	}
	
	public void acao() {
		brinquedo.mover();
	}
}
