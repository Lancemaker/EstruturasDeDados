package fila;

//fila estatica : entra atras e sai na frente. that simple. 

public class Fila {
	private int[] fila;
	private int inicio, fim;
	private int quantidade;
	
	public Fila(int tamanho) { //constructor gera fila com o tamanho indicado pelo parametro.
		fila = new int[tamanho];
		inicio = fim = -1;
		quantidade = 0;
	}
	
	public boolean isEmpty() {
		return inicio==-1; // se o inicio for -1, a fila esta vazia. 
	}
	
	public boolean isFull() {
		return fim == fila.length -1; //se o fim for igual ao tamanho da 
									  //fila-1 a fila esta lotada.
	}
	
	public int size() {
		return quantidade;      //retorna o numero de elementos da fila. 
	}
	
	public void enqueue(int elemento) {//adiciona um elemento a fila.
		if(!isFull()) {
			fim++;  	// se nao estiver lotado fim aponta pro proximo indice
			fila[fim] = elemento; // preenche a fila no indice fim com o valor do elemento.
			if(inicio == -1) { // se o inicio for igual a -1.
				inicio++;	//soma +1 ao inicio.  
			}
			quantidade++; //incrementa a quantidade.
		}
	}
	
	public int dequeue() { // remove o primeiro elemento da fila e retorna o mesmo elemento.
		if(!isEmpty()) { // se a fila nao estiver vazia. 
			int retorno = fila[inicio]; // atribui ao retorno o valor do primeiro elemento. 
			for(int i=0; i <fim; i++) { 
				fila[i]=fila[i+1];//varre o array ate o indice do fim, 
								 //substituindo o elmento atual pelo proximo.
			}
			fim--; //decrementa o fim.
			if(fim==-1) { //se o fim for -1, 
				inicio--; //decrementa o inicio.
			}
			quantidade--; // decrementa a quantidade.
			return retorno; // retorna o elemento recem tirado da fila (o que era o primeiro.)
		}
		return -1;
	}
	
	public int front() {
		if(!isEmpty()) {
			return fila[inicio]; //se nao estiver vazio, mostra 
								 //o primeiro elemento da fila.
		}
		return-1; // se estiver vazio retorna -1.
	}	
}
