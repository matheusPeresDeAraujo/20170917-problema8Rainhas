package aBuscaSolucaoMatriz;

public class Matriz {
	
	//Matriz é um objeto do tipo array que possui a mesma quantidade de linhas e colunas.
	private int base; //Linha e coluna
	private int[][] array;
	
	//Ao construir uma nova matriz eu informo a base. Quantidade de linhas e colunas que será referênciada.
	public Matriz(int base) {
		super();
		this.base = base;
		this.array = new int[base][base];
	}
	
	//Eu posso criar uma nova matriz apartir de uma base de valores existentes
	public Matriz(Matriz matriz) {
		super();
		//preciso transforma este objeto Matriz em um array.
		this.base = matriz.base;
		this.array = new int[base][base];
		for(int i = 0; i < this.base; i++){
			for(int j = 0; j < this.base; j++){
				this.array[i][j] = matriz.array[i][j];
			}
		}
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}
	
	public void setMatriz(int linha, int coluna, int valor) {
		this.array[linha][coluna] = valor;
	}
	
	public void imprimirMatriz() {
		for(int k = 0; k < this.base; k++) {
			for(int q = 0; q < this.base; q++) {
				System.out.print(this.array[k][q] + "\t");
			}
			System.out.println("\n");
		}
	}

//	int k = 0;
//	int l = -1;
//	
//	public int imprimirFolhas() {
//		int valor[] = {0,1,2,3,4};
//		if(l < 3){
//			l++;
//		}else{
//			k++;
//			if(k < 4){
//				l = 0;
//			}else{
//				l++;
//			}
//		}
//		if(k == 4 && l == 4){
//			this.imprimirMatriz();
//			System.out.println("");
//		}else{
//			for(int a = 2; a < base+1; a ++){
//				this.setMatriz(k, l, valor[a]);
//				return this.imprimirFolhas();
//			}
//		}
//		return 1;
//	}
	
//	public void imprimirFolhas() {
//		//Apartir da matriz criada cria lista de inteiros que representa a possibilidade.
//		int[] possibilidades = new int[this.base+1];
//		for(int i = 0; i < this.base+1; i++){
//			possibilidades[i] = i;
//		}
//		
//		int[] argumentos = new int[this.base*2]; 
//		
//		for(int x = 0; x < Math.pow((this.base*this.base),argumentos.length); x++){
//
//			for(int w = 0; w < Math.ceil((double)x / 5); w++){
//				argumentos[w] = (x - w * 5)%5;
//			}
//			
//			for(int i = 0; i < argumentos.length; i++){
//				this.setMatriz(i/4, i%4, argumentos[i]);
//			}
//	
//			this.imprimirMatriz();
//			System.out.println("");
//		}
//	}
//	
//	public int alterArgumento(int[] valor){
//		if(valor )
//	}
	int i =0;
	public void imprimirFolhas() {
		for(int a = 0; a < this.base+1; a++){
			this.setMatriz(0, 0, a);
			for(int a2 = 0; a2 < this.base+1; a2++){
				this.setMatriz(0, 1, a2);
				for(int a3 = 0; a3 < this.base+1; a3++){
					this.setMatriz(0, 2, a3);
					for(int a4 = 0; a4 < this.base+1; a4++){
						this.setMatriz(0, 3, a4);
						for(int a5 = 0; a5 < this.base+1; a5++){
							this.setMatriz(1, 0, a5);
							for(int a6 = 0; a6 < this.base+1; a6++){
								this.setMatriz(0, 1, a6);
								for(int a7 = 0; a7 < this.base+1; a7++){
									this.setMatriz(0, 2, a7);
									for(int a8 = 0; a8 < this.base+1; a8++){
										this.setMatriz(0, 3, a8);
										for(int a9 = 0; a9 < this.base+1; a9++){
											this.setMatriz(2, 0, a9);
											for(int a10 = 0; a10 < this.base+1; a10++){
												this.setMatriz(2, 1, a10);
												for(int a11 = 0; a11 < this.base+1; a11++){
													this.setMatriz(2, 2, a11);
													for(int a12 = 0; a12 < this.base+1; a12++){
														this.setMatriz(2, 3, a12);
														for(int a13 = 0; a13 < this.base+1; a13++){
															this.setMatriz(3, 0, a13);
															for(int a14 = 0; a14 < this.base+1; a14++){
																this.setMatriz(3, 1, a14);
																for(int a15 = 0; a15 < this.base+1; a15++){
																	this.setMatriz(3, 2, a15);
																	for(int a16 = 0; a16 < this.base+1; a16++){
																		this.setMatriz(3, 3, a16);
																		this.imprimirMatriz();
																		System.out
																				.println(i++);
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
}
