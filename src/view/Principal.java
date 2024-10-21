package view;

import controller.ListaController;

public class Principal {

	public static void main(String[] args)throws Exception {
		
		//vetores com valores das listas para ser carregados
		int []vetA= {3,5,8,12,9,7,16};
		int []vetB= {9,6,2,3,7}; 
		
		//instanciando classe Listacontroller para acessar seus métodos
		ListaController l = new ListaController();
		
		//chamando o método de carregar listas 
		l.carregaListas(vetA, vetB);
		
		//chamando método qua carrega valores de interseção
		l.carregaIntersecao();
		
		//chamando método que carrega valores de união
		l.carregaUniao();
		
	}
}
