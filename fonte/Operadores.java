class Aritimetico{

    private String soma          = "Soma";
    private String subtracao     = "Subtrai";
    private String divisao       = "Divide";
    private String multiplicacao = "Multipilica";
    private String resto         = "Resto";

    public String getSoma()         {return this.soma;         }
    public String getSubtracao()    {return this.subtracao;    }
    public String getDivisao()      {return this.divisao;      }
    public String getMultiplicacao(){return this.multiplicacao;}
    public String getResto()        {return this.resto;        }
}

class Atribuicao{

    private String igual = "=";
    
    public String getIgual(){return this.igual;}
}

class Logico{
    private String maior       = "MaiorQue";
    private String menor       = "MenorQue";
    private String maiorIgual  = "MaiorIgual";
    private String menorIgual  = "MenorIgual";
    private String igual       = "Igual";
    private String diferente   = "Diferente";
    private String e           = "EE";
    private String ou          = "OO";

    public String getMaior()     {return this.maior;     }
    public String getMenor()     {return this.menor;     }
    public String getMaiorIgual(){return this.maiorIgual;}
    public String getMenorIgual(){return this.menorIgual;}
    public String getIgual()     {return this.igual;     }
    public String getDiferente() {return this.diferente; }
    public String getE()         {return this.e;         }
    public String getOu()        {return this.ou;        }   
}
