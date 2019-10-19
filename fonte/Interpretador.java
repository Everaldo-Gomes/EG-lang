import java.util.Scanner;

class Interpretador{
    
    private Variavel[] var = new Variavel[3000];   //usada para guardar as variáveis

    private Operador operadorObj = new Operador(); //usada para decidir qual operador vai usar
    private int linhaAtual;
    
    public int getLinhaAtual(){return this.linhaAtual;}
    
    public void interpreta(String comandos[], int totalLinha){
	this.linhaAtual = 1;
	int posicao = 0; //posicao do vetor de variaveis

	for(int i = 0; i < totalLinha; i++,this.linhaAtual++){
	    //cria variáveis
	    if(comandos[i].equals(var.getCria())){
		var[posicao] = new Variavel(comandos[i+1]);//,Double.parseDouble(comandos[i+2]));
		//var[posicao].setNome(comandos[i+1]);
		//var[posicao].setValor(Double.parseDouble(comandos[i+2]));//setValor recebe o parametro valor que antes é convertido em doulbe
		posicao++;
	    }

	    
	    //calcula as operações básicas
	    else if(comandos[i].equals(operadorObj.getSoma())){
		double soma = var[posicao].getValor() + var[posicao-1].getValor();
		System.out.println(soma);
	    }/*
	    else if(comandos[i].equals(operadorObj.getSubtracao())){
		double subtracao = var[posicao-1].getValor() - var[posicao-2].getValor();
	    }
	    else if(comandos[i].equals(operadorObj.getDivisao())){
		double divisao = var[posicao-1].getValor() / var[posicao-2].getValor();
	    }
	    else if(comandos[i].equals(operadorObj.getMultiplicacao())){
		double multiplicaco = var[posicao-1].getValor() * var[posicao-2].getValor();
	    }
	    else if(comandos[i].equals(operadorObj.getResto())){
		double resto = var[posicao-1].getValor() % var[posicao-2].getValor();
	    }

	    //atribuição
	    else if(comandos[i].equals(operadorObj.getAtribui())){
		double atribui = var[posicao-2].getValor();
		System.out.println(atribui);
	    } 
	    */
	}
	for(int i = 0; i < 3; i++){
	    //System.out.println(var[i].getNome() + " " + var[i].getValor());
	}
    }
}

