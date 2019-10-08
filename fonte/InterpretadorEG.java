import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

class Variavel{
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

class Interpretador extends Variavel{

}

class InterpretadorEG{ 
    public static void main(String args[]){

	Variavel objVariavel = new Variavel();
	
	File arquivo = new File(args[0]); //args[0] pega o nome "main.eg" passdo no terminal
	try{
	    Scanner sc = new Scanner(arquivo);
	    while(sc.hasNextLine()){            //começa a ler o arquivo
		String getLine = sc.nextLine(); //a cada espaço, pega o que foi digitado e inseri no array comandos
		objVariavel.setComando(getLine);//chama a função pra quardar os comandos em cada posição
	    }
	    sc.close(); //termina de ler o arquivo
	} 
	catch (FileNotFoundException e){
	    e.printStackTrace();
	}

	/*
	File arquivoLeitura = new File("main.eg");
	
	Scanner getTeclado = new Scanner(System.in);
	
	String str = getTeclado.nextLine();
        String[] arrOfStr = str.split(" ",10); //quantidade que vai ser dividido 
  
        for(String a : arrOfStr) System.out.println(a); 

	arqLeitura.close();
	/*
	FileReader arquivoLeitura = new FileReader("main.eg");
	int c = 0, quantidadeLinhas = 0;
for(String a : arrOfStr) System.out.println(a); 
	while(arqLeitura.ready()){
	    char a = (char)arqLeitura.read();
       
	    comandos[c] = a;

	    
	    if(a == '\n') {
		quantidadeLinhas++;
		System.out.print(comandos[0]); //valor1
		System.out.print(comandos[1]); //espaço em branco
		System.out.print(comandos[2]); //+
		System.out.print(comandos[3]); //espaço em branco
		System.out.print(comandos[4]); //valor2
		

		//break; //encontra o final da linha
	    }

	    if(comandos[2] == '+')
		//primeiro converte as strings em int, depois atribui
		r = (Character.getNumericValue(comandos[0])) + (Character.getNumericValue(comandos[4]));
	    else if(comandos[2] == '-')
		r = (Character.getNumericValue(comandos[0])) - (Character.getNumericValue(comandos[4]));
	    else if(comandos[2] == '*')
		r = (Character.getNumericValue(comandos[0])) * (Character.getNumericValue(comandos[4]));
	    else if(comandos[2] == '/')
		r = (Character.getNumericValue(comandos[0])) / (Character.getNumericValue(comandos[4]));
	    c++;
	}
	arqLeitura.close();
	System.out.print("\n\n");
	for(int i = 0; i < c; i++){
	    System.out.print(comandos[i]);
	
	}
	System.out.print("\n");
	System.out.println(quantidadeLinhas + " " + r);
	*/
    }
}
