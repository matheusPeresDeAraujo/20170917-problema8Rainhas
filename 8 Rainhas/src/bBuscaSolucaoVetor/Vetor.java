package bBuscaSolucaoVetor;

public class Vetor {
	private int[] vetor;
	private int rainhas;
	
	public Vetor() {
		super();
	}

	public Vetor(int rainhas) {
		super();
		this.rainhas = rainhas;
		this.vetor = new int[rainhas];
	}
	
	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int coluna, int linha) {
		this.vetor[coluna] = linha;
	}

	public int getRainhas() {
		return rainhas;
	}

	public void setRainhas(int rainhas) {
		this.rainhas = rainhas;
	}

	public void imprimirVetor() {
		for(int i = 0; i < this.rainhas; i++) {
			System.out.print(this.vetor[i] + "\t");
		}
	}
	
	public void imprimirFolhas() {
		for(int a = 0; a < this.rainhas; a++) {
			this.setVetor(0, a);
			for(int b = 0; b < this.rainhas; b++) {
				this.setVetor(1, b);
				for(int c = 0; c < this.rainhas; c++) {
					this.setVetor(2, c);
					for(int d = 0; d < this.rainhas; d++) {
						this.setVetor(3, d);
						this.imprimirVetor();
						System.out.println("");
					}
				}
			}
		}
		
	}
}
