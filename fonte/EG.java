import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

class EG{  
    public static void main(String args[]) throws Exception{
	
	File arquivo = new File(args[0]); //args[0] pega o nome "main.eg" passdo no terminal
	Interpretador objInterpretador = new Interpretador(); //cria o objeto que vai ser o arquivo
	String comandos[] = new String[Interpretador.tamanhoVariavel]; //quantidade de linhas que consegue ler

	try{
	    Scanner sc = new Scanner(arquivo);

	    //guarda cada palavra em uma posição
	    int linha = 0;

	    while(sc.hasNext()){
		comandos[linha] = sc.next(); //adiciona uma palavra no vetor
		linha++;
	    }
	    
	    objInterpretador.interpreta(comandos,linha); //começa a interpretar 
	    sc.close(); //fecha o arquivo
	} 
	catch(FileNotFoundException e){ //se o nome do arquivo não fo digitado corretamente
	    System.out.println("Não foi possível executar " + args[0] + "." + " Verifique o nome do arquivo.");
	}
    }
}
