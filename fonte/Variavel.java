/*
  Essa classe é usada pra fazer a declaração de variáveis, 
  quando for instânciada pode ser passada sem nenhum parâmetro ou passa com o nome e o valor
  As variáveis apenas são do tipo double
*/

class Variavel{

    public  static final String cria = "Cria";
    private String nome;
    private double valor;

    public void setNome(String n) {this.nome = n;    }
    public void setValor(double v){this.valor = v;   }
    public String getNome()       {return this.nome; }
    public double getValor()      {return this.valor;}
    //public String getCria()       {return this.cria; }  não está sendo mais usada

    public static void atribuiVariavel(Variavel var[], int i, int posicao, String comandos[], int linhaAtual){
	var[posicao] = new Variavel();
	var[posicao].setNome(comandos[i+1]);
	var[posicao].setValor(Double.parseDouble(comandos[i+2]));
	System.out.println(var[posicao].getNome()); //apagar
	System.out.println(var[posicao].getValor());//apagar
    }
}
