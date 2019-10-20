import java.util.Scanner;

class Interpretador{

    public final int tamanhoVariavel = 3000;
    
    private Variavel[] var = new Variavel[tamanhoVariavel];//usada para guardar as variáveis
    private Operador operadorObj = new Operador(); 
    private int linhaAtual;
    private int posicao;
    
    public int getLinhaAtual(){return this.linhaAtual;}
    
    public void interpreta(String comandos[], int totalLinha){
	this.linhaAtual = 1;

	for(int i = 0; i < totalLinha; i++, this.linhaAtual++){
	    //cria variavel
	    if(comandos[i].equals(Variavel.cria)){
		Variavel.atribuiVariavel(var,i,posicao,comandos,linhaAtual);
		this.posicao++;
	    }

	    //soma dois valores sem variável
	    else if(comandos[i].equals(Operador.soma)) operadorObj.setSoma(Double.parseDouble(comandos[i+1]), Double.parseDouble(comandos[i+2]));
	     
	    }
    }
}

