import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

class InicioArquivo{
    private String comandos[] = new String[10];

    public void setComando(String s){
	//quebrando as linhas
	//quebra quando tiver um espaço em branco, e pode quebrar até 10 entradas, AINDA DEFINIR A QUANTIDADE DE COMANDOS QUE VAI TER EM UMA LINHA
	this.comandos = s.split(" ",10);
	
	//se quiser ver o que tem no array "comandos" executa a linha abaixo
	//int f = comandos.length;
	//for(int i = 0; i < f; i++)
	//System.out.println(comandos[i]); 	
    }
}

class InterpretadorEG{ 
    public static void main(String args[]) throws Exception{
        
	InicioArquivo objInicioArquivo = new InicioArquivo();
	
	File arquivo = new File(args[0]); //args[0] pega o nome "main.eg" passdo no terminal
	try{
	    Scanner sc = new Scanner(arquivo);
	    while(sc.hasNextLine()){            //começa a ler o arquivo
		String getLine = sc.nextLine(); //a cada espaço, pega o que foi digitado e inseri no array comandos
		objInicioArquivo.setComando(getLine);//chama a função pra guardar os comandos em cada posição
	    }
	    sc.close(); //termina de ler o arquivo
	} 
	catch (FileNotFoundException e){
	    System.out.println("Não foi possível executar. Verifique o nome do arquivo.");
	}
    }
}
