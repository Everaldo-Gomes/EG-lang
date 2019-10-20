class Operador{
 
    public static final String soma          = "Soma";
    public static final String subtracao     = "Subtrai";
    public static final String divisao       = "Divide";
    public static final String multiplicacao = "Multiplica";
    public static final String resto         = "Resto";

    public static final String atribui       = "=";

    public static final String maior         = "MaiorQue";
    public static final String menor         = "MenorQue";
    public static final String maiorIgual    = "MaiorIgual";
    public static final String menorIgual    = "MenorIgual";
    public static final String igual         = "Igual";
    public static final String diferente     = "Diferente";
    public static final String e             = "EE";
    public static final String ou            = "OO";

    private double soma1, subtrai, multiplica, divide, resto1, divisaoInteira;

    public void setSoma(double a,double b)      {this.soma1      = a + b;}
    public void setDiminui(double a,double b)   {this.subtrai    = a - b;}
    public void setMultiplica(double a,double b){this.multiplica = a * b;}

    public void setDivisao(double a,double b){
	if(b == 0){
	    System.out.println("Divisao por 0 não existe");
	}
	this.divide = ((double) a / b);
    }
    public void setResto(double a,double b){this.resto1 = a % b;}
    public void setDivisaoInteira(double a,double b){
	if (b == 0){
	    System.out.println("Divisao por 0 não existe");
	}
	this.divisaoInteira = a / b;
    }

    
    //Não são mais necessárias porque está sendo usado static
    // public String getSoma()         {return this.soma;         }
    // public String getSubtracao()    {return this.subtracao;    }
    // public String getDivisao()      {return this.divisao;      }
    // public String getMultiplicacao(){return this.multiplicacao;}
    // public String getResto()        {return this.resto;        }

    // public String getAtribui()      {return this.atribui;      }

    // public String getMaior()        {return this.maior;        }
    // public String getMenor()        {return this.menor;        }
    // public String getMaiorIgual()   {return this.maiorIgual;   }
    // public String getMenorIgual()   {return this.menorIgual;   }
    // public String getIgual()        {return this.igual;        }
    // public String getDiferente()    {return this.diferente;    }
    // public String getE()            {return this.e;            }
    // public String getOu()           {return this.ou;           }   
}
 
