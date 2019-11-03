class Laco{
    
    public static final String comecaRepetir = "Repete";
    private String terminaRepetir = "Fim";

    public int laco(int linhaAtual, Variavel var[], String comandos[], int i, int posicao, int totalLinha){
	
	int vezes = Integer.parseInt(comandos[i+1]);
	int qnt_vezes = 0;
	
	while(!comandos[i].equals(terminaRepetir)){ //define o escopo do loop
	    
	    while(qnt_vezes != vezes){  //faz o loop determinada vezes
		qnt_vezes += 1;
	    }
	    i++;
	} return 0;
    }
}
