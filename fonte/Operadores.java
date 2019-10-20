class Operador{

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
    public void setResto(double a,double b){this.resto = a % b;}
    public void setDivisaoInteira(double a,double b){
	if (b == 0){
	    System.out.println("Divisao por 0 não existe");
	}
	this.divisaoInteira = a / b;
    }
    
    /*
    private String soma          = "Soma";
    private String subtracao     = "Subtrai";
    private String divisao       = "Divide";
    private String multiplicacao = "Multiplica";
    private String resto         = "Resto";

    private String atribui       = "=";

    private String maior         = "MaiorQue";
    private String menor         = "MenorQue";
    private String maiorIgual    = "MaiorIgual";
    private String menorIgual    = "MenorIgual";
    private String igual         = "Igual";
    private String diferente     = "Diferente";
    private String e             = "EE";
    private String ou            = "OO";
    
    public String getSoma()         {return this.soma;         }
    public String getSubtracao()    {return this.subtracao;    }
    public String getDivisao()      {return this.divisao;      }
    public String getMultiplicacao(){return this.multiplicacao;}
    public String getResto()        {return this.resto;        }

    public String getAtribui()      {return this.atribui;      }

    public String getMaior()        {return this.maior;        }
    public String getMenor()        {return this.menor;        }
    public String getMaiorIgual()   {return this.maiorIgual;   }
    public String getMenorIgual()   {return this.menorIgual;   }
    public String getIgual()        {return this.igual;        }
    public String getDiferente()    {return this.diferente;    }
    public String getE()            {return this.e;            }
    public String getOu()           {return this.ou;           }   
    */
}
 
