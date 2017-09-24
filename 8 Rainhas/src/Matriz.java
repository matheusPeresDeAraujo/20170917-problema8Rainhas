
public class Matriz {
	
	private int n;
	private int[][] matriz;
	private int[] vetor;
	
	// A construção da matriz é baseada na base n
	public Matriz(int n) {
		super();
		this.n = n;
		this.matriz = new int[n][n];
		this.vetor = new int[n];
	}
	
	public Matriz(int[][] matriz) {
		this.n = matriz.length;
		this.matriz = new int[n][n];
		this.vetor = new int[n];
		
		for(int i = 0; i < this.n; i++) {
			for(int j = 0; j < this.n; j++) {
				this.matriz[j][i] = matriz[j][i]; 
				if(matriz[j][i] == 1)
					this.vetor[i] = j;
			}
		}
	}
	
	public int[][] getArray() {
		int[][] newMatriz = new int[this.n][this.n];
		
		for(int i = 0; i < this.n; i++) {
			for(int j = 0; j < this.n; j++) {
				newMatriz[i][j] = this.matriz[i][j]; 
			}
		}
		return newMatriz;
	}

	public int[][] getMatriz() {
		return matriz;
	}
	
	public void start() {
		//metodo pega cada coluna e define uma posicao aleatória.
		for(int i = 0; i < this.n; i++) {
			int random = (int)(Math.random()*this.n);
			this.matriz[random][i] = 1;
			this.vetor[i] = random;
		}
	}
	
	public void imprimirMatriz() {
		for(int k = 0; k < this.n; k++) {
			for(int q = 0; q < this.n; q++) {
				System.out.print(this.matriz[k][q] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public void imprimirVetor() {
		for(int k = 0; k < this.n; k++) {
			System.out.print(this.vetor[k] + "\t");
		}
	}
	public int interceptar() {
		int cont = 0;
		
		for(int i = 0; i<this.n; i++) {
			for(int j = 0; j<this.n; j++) {
				if(i != j) { // talvez possa ser retirado mais tarde já que a comparação com alterações sera calculado da mesma forma.
					
					// Se estiverem na mesma linha verifico interferencia
					// Se estiverem na mesma diagonal verifico a interferencia
					
					// A diagonal e calculado utilizando: Diferença das posiçoes verificadas (i-j) mais a 
					// diferença deste valor com o posicionamento de i: posicao[i] - (i-j) && posicao[i] + (i-j)
					if((vetor[i] == vetor[j]) || (vetor[i]+(j-i) == vetor[j]) || (vetor[i]-(j-i) == vetor[j]))
						cont += 1;
				}
				
			}
		}
		
		return cont;
	}
	
	public Matriz possibilidades() { // Gera uma matriz com o peso das modificacoes em contador de incerpcoes
		Matriz matrizF;
		Matriz possibilidades = new Matriz(this.n);
		
		for(int k = 0; k < this.n; k++) { //Coluna
			for(int q = 0; q < this.n; q++) { // Linha
				matrizF = new Matriz(this.getArray());
				// Preciso saber onde esta a rainha da primeira coluna, retirar e colocar em novo ponto.
				int posicao = this.vetor[k];
				matrizF.matriz[posicao][k] = 0;
				matrizF.matriz[q][k] = 1;
				matrizF.vetor[k] = q;
				
				// Preciso saber o que resulta desta modificacao
				int result = matrizF.interceptar();
				
				// Montar matriz com essas informações
				possibilidades.matriz[q][k] = result;
			}
		}
		return possibilidades;
	}
	
	
	
	
	
	
	
}
