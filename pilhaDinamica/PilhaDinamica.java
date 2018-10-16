package pilhaDinamica;

public class PilhaDinamica {
	private Node topo;
	
	public PilhaDinamica() {
		topo = null;
	}
	
	
	public boolean isEmpty() {
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
		if(topo != null) {
			novo.proximo= topo;			
		}
		topo = novo;
	}
	
	
}
