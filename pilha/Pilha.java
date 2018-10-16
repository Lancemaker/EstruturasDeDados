//pilha estatica
//caracteristica : introduz no fim, retorna ordem invertida ao
// retirarmos itens.
//

package pilha;

public class Pilha{
	
	private int arranjo[];
	private int topo;
	
	public Pilha(int tamanho) {
		arranjo = new int[tamanho];
		topo = -1;
	}
	
	//retorna verdadeiro se topo == -1 
	public boolean isEmpty() {
		return topo == -1;
	}
		
	//retorna true se topo for = ao tamanho do array-1
	public boolean isFull() {
		return topo == arranjo.length - 1;
	}
	
	public int size() {		
		//nunca usar ++topo ou topo++ pois estes operadorem atribuem valores.
		return topo +1;		
	}
	
	public void push(int elemento) {
		if(!isFull()) {//se nao estiver com todos os slots cheios, o que é diferente de vazio. 
			arranjo[++topo] = elemento;
		}
	}
	
	public int pop() { // se nao estiver vazio, retorna topo e subtrai um do mesmo, caso contrario retorna -1.
		int retorno = -1;
		if(!isEmpty()) {
			retorno = arranjo[topo--];
			
		}
		return retorno;
	}		
	
	public int top() {//se nao estiver vazio retorna topo caso contrario retorna -1
		int retorno =-1;
		if(!isEmpty()) {
			retorno= arranjo[topo];
		}
		return retorno;
	}
}