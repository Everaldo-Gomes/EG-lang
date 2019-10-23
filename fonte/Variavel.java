class Variavel{

    public  static final String cria = "Cria";
    private String nome;
    private double valor;

    public void setNome   (String n){this.nome = n;    }
    public void setValor  (double v){this.valor = v;   }
    public String getNome ()        {return this.nome; }
    public double getValor()        {return this.valor;}

    public static void criaVariavel(Variavel var[], int i, int posicao, String comandos[]){
	var[posicao] = new Variavel();
	var[posicao].setNome(comandos[i+1]);
	var[posicao].setValor(Double.parseDouble(comandos[i+2]));
    }
   
    public static int atribuiVariavel(Variavel var[], int i, int posicao, String comandos[]){
	//verifica se o 2º argumento a receber um valor é uma variável
	var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao);
	if(var[posicao] != null){
	    
	    //faz uma operacao antes de atribuir o valor
	    if(comandos[i+2].equals(Operador.soma)){
		var[posicao] = Variavel.existeVariavel(comandos[i+3],var,posicao);
		if(var[posicao] != null)
		    var[posicao].setValor(Double.parseDouble(comandos[i+3]) + Double.parseDouble(comandos[i+4]));
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.subtracao)){
		var[posicao].setValor(Double.parseDouble(comandos[i+3]) - Double.parseDouble(comandos[i+4]));
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.multiplicacao)){
		var[posicao].setValor(Double.parseDouble(comandos[i+3]) * Double.parseDouble(comandos[i+4]));
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.divisao)){
		var[posicao].setValor(Double.parseDouble(comandos[i+3]) / Double.parseDouble(comandos[i+4]));
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.resto)){
		var[posicao].setValor(Double.parseDouble(comandos[i+3]) + Double.parseDouble(comandos[i+4]));
		return 0;
	    }

	    //usando o try-catch porque com if-else não funcionava do jeito esperado
	    try{
		int posicaoVar1 = posicao;
		posicao += 1; //usado para fazer a troca de valores das variáveis

		//verifica se o 3ºargumento que vai ser passado é uma variável  ou se é o próprio valor
		var[posicao] = Variavel.existeVariavel(comandos[i+2],var,posicao);
		if(var[posicao] != null)
		    var[posicaoVar1].setValor(var[posicao].getValor());
		else{
		    var[posicaoVar1].setValor(Double.parseDouble(comandos[i+2]));
		}
	    }
	    catch(Exception e){
		System.out.println("Variável \"" + comandos[i+2] + "\" não foi delcarada");
		return -1;
	    } 
	}
	else{
	    System.out.println("Sintax error. É esperado uma variável ou um valor no 2º argumento");
	    return -1;
	}
	return 0;
    }
    
    public static void substituiValorVariavel(Variavel var[], int i, int posicao, String comandos[]){
	var[posicao].setNome(comandos[i+1]);
	var[posicao].setValor(Double.parseDouble(comandos[i+2]));
    }

    public static Variavel existeVariavel(String nomeVariavel, Variavel var[], int posicao){
	for(int i = 0; i < posicao; i++)
	    if(var[i].getNome().equals(nomeVariavel)) return var[i];	           
	return null;
    }
}






 /*  VAI FICAR AQUI POR ENQUANTO, POR SEGURANÇA

    public static int atribuiVariavel(Variavel var[], int i, int posicao, String comandos[]){
	//verifica se o 2º argumento a receber um valor é uma variável
	var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao);
	if(var[posicao] != null){
	    int posicaoVar1 = posicao;
	    posicao += 1; //usado para fazer a troca de valores das variáveis

	    //usando o try-catch porque com if-else estava sem lógica e não funcionava do jeito esperado
	    try{
		//verifica se o 3ºargumento que vai ser passado é uma variável  ou se é o próprio valor
		var[posicao] = Variavel.existeVariavel(comandos[i+2],var,posicao);
		if(var[posicao] != null)
		    var[posicaoVar1].setValor(var[posicao].getValor());
		else{
		    var[posicaoVar1].setValor(Double.parseDouble(comandos[i+2]));
		}
	    }
	    catch(Exception e){
		System.out.println("Variável \"" + comandos[i+2] + "\" não foi delcarada");
		return -1;
	    }   
	}
	else 
	    System.out.println("Sintax error. É esperado uma variável ou um valor no 2º argumento");
	return 0;
    }

    public static void recebeOutroValor(Variavel var[], int i, int posicao, String comandos[]){
	var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao);
	if(var[posicao] != null){
	    var[posicao].setValor(Double.parseDouble(comandos[i+3]) + Double.parseDouble(comandos[i+4]));
	}
    }


	    //recebe o valor de uma operacao
	    //else if(comandos[i].equals(Operador.recebe)){
		//Variavel.recebeOutroValor(var,i,posicao,comandos);
		//}


		    public static final String recebe        = "Recebe";
    */
