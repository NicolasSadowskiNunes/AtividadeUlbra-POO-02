# AtividadeUlbra-POO-02

## 01 - Simulador de Dados
Nesse programa, é utilizado a classe Random do Java, onde ela gera um número aleatório. Nisso é criado uma variável 'dado' que recebe o número que caiu no dado, simulando um dado de 6 lados. 
Inicia-se um loop que laça o dado 3 vezes, soma e exibe o resultado no final, como é passado para a variável geraNum pegar um número de 0 a 5, é somado + 1 para ele nunca pegar zero e também conseguir pegar o número 6.

## 02 - Ajuste de Preços em Farmácia
Cria-se uma variavel 'i', com o valor igual a um, e uma variavel para armazenar o valor solicitado ao usuário, o loop de while se encerra, decrementando a variável 'i', tornando-a igual a 0, que na condição do loop não pode ocorrer.
Com o valor recebido, cria-se uma variável dentro do loop para sempre zerar o resultado, e também já recebe o calculo, para exibir o valor anterior e mostrar o valor atualizado.
Caso seja encerrado o programa, ele exibe uma mensagem de erro, instruindo o usuário a colocar valores maior que 1,

## 03 - Gerador de Senhas Aleatórias
Iniciamos uma 'string senha' e um 'int digito' que determina o tamanho da senha (multiplica por 6, pois ele pega um número aleatório até 5 e soma com o +5, assim nunca gerando uma quantidade abaixo de 5, ou mais que 10).
Cira-se um loop do tamanho da senha, onde seleciona números de 5 a 10 e concatena na 'string senha'.

## 04 - Inversor de Frases
Inicia-se passando um valor por scanner, depois utiliza-se o método da classe String, 'replaceAll()', onde é passado por parâmetro '\\s' que seleciona todos os espaços em branco na string, e subistitui por outra string.
Para inverter o texto, acabei por encontrar a classe StringBuilder, utilizada para manipular strings, utilizando o método 'StringBuilder().reverse() inverter o texto, instanciando a classe em uma variável.

## 05 - Detector de Conteúdo Impróprio
É criado o scan e o array que irá armazenar as palavras impróprias, caso isso fosse um programa maior, essa prática ajudaria bastante.
É solicitado ao usuário que ele escreva uma frase, após a leitura da entrada, o programa entra em um loop para percorrer as palavras banidas.
Caso encontre uma palavra banida, ele muda a variavel 'encontrou' para 'true' e depois verifica a condição de true ou false fora do loop, dizendo se o conteúdo é impróprio ou não.

## 06 - Manipulação de Substrings
É passado o texto por um scanner, depois é usado a substring de texto para percorrer todos os caracteres a partir do indice 0 até o último, porém este último é diminuido em 1. Assim removendo o último caractere.

## 07 - Calculadora de Potência
É solicitado um número e em qual potência estará este número, após isso, todo o cálculo é realizado dentro do 'system.out' utilizando o Math.pow passando a variável 'num' e 'pot' por parâmetro.

## 08 - Conversor de Radianos para Graus
É um código bem simples, é solicitado o raio, o programa calcula os graus, passando a variável 'raio' por parâmetro para o método Math.toDegrees() e exibindo o resultado no console.
