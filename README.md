# 20170917-problema8Rainhas
1 - aBuscaSolucaoMatriz  
  Considera-se cada posição e suas alternativas.  
  Em matriz 4x4 temos 16 posições e 5 possibilidades{0},{1,2,3,4}.  
  Os resultados possiveis são iguais a 5^16 - 152.587.890.625  
  Nesta resolução teremos diversos resultados desnecessários e com a potêncialização da base da matriz torna ainda menos prodtivo o uso desta afirmação.  
 
2 - bBuscaSolucaoVetor  
  Neste caso procuramos definir a localização da rainha dentro da matriz.  
  Em matriz 4x4 temos 4 rainhas e 16 possibilidades de posicionamento.  
  Sabendo que nenhuma resposta valida terá duas rainhas em uma mesma linha ou coluna, podemos aprimor a definição.  
  Em matriz 4x4 temos 4 rainhas e 4 possibilidade de posicionamento, sendo que rainha um representa coluna um  e só precisamos saer a linha de posicionamento.  
  Os resultados possiveis são iguais a 4^4 - 256   
  
3 - cBuscaSolucaoVetorPosicionamentoValido  
  Neste caso iremos colocar posicao a posicao validando antes de colocar a próxima peça.  

```flow
st=>start: start
op=>operation: SetVetor[coluna] = linha
cond=>condition: Intercepta?
e=end

st->op->cond
cond(yes)->e
cond(no)->op
```
