import java.util.Scanner;

/*DEFININDO AS VARIAVIES E AS OPERAÇÕES. AINDA NÃO ESTÁ PRONTO*/

class Interpretador{
    
    private Variavel[] var = new Variavel[3000];   //usada para guardar as variáveis
    private Operador operadorObj = new Operador(); //usada para decidir qual operador vai usar
    private int linhaAtual;
    
    public int getLinhaAtual(){return this.linhaAtual;}
    
    public void interpreta(String comandos[], int totalLinha){
	this.linhaAtual = 1;
	int posicao = 0; //posicao do vetor de variaveis
	double v = 0; // valor passado para a variavel criada
	
	for(int i = 0; i < totalLinha; i++,this.linhaAtual++,posicao++){
	    var[posicao] = new Variavel();

	    //cria variáveis
	    if(comandos[i].equals(var[posicao].getCria())){
		String nome  = comandos[i+1];
		double valor = Double.parseDouble(comandos[i+2]);
		var[posicao] = new Variavel(nome,valor);
		var[posicao].setValor(valor);
	    }
	    
	    //calcula as operações básicas
	    else if(comandos[i].equals(operadorObj.getSoma())){
		//procuraVariavel(var,var[i].getNome());
		
		//1º converte a string pra double, depois atribui
		//v = Double.parseDouble(comandos[posicao+1]) + Double.parseDouble(comandos[posicao+2]);
		//v = var[posicao].getValor() + var[posicao+1].getValor();
		//var[posicao].setValor(v);
		//System.out.println(var[posicao].getValor());
		//System.out.println(v);
		/*
		  PENSANDO EM TRANSFORMAR AS LINHAS A CIMA EM:
		  var[posicao].setValor(Double.parseDouble(comandos[posicao+1]) + Double.parseDouble(comandos[posicao+2]));
		  PRA DAÍ NÃO COLOCAR A VARIAVEL double v, MAS NÃO SEI SE VAI FICAR RUIM DE ENTENDER
		*/
	    }
	    else if(comandos[i].equals(operadorObj.getSubtracao())){
		v = Double.parseDouble(comandos[i+1]) - Double.parseDouble(comandos[i+2]);
		var[posicao].setValor(v);
		System.out.println(var[posicao].getValor());
	    }
	    else if(comandos[i].equals(operadorObj.getDivisao())){
		v = Double.parseDouble(comandos[i+1]) / Double.parseDouble(comandos[i+2]);
		var[posicao].setValor(v);
		System.out.println(var[posicao].getValor());
	    }
	    else if(comandos[i].equals(operadorObj.getMultiplicacao())){
		v = Double.parseDouble(comandos[i+1]) * Double.parseDouble(comandos[i+2]);
		var[posicao].setValor(v);
		System.out.println(var[posicao].getValor());
	    }
	    else if(comandos[i].equals(operadorObj.getResto())){
		v = Double.parseDouble(comandos[i+1]) % Double.parseDouble(comandos[i+2]);
		var[posicao].setValor(v);
		System.out.println(var[posicao].getValor());
	    }
	    
	    //System.out.println(linhaAtual);
	}
	
	//System.out.println(var[1].getNome());
	//System.out.println(var[0].getValor());
	
    }

    public Variavel procuraVariavel(Variavel variavelVetor[], String nomeVariavel){
	int i =0;
	while(!variavelVetor[i].equals(nomeVariavel)){
	    i++;
	}
	return variavelVetor[i];	
    }
}

