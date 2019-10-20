import java.util.Scanner;

class Interpretador{
    
    private Variavel[] var = new Variavel[3000];   //usada para guardar as variáveis
    private Operador operadorObj = new Operador(); //usada para decidir qual operador vai usar
    private int linhaAtual;
    
    public int getLinhaAtual(){return this.linhaAtual;}
    
    public void interpreta(String comandos[], int totalLinha){
	this.linhaAtual = 1;
	int posicao = 0;
	for(int i = 0; i < totalLinha; i++, this.linhaAtual++){
	    if(comandos[i].equals("Cria"))// atribuiVariavel(i,posicao,comandos,linhaAtual);
		;
	}
    }

    public void atribuiVariavel(int i, int posicao, String comandos[], int linhaAtual){
	;//var[posicao].setNome(comandos[i+1]);
    }
    

    
}

