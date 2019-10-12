import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

class EG{ 
    public static void main(String args[]) throws Exception{
	
	File arquivo = new File(args[0]); //args[0] pega o nome "main.eg" passdo no terminal
	Interpretador objInterpretador = new Interpretador(); //cria o objeto que vai ser o arquivo
	String comandos[] = new String[3000]; //quantidade de linhas que consegue ler

	try{
	    Scanner sc = new Scanner(arquivo);
	    
	    //guarda cada linha em cada posição
	    int linha = 0;
	    while(sc.hasNext()){
		comandos[linha] = sc.next(); //adiciona uma palavra no vetor
		comandos[linha].trim(); // remove os espaços do começo e final da linha
		linha++;
	    }

	    //se quiser ver o que tem no array "comandos" executa a linha abaixo
	    //int f = comandos.length;
	    for(int i = 0; i < linha; i++)
		System.out.println(comandos[i]);    
	    
	    
	    objInterpretador.interpreta(comandos, linha);//começa a interpretar 
	    sc.close(); //termina de ler o arquivo
	} 
	catch (FileNotFoundException e){
	    System.out.println("Não foi possível executar " + args[0] + "." + " Verifique o nome do arquivo.");
	}
	
    }
}
