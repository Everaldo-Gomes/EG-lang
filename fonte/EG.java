import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

class EG{ 
    public static void main(String args[]) throws Exception{
        
	Interpretador objInterpretador = new Interpretador(); //cria o objeto que vai ser o arquivo
	
	File arquivo = new File(args[0]); //args[0] pega o nome "main.eg" passdo no terminal
	try{
	    Scanner sc = new Scanner(arquivo);
	    while(sc.hasNextLine()){            //começa a ler o arquivo
		String getLine = sc.nextLine(); //a cada espaço, pega o que foi digitado e inseri no array comandos
		objInterpretador.setComando(getLine);//chama a função pra guardar os comandos em cada posição
	    }
	    sc.close(); //termina de ler o arquivo
	} 
	catch (FileNotFoundException e){
	    System.out.println("Não foi possível executar " + args[0] + "." + " Verifique o nome do arquivo.");
	}
    }
}
