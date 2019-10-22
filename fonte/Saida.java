class Saida{
    public static final String mostraNaTela = "M>>";
    private String terminaMostraNaTela = "<<M";
    private String quebraLinha = "<<n";
    private String exibeNomeVariavel = "<<nome";
    private String exibeValorVariavel = "<<valor";
    
    public void mostra(String comandos[], Variavel var[],int i, int posicao){
	i += 1; // se começar de 0 vai mostrar a palavra reservada (M>>)
	while(!comandos[i].equals(terminaMostraNaTela)){

	    //verifica se o valor passado é uma variável
	    var[posicao] = var[posicao].existeVariavel(comandos[i],var,posicao);
	    if(var[posicao] != null){

		//se passar a variável seguido de <<nome vai exibir o nome da variável
		if(comandos[i].equals(var[posicao].getNome()) && (comandos[i+1].equals(exibeNomeVariavel))){
		    System.out.print(var[posicao].getNome() + " ");
		    i += 1; // pra não aparecer o "<<nome"
		}
		    
		//se passar apenas a variável vai exibir seu valor
		else if(comandos[i].equals(var[posicao].getNome()) && comandos[i+1].equals(exibeValorVariavel)){
		    System.out.print(var[posicao].getValor() + " ");
		    i += 1; // pra não aparecer o "<<valor"
		}
	    }
	    
	    //avisa se não passar a variável quando for exibir o nome e/ou o valor
	    else if(comandos[i].equals(exibeNomeVariavel) || comandos[i].equals(exibeValorVariavel)) {
		System.out.println("\nError de sintax.");
		break;
	    }
	    
	    //outras informações que não sejam variáveis
	    else if(comandos[i].equals(quebraLinha))
		System.out.println(""); //quebra linha quando encontrar o <<n
	    else
		System.out.print(comandos[i] + " "); //mostra o conteudo e dá um espaço
	    i++;
	}
    }
}   
