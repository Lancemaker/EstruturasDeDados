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
	
	public void enqueue(int elemento) {
		Node novo = new Node(elemento);
		
		if(inicio==null) {
			inicio = novo;
			fim=inicio;
		}
		else {
			fim.next = novo;
			fim= novo;
		}
		
	}
	
}
