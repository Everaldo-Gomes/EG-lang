import java.util.Scanner;

class Interpretador{

    public final int tamanhoVariavel = 3000;
    
    private Variavel[] var = new Variavel[tamanhoVariavel];//usada para guardar as variáveis
    private Operacao operacaoObj = new Operacao(); 
    private int linhaAtual;
    private int posicao;
    
    //public int getLinhaAtual(){return this.linhaAtual;} até agora não está sendo usada 
    
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

	    //soma
	    else if(comandos[i].equals(Operador.soma)){
		//verifica se o 1º argumento depois da palavra reservada SOMA é variavel, se for, guarda o valor dela
		var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao);
		if(var[posicao] != null){
		    double a = var[posicao].getValor();

		    //verifica se o 2º argumento depois da palavra reservada SOMA é variavel, se for quarda o valor dela e faz a operação 
		    var[posicao] = Variavel.existeVariavel(comandos[i+2],var,posicao);
		    if(var[posicao] != null){
			double b = var[posicao].getValor();
			operacaoObj.setSoma(a,b);
		    }//se o 2º argumento não é variável, enão é um número, então faz a peração a variável e com esse número
		    else
			operacaoObj.setSoma(a,Double.parseDouble(comandos[i+2]));
		}
		//se o 1º argumento for um número testa se o 2º argumento é variável ou número
		else{
		    var[posicao] = Variavel.existeVariavel(comandos[i+2],var,posicao);
		    if(var[posicao] != null){
			double b = var[posicao].getValor();
			operacaoObj.setSoma(Double.parseDouble(comandos[i+1]),b);
		    }
		    else
			operacaoObj.setSoma(Double.parseDouble(comandos[i+1]),Double.parseDouble(comandos[i+2]));
		
		}   
	    }
	}
    }   
}

