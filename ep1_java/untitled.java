/******************************************************************************
 *
 * MAC0239 Introdução à Lógica e Verificação de Programas
 * Aluno: Eduardo Freire de Carvalho Lima
 * Numero USP: 10262627
 * Tarefa: EP1
 * Data: 14/11/2017
 * 
 * Baseado em... (breve se aplicável)
 *
 * DECLARO QUE SOU O ÚNICO AUTOR E RESPONSÁVEL POR ESTE PROGRAMA.  TODAS AS 
 * PARTES DO PROGRAMA, EXCETO AS QUE SÃO BASEADAS EM MATERIAL FORNECIDO  
 * PELO PROFESSOR OU COPIADAS DO LIVRO OU DAS BIBLIOTECAS DE SEDGEWICK & WAYNE, 
 * FORAM DESENVOLVIDAS POR MIM.  DECLARO TAMBÉM QUE SOU RESPONSÁVEL POR TODAS 
 * AS CÓPIAS DESTE PROGRAMA E QUE NÃO DISTRIBUÍ NEM FACILITEI A DISTRIBUIÇÃO
 * DE CÓPIAS DESTA PROGRAMA.
 *
 ******************************************************************************/

Minha strategyNew() constituiu de inserir no código um vetor de inteiros chamado clauseFinal[] de tamanho nSlots * nColors,
dessa forma, sempre que o feedback for true, ao inves de todas as vezes invocarmos o satTradutor.attToVar, o invocamos na
primeira vez em que ele aparece (clauseFinal[i] == 0) e, após isso, armazenamos esse valor no clausefinal[i], reenviando
essa informação para o vetor clause[0] e mandando-o para o método satTradutor.addClause(). Assim, poupamos tempo em relação 
a strategyFull, a fim de não termos que invocar uma função toda vida, mas apenas uma vez.

Ao realizar os experimentos, me deparei com um problema na questão do tempo, pois, para o caso de n=64, c =108, meu programa
estava demorando 20min para rodar cada teste. De acordo com um dúvida postada no paca em relação ao mesmo problema, alterei
meus dados para n = {4, 8, 12} e c = {4, 16, 64}, números sugeridos pelo monitor.
Minha máquina é: Macbook Pro (Mid 2012), Processador: 2.5 GHz Intel core i5, Memória: 8GB 1600 MHz DDR3.

strategyNew:

Quantidade de vezes que o CodeBreaker venceu:

|---|-------|--------|--------|
|c\n|   4   |    8   |   12   |  
|---|-------|--------|--------|
| 4 | 10/10 | 10/10  | 10/10  |
|---|-------|--------|--------|
|16 | 10/10 | 10/10  | 10/10  |
|---|-------|--------|--------|
|64 | 10/10 | 10/10  | 10/10  |
|---|-------|--------|--------|

Média de Rodadas pro CodeBreaker vencer:

|---|-------|--------|--------|
|c\n|   4   |    8   |   12   |  
|---|-------|--------|--------|
| 4 |  3.7  |   3.9  |   3.9  |
|---|-------|--------|--------|
|16 | 13.3  |  14.3  |  15.1  |
|---|-------|--------|--------|
|64 | 46.4  |  57.4  |  61.3  |
|---|-------|--------|--------|

Quantidade de cláusulas produzidas:

|---|-------|--------|--------|
|c\n|   4   |    8   |   12   |  
|---|-------|--------|--------|
| 4 |  40   |   80   |   120  |
|---|-------|--------|--------|
|16 |  532  |  1056  |  1608  |
|---|-------|--------|--------|
|64 | 8320  | 16.576 | 24.948 |
|---|-------|--------|--------|


