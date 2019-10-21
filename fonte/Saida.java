//TODO
//definir quando vai mostra o nome da variavel
import java.lang.String ;
class Saida{
    public static final String mostraNaTela = "M>>";
    public static final String terminaMostraNaTela = "<<M";
    public static final String quebraLinha = "<<n";
    
    public void mostra(String comandos[], Variavel var[],int i, int posicao){
	i += 1; // se começar de 0 vai mostrar a palavra reservada (M>>)
	while(!comandos[i].equals(terminaMostraNaTela)){

	    //verifica se o valor passado é uma variável
	    var[posicao] = var[posicao].existeVariavel(comandos[i],var,posicao);
	    if(var[posicao] != null){
		//se passar a variável vai exibir seu nome
		if(comandos[i].equals('\\')){
		    System.out.print(var[posicao].getNome() + " ");
		}
		//se passar apenas a variável vai exibir seu valor
		else if(comandos[i].equals(var[posicao].getNome())) System.out.print(var[posicao].getValor() + " ");
		
	    }
	    
	    //outras informações que não sejam variáveis
	    else if(comandos[i].equals(quebraLinha)) {
		System.out.println(""); //quebra linha quando encontrar o <<n
	    }
	    else{
		System.out.print(comandos[i] + " ");
	    }
	    i++;
	}
    }
}   

