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
   
    private static int atribuicaoOperacao(Variavel var[], int i, int posicao, int po, String comandos[], byte flag){
	posicao += 1;
	var[posicao] = Variavel.existeVariavel(comandos[i+3],var,posicao);
	if(var[posicao] != null){ //se o 1º argumento for variável
	    int po1 = posicao;
	    posicao += 1;
		    
	    //verifica se o 2º argumento é variável
	    var[posicao] = Variavel.existeVariavel(comandos[i+4],var,posicao);
	    if(var[posicao] != null){
		if(flag == 1)
		    var[po].setValor(var[po1].getValor() + var[posicao].getValor());
		else if(flag == 2)
		    var[po].setValor(var[po1].getValor() - var[posicao].getValor());
		else if(flag == 3)
		    var[po].setValor(var[po1].getValor() * var[posicao].getValor());
		else if(flag == 4)
		    var[po].setValor(var[po1].getValor() / var[posicao].getValor());
		else if(flag == 5)
		    var[po].setValor(var[po1].getValor() % var[posicao].getValor());
		return 0;
	    }
	    else{
		if(flag == 1)
		    var[po].setValor(var[po1].getValor() + Double.parseDouble(comandos[i+4]));
		else if(flag == 2)
		    var[po].setValor(var[po1].getValor() - Double.parseDouble(comandos[i+4]));
		else if(flag == 3)
		    var[po].setValor(var[po1].getValor() * Double.parseDouble(comandos[i+4]));
		else if(flag == 4)
		    var[po].setValor(var[po1].getValor() / Double.parseDouble(comandos[i+4]));
		else if(flag == 5)
		    var[po].setValor(var[po1].getValor() % Double.parseDouble(comandos[i+4]));
		return 0;
	    }
	}
    
	//se o 1º argumento não for variável
	else{
	    var[posicao] = Variavel.existeVariavel(comandos[i+4],var,posicao);
	    //se o 2º argumento for variável
	    if(var[posicao] != null){
		if(flag == 1)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) + var[posicao].getValor());
		else if(flag == 2)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) - var[posicao].getValor());
		else if(flag == 3)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) * var[posicao].getValor());
		else if(flag == 4)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) / var[posicao].getValor());
		else if(flag == 5)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) % var[posicao].getValor());
		return 0;
	    }
	    //então todos são valores
	    else{
		if(flag == 1)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) + Double.parseDouble(comandos[i+4]));
		else if(flag == 2)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) - Double.parseDouble(comandos[i+4]));
		else if(flag == 3)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) * Double.parseDouble(comandos[i+4]));
		else if(flag == 4)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) / Double.parseDouble(comandos[i+4]));
		else if(flag == 5)
		    var[po].setValor(Double.parseDouble(comandos[i+3]) % Double.parseDouble(comandos[i+4]));
		return 0;
	    }
	}
    }
   
    public static int atribuiVariavel(Variavel var[], int i, int posicao, String comandos[]){
	//verifica se o 2º argumento a receber um valor é uma variável
	var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao);
	if(var[posicao] != null){
	    int po = posicao;  //variavel a receber o valor. isso é usado para o valor não ser substituido

	    //faz uma operacao antes de atribuir o valor
	    if(comandos[i+2].equals(Operador.soma)){
		byte flag = 1;
		atribuicaoOperacao(var,i,posicao,po,comandos,flag);
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.subtracao)){
		byte flag = 2;
		atribuicaoOperacao(var,i,posicao,po,comandos,flag);
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.multiplicacao)){
		byte flag = 3;
		atribuicaoOperacao(var,i,posicao,po,comandos,flag);
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.divisao)){
		byte flag = 4;
		atribuicaoOperacao(var,i,posicao,po,comandos,flag);
		return 0;
	    }
	    else if(comandos[i+2].equals(Operador.resto)){
		byte flag = 5;
		atribuicaoOperacao(var,i,posicao,po,comandos,flag);
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
