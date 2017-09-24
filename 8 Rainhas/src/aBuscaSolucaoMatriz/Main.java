package aBuscaSolucaoMatriz;

public class Main {
	public static void main(String[] args) {
		
		//Primeiramente crio uma matriz informado que tera a base 4.
		System.out.println("Primeira Matriz:::");
		Matriz matriz = new Matriz(4);
		
		//Crio uma nova matriz com base na primeira. Esta matriz já implementa a base 4.
		//Alterações nesta matriz não interfere na anterior
		System.out.println("Segunda Matriz:::");
		Matriz matriz2 = new Matriz(matriz);
		matriz2.setMatriz(1, 2, 1);
		
		/*Tendo a possibilidade de criar uma matriz e replicala como parâmetro para outra matriz.
		 *Podendo imprimir a matriz na tela vamos mostrar as possibilidades.
		 *As possibilidades são todas as folhas.
		 */
		matriz.imprimirFolhas();
		
		
	}

}
