import java.util.Scanner;

class Interpretador{

    public final int tamanhoVariavel = 3000;
    
    private Variavel[] var = new Variavel[tamanhoVariavel];//usada para guardar as variáveis
    private Operacao operacaoObj = new Operacao();//usado para definir as operações 
    private int linhaAtual;
    private int posicao;
    
    public void interpreta(String comandos[], int totalLinha){
	this.linhaAtual = 1;

	for(int i = 0; i < totalLinha; i++,this.linhaAtual++){

	    //cria variavel
	    if(comandos[i].equals(Variavel.cria)){
		//verifica se a variavel já existe, se sim, substitui o valor
		var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao); 
		if(var[posicao] != null){
		    Variavel.substituiValorVariavel(var,i,posicao,comandos);
		    continue;
		}
		//se não, cria uma nova variavel
		else{
		    Variavel.atribuiVariavel(var,i,posicao,comandos);
		    this.posicao++;
		}
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
	}
    }   
}
