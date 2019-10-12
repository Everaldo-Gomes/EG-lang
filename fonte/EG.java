import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

class EG{ 
    public static void main(String args[]) throws Exception{
	
	File arquivo = new File(args[0]); //args[0] pega o nome "main.eg" passdo no terminal
	Interpretador objInterpretador = new Interpretador(); //cria o objeto que vai ser o arquivo
	String comandos[] = new String[3000];

	try{
	    Scanner sc = new Scanner(arquivo);
	    
	    //guarda cada linha em cada posição
	    int a = 0;
	    while(sc.hasNextLine()){
		comandos[a] = sc.nextLine();
		a++;
	    }

	    //se quiser ver o que tem no array "comandos" executa a linha abaixo
	    //int f = comandos.length;
	    for(int i = 0; i < 20; i++)
		System.out.println(comandos[i]);	
	    
	    
	    objInterpretador.comecaInterpretar(comandos);//começa a interpretar 
	    sc.close(); //termina de ler o arquivo
	} 
	catch (FileNotFoundException e){
	    System.out.println("Não foi possível executar " + args[0] + "." + " Verifique o nome do arquivo.");
	}
	
    }
}
