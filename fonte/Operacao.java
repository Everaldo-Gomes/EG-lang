class Operacao{

    private double soma, subtrai, multiplica, divide, resto, divisaoInteira;

    public void setSoma(double a,double b)      {this.soma       = a + b;}
    public void setDiminui(double a,double b)   {this.subtrai    = a - b;}
    public void setMultiplica(double a,double b){this.multiplica = a * b;}

    public void setDivisao(double a,double b){
	if(b == 0){
	    System.out.println("Divisao por 0 não existe");
	}
	this.divide = ((double) a / b);
    }
    public void setResto(double a,double b){this.resto = a % b;	System.out.println(this.resto);}

    //realiza as operações
    public void operacao(Variavel var[],String comandos[],int posicao, int i,byte flag){
	//verifica se o 1º argumento depois da palavra reservada é variavel, se for, guarda o valor dela
	var[posicao] = Variavel.existeVariavel(comandos[i+1],var,posicao);
	if(var[posicao] != null){
	    double a = var[posicao].getValor();

	    //verifica se o 2º argumento depois da palavra reservada é variavel, se for quarda o valor dela e faz a operação 
	    var[posicao] = Variavel.existeVariavel(comandos[i+2],var,posicao);
	    if(var[posicao] != null){
		double b = var[posicao].getValor();
		if(flag == 1)
		    setSoma(a,b);
		else if(flag == 2)
		    setDiminui(a,b);
		else if(flag == 3)
		    setMultiplica(a,b);
		else if(flag == 4)
		    setDivisao(a,b);
		else if(flag == 5)
		    setResto(a,b);
	    }
	    //se o 2º argumento não é variável, enão é um número, então faz a operação da variável e com esse número
	    else{
		if(flag == 1)
		    setSoma(a,Double.parseDouble(comandos[i+2]));
		else if(flag == 2)
		    setDiminui(a,Double.parseDouble(comandos[i+2]));
		else if(flag == 3)
		    setMultiplica(a,Double.parseDouble(comandos[i+2]));
		else if(flag == 4)
		    setDivisao(a,Double.parseDouble(comandos[i+2]));
		else if(flag == 5)
		    setResto(a,Double.parseDouble(comandos[i+2]));
	    }
	}
	//se o 1º argumento for um número testa se o 2º argumento é variável ou número
	else{
	    var[posicao] = Variavel.existeVariavel(comandos[i+2],var,posicao);
	    if(var[posicao] != null){
		double b = var[posicao].getValor();
		if(flag == 1)
		    setSoma(Double.parseDouble(comandos[i+1]),b);
		else if(flag == 2)
		    setDiminui(Double.parseDouble(comandos[i+1]),b);
		else if(flag == 3)
		    setMultiplica(Double.parseDouble(comandos[i+1]),b);
		else if(flag == 4)
		    setDivisao(Double.parseDouble(comandos[i+1]),b);
		else if(flag == 5)
		    setResto(Double.parseDouble(comandos[i+1]),b);
	    }
	    else
		if(flag == 1)
		    setSoma(Double.parseDouble(comandos[i+1]),Double.parseDouble(comandos[i+2]));
		else if(flag == 2)
		    setDiminui(Double.parseDouble(comandos[i+1]),Double.parseDouble(comandos[i+2]));
		else if(flag == 3)
		    setMultiplica(Double.parseDouble(comandos[i+1]),Double.parseDouble(comandos[i+2]));
		else if(flag == 4)
		    setDivisao(Double.parseDouble(comandos[i+1]),Double.parseDouble(comandos[i+2]));
		else if(flag == 5)
		    setResto(Double.parseDouble(comandos[i+1]),Double.parseDouble(comandos[i+2]));
	}
    }
}
