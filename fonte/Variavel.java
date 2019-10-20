class Variavel{

    public  static final String cria = "Cria";
    private String nome;
    private double valor;

    public void setNome(String n) {this.nome = n;    }
    public void setValor(double v){this.valor = v;   }
    public String getNome()       {return this.nome; }
    public double getValor()      {return this.valor;}

    public static void atribuiVariavel(Variavel var[], int i, int posicao, String comandos[]){
	var[posicao] = new Variavel();
	var[posicao].setNome(comandos[i+1]);
	var[posicao].setValor(Double.parseDouble(comandos[i+2]));
	System.out.println(var[posicao].getNome()); //apagar
	System.out.println(var[posicao].getValor());//apagar
    }

    public static void substituiValorVariavel(Variavel var[], int i, int posicao, String comandos[]){
	var[posicao].setNome(comandos[i+1]);
	var[posicao].setValor(Double.parseDouble(comandos[i+2]));
	System.out.println(var[posicao].getNome()); //apagar
	System.out.println(var[posicao].getValor());//apagar
    }

    public static Variavel existeVariavel(String nomeVariavel, Variavel var[], int posicao){
	for(int i = 0; i < posicao; i++){
	    if(var[i].getNome().equals(nomeVariavel)){
		return var[i];
	    } 
	}
	return null;
    }
}
