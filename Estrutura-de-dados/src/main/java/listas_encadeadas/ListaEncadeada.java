package listas_encadeadas;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	
	
	// método Add 
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size()-1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		noAuxiliar = noAuxiliar.getProximoNo();
	}
	
	private No<T> getNo(int index){
		
		validaIndice(index);
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for (int i = 0; i < this.size()-1; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}
	
	
	// método Size
	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				
				if(referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		return tamanhoLista;
	}
	
	public void validaIndice(int index ) {
		if(index >= size()) {
			int ultimoIndice = size() -1;
			
			throw new IndexOutOfBoundsException("Não Existe conteúdo no indice " + index + "desta lista. esta lista só vai até o indice"+ ultimoIndice + '.' );
		}
	}
	
	// método isEmpty
	public boolean isEmpty() {
		return referenciaEntrada == null? true : false;
	}
	
}
