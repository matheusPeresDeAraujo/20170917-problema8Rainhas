import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Matriz matriz = new Matriz(4);
		
		//matriz.imprimirMatriz();
		System.out.println("VETOR INICIAL:::");
		matriz.imprimirVetor();
		matriz.start();
		System.out.println("\n MATRIZ GERADA:::");
		matriz.imprimirMatriz();
		System.out.println("VETOR RESULTADO:::");
		matriz.imprimirVetor();
		System.out.println(matriz.interceptar());
		
		System.out.println();
		// Já iniciei a mátriz e descobri que ela intercepta-se.
		// Preciso verificar em qual RColuna posso alterar para ter o melhor resultado 
		// As possibilidades são feitas de apenas um movimento mas com todas as colunas.
		System.out.println("MATRIZ DE POSSIBILIDADES:::");
		matriz.possibilidades().imprimirMatriz();
		
		
		//Pensar na ideia de colocar peca a peca no inicio sem comprometer e quando não der para colocar peca, restruturar o que ja tem para tentar colocar mais.
			
//		int[] posicoes= new int[]{};
//		// Numero de colunas
//		// Cada coluna guardara o valor da posicao
//		
//		// start de posicoes
//		posicoes = new int[]{0,1,2,3,4,5,6,7,0};
//		// no inicio cada rainha encontra uma posicao de linha que não seja utilizada por outras rainhas.
//		
//		// verifico se todas as posições não entram em conflito.
//		
//		System.out.println(contador(posicoes)); // Inicio
//		
//		int[] posicoesTentativa = posicoes;
//		List<int[]> listaFilhos = new ArrayList();
//		
//		for(int i = 0; i < 8; i++) {
//			posicoesTentativa[0] = i;
//			posicoesTentativa[8] = contador(posicoesTentativa);
//			listaFilhos.add(posicoesTentativa);
//			System.out.println("Mudando"+i+" :" + contador(posicoesTentativa));
//		}
//		
//		imprime(listaFilhos.get(0));
 	}
	
//	public static int contador(int[] posicoes) {
//		
//		int contador = 0;
//		
//		for(int i = 0; i<8; i++) {
//			for(int j = 0; j<8; j++) {
//				if(i != j) {
//					// Se estiverem na mesma linha verifico interferencia
//					// Se estiverem na mesma diagonal verifico a interferencia
//					// A diagonal e calculado utilizando: Diferença das posiçoes verificadas (i-j) mais a 
//					// diferença deste valor com o posicionamento de i: posicao[i] - (i-j) && posicao[i] + (i-j)
//					if((posicoes[i] == posicoes[j]) || (posicoes[i]+(j-i) == posicoes[j]) || (posicoes[i]-(j-i) == posicoes[j]))
//						contador += 1;
//				}
//				
//			}
//		}
//		
//		return contador;
//		
//	}
	
//	public static void imprime(int[] filho) {
//		for(int i =0; i<9; i++) {
//			System.out.println(filho[i]+"\t");
//		}
//	}

}
