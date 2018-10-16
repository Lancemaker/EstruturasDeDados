package pilhaDinamica;

// funciona como uma pilha, mas pode receber quantos elementos quiser. 
//Precisa de nodes para guardar informações e fazer associalções entre objetos.


public class PilhaDinamica {
	private Node topo;
	
	public PilhaDinamica() {
		topo = null;
	}
	
	
	public boolean isEmpty() { // se topo for == null significa que a variavel topo
						       //nao aponta para nenhum objeto,
						       //e isso significa que a pilha esta vazia.
		return topo==null;
	}
	
	public int size() {//varre o array e retorna count que
					   //é o numero de nodes dentro da pilha.
		int count = 0;
		Node aux = topo;
		
		while (aux != null) {// a condição é != de null porque 
							 //o ultimo node sempre aponta pra null. 
			count ++;
			aux = aux.proximo;
			
		}
		return count;
	}
	
	public void push(int elemento) {
		Node novo= new Node(elemento);
		if(topo != null) { //se a pilha nao estiver vazia.
			novo.proximo= topo;	//aponta o proximo do novo para o topo.  		
		}						//encadeando assim o novo antes do topo.
		topo = novo; //se a pilha estiver vazia, simplesmente aponta topo ao novo.
	}
	
	public int pop() {
		Node retorno = topo; // aponta retorno para o topo.
		if(!isEmpty()) { //se nao estiver vazio.
			topo = topo.proximo;	// topo aponta pro seu proprio proximo, andando um pra trás.
			retorno.proximo = null;  // faz o elemento se separar da cadeia associativa. 
			return retorno.elemento; // retorna o elemento separado da cadeia.
		}
		return -1;
	}
	
}
