package filaDinamica;

public class FilaDinamica {
	private Node inicio,fim;
	
	public FilaDinamica() {
		inicio = null; 
		fim = null;
	}
	
	public boolean isEmpty() {
		return (inicio==null); // inicio ==null : true;
	}
	
	public void enqueue(int elemento) { // insere no fim da fila.
		Node novo = new Node(elemento);
		
		if(inicio==null) { //se estiver vazio. 
			inicio = novo; //inicio recebe novo;
			fim=inicio; 	// move o fim para o primeiro elemento,
							// apontando para inicio.
		}
		else {
			fim.next = novo; //encadeamos o next do ultimo elemnto ao novo.
			fim= novo;	//movemos o fim para apontar para o ultimo elemento.
		}		
	}
	
	public int dequeue() { //remove e retorna o valor do primeiro elemento.
		if(isEmpty())//se vazia retorna -1
		return -1;
		Node temp= inicio; //encadeia o primeiro elemento ao temp.
		inicio = inicio.next; // aponta o inicio ao proximo do primeiro elemento.
		// agora o temp tem o elemento retirado da primeira posicao. 
		if(inicio == null) // se inicio apontar pra nulo
			fim=null; // fim aponta pra nulo. 
		return temp.elemento; //retorna o primeiro elemento. 
	}
	
	public void display() {//printa 
		if (isEmpty()) {
			System.out.println("fila vazia");
		}
		else {
			Node atual = inicio;
			while(atual!=null) {
				System.out.println(atual.elemento);
				atual=atual.next;
			}
			System.out.println();
		}
	}
	
}
