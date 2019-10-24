# Como compilar
#### javac *.java

# Como executar
#### java EG main.eg

</br></br>
# Como usar a linguagem EG 
<p>
Na linguagem EG, diferentimente de muitas outras não é preciso colocar o ";" ao final de cada comando.</br>
A extensão de cada arquivo deve ser .eg. </br><strong>Ex: arquivo.eg</strong>
</p>

# Variáveis
<p>
Antes de começar a fazer qualquer operação, você deve criar uma variavel e atribuir um valor inicial, não importa onde você declara, mas assim como outras linguagens você tem que declara-lá antes de usar. O exemplo abaixo mostra como criar uma variável de nome var e que recebe o valor 10.</br>
<strong> EX:</br> Cria var 10 </strong></br></br>
<strong>Importante</strong>, se uma nova variável for declarada com o mesmo nome de uma variável já existente, a variável antiga vai perder o valor.
</p>

# Operações
<p>
Depois que a variável estiver declarada, você pode fazer algumas operações como a soma, subtração, multiplicação, divisão e resto. Usando as palavras-chaves <strong>Soma, Subtrai, Divide, Multiplica e resto </strong>. Pode-se fazer esses tipos de operações de várias maneiras, veja alguns exemplos. </br></br>

<strong>
Cria var1 2 </br>
Cria var2 5 </br>

Soma 1 5          </br>
Subrai var1 5     </br>
Multiplica 1 var2 </br>
Divide var1 var2  </br>
Resto  var1 10    </br>
</strong>
</p>

# Atribuição
<p>
Depois que uma variável é criada, você pode mudar seu valor fazendo uma nova atribuição. Usando a palavra reservada <strong>Atribui</strong>, Você pode fazer essa alteração de maneiras diferentes, passando o novo valor ou passsando algumas das operações aritiméticas citadas no tópico a cima. Veja o exemplo a seguir. </br>
 <strong>
  Ex: </br>
  Cria a 10 </br>
  Cria b 20 </br>
  Cria c 40 </br>
  
  Atribui a 50 </strong> //atribui um novo valor para a variável a. </br>
  <strong>Atribui b Soma 10 30 </strong> //atribui à variável b o resultado da soma 10 + 30. </br>
  <strong>Atribui a Soma b c</strong> //atribui à variável a o resultado da soma entre os valores das variáveis b e c</br>
  <strong>Atribui a Subrai b 1</strong> //atribui à variável a o resultado da subtração entre o valor da variável b e o número 1</br>
  <strong>Atribui a Multiplica 2 c</strong>//atribui à variável a o resultado da multiplicação entre o número 2 valor da variável c</br>
  <strong>Atribui a Divide 1 1</strong> //atribui à variável a o resultado da divisão  1 e 1</br>
  <strong>Atribui a Resto 1 1</strong> //atribui à variável a o resultado do resto 1 e 1</br>
  
  
</p>

# Imprimindo na tela
<p>
Para mostrar na tela alugma informação, você deve usar os operadores de impressão <strong> M >> << M </strong>. Qualquer outra informação que deseja imprimir na tela e não estiver entre esses operadores será ignorada. Dentro desses operadores você vai precisar usar mais três operadores, são eles:</br>
 
Quebra de linha: <strong> <<n </strong></br>
Mostrar nome da variável: <strong> <<nome </strong></br>
Mostrar valor da variável: <strong> <<valor </strong></br>

<strong>Ex:</br></strong>

//começo do arquivo</br>
<strong>
Cria a 10</br>
Cria b 20</br>

M>> O valor de a <<nome é a <<valor <<n <<M </br>
M>> O valor <<n de b <<nome <<n é: b <<valor <<n <<M </br>
</strong>
//fim do arquivo </br>

<strong>
 Saída do programa: </br>
 O valor de a é 10 </br>
 O valor </br>
 de b </br>
 é 20
</strong>
</p>
