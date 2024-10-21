package controller;

import br.edu.fateczl.Lista.Lista;

public class ListaController {

	//criando lista a e lista b como global
	Lista<Integer> a = new Lista<>();
	Lista<Integer> b = new Lista<>();
	
	public ListaController() {
		super();
	}
	
	public void carregaListas(int []vetA,int vetB [])throws Exception {	
		
		//adicionando primeiros elementos a A e B
		a.addFirst(vetA[0]);
		b.addFirst(vetB[0]);
		
		//carregando demais elementos a A
		for(int i=1;i<vetA.length;i++) {
			a.addLast(vetA[i]);
		}System.out.println("Lista A tem # "+a.size());//printando tamanho de a para verificar
		
		
		//carregando demais elementos a B
		for(int i=1;i<vetB.length;i++) {
			b.addLast(vetB[i]);
		}System.out.println("Lista B tem # "+b.size());//printando tamanho de b para verificar
		
		
	}
	
	public void carregaIntersecao()throws Exception {
		
		//criando a lista interseção
		Lista<Integer> ii = new Lista<>();
		
		//rodando laço que compara valores da primeira e segunda lista (A e B)
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<b.size();j++) {
				if(ii.isEmpty()&&a.get(i)==b.get(j)) {
					ii.addFirst(a.get(i));//se valores forem iguais e lista estiver vazia adicione em primeiro na lista
				}else if(a.get(i)==b.get(j)){
					ii.addLast(a.get(i));//se forem iguais e lista já tiver elementos adicione por último
				}
				
			}
		}
		System.out.println("Lista I tem # "+ii.size());
		for(int i=0;i<ii.size();i++) {
			System.out.println(ii.get(i));//print nova lista 
		}
	}
	public void carregaUniao()throws Exception {
		
		//criando a lista união
       Lista<Integer> u = new Lista<>();
       
      //adicionando todos os elementos da lista a na lista da união
      for(int i=0;i<a.size();i++) {
    	  u.addFirst(a.get(i));
      }
      //rodando os elementos da lista b
      for(int i=0;i<b.size();i++) {
    	  if(!u.contains(b.get(i))) {//se alista união não contém o elemento da lista b , adicione a lista u
    		  u.addLast(b.get(i));
    	  }
      }
       
		System.out.println("Lista u tem # "+u.size());
		for(int i=0;i<u.size();i++) {
			System.out.println(u.get(i));
		}	
	}
}
