import java.util.Scanner;

class Interpretador{

    public static final int tamanhoVariavel = 5000;
    
    public Operacao operacaoObj = new Operacao();//usado para definir as operações
    private Variavel[] var = new Variavel[tamanhoVariavel];//usada para guardar as variáveis
    private Saida saidaObj = new Saida(); //usada para mostra as mensagem na tela
    private int linhaAtual;
    private int posicao;
    
    public int getLinhaAtual(){return this.linhaAtual;}
    
    public void interpreta(String comandos[], int totalLinha){
	
	for(int i = 0; i < totalLinha; i++){
	    
	    //cria variavel
	    if(comandos[i].equals(Variavel.cria)){
		//verifica se a variavel já existe, se sim, substitui o valor
		var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao); 
		if(var[posicao] != null){
		    Variavel.substituiValorVariavel(var,i,posicao,comandos);
		    continue;
		}
		//se não, cria uma nova variavel
		Variavel.criaVariavel(var,i,posicao,comandos);
		this.posicao++;
	    }

	    //atribui um valor a uma variável
	    else if(comandos[i].equals(Operador.atribui)){
		int variavelNaoDeclarada = Variavel.atribuiVariavel(var,i,posicao,comandos);
		if(variavelNaoDeclarada == -1) break;
	    }

	    //operações
	    //soma
	    else if(comandos[i].equals(Operador.soma)){
		byte flag = 1;
		operacaoObj.operacao(var,comandos,posicao,i,flag);
	    }
	    //subtração
	    else if(comandos[i].equals(Operador.subtracao)){
		byte flag = 2;
		operacaoObj.operacao(var,comandos,posicao,i,flag);
	    }
	    //multiplicação
	    else if(comandos[i].equals(Operador.multiplicacao)){
		byte flag = 3;
		operacaoObj.operacao(var,comandos,posicao,i,flag);
	    }
	    //divisão
	    else if(comandos[i].equals(Operador.divisao)){
		byte flag = 4;
		operacaoObj.operacao(var,comandos,posicao,i,flag);
	    }
	    //resto
	    else if(comandos[i].equals(Operador.resto)){
		byte flag = 5;
		operacaoObj.operacao(var,comandos,posicao,i,flag);
	    }
	    //saida na tela
	    else if(comandos[i].equals(Saida.mostraNaTela)){
		saidaObj.mostra(comandos,var,i,posicao);
	    }
	}
    }
}
