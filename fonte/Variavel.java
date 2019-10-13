/*
  Essa classe é usada pra fazer a declaração de variáveis, 
  quando for instânciada pode ser passada sem nenhum parâmetro ou passa com o nome e o valor
  As variáveis apenas são do tipo double
*/

class Variavel{

    private String cria = "Cria";
    private String nome;
    private double valor;

    public Variavel(){}
    
    public Variavel(String n, double v){
	this.nome = n;
	this.valor = v;
    }
    
    public void setNome(String n) {this.nome = n;    }
    public void setValor(double v){this.valor = v;   }
    public String getNome()       {return this.nome; }
    public double getValor()      {return this.valor;}
    public String getCria()       {return this.cria; }
}
