import java.util.CharArray;
import Estado;
import Primitivo;

class Token {

  private String conteudo;
  private Primitivo classe;

  public Token() {
    this.conteudo = "";
    this.classe = null;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public String getConteudo() {
    return this.conteudo;
  }

  public Classe getClasse() {
    return this.classe;
  }

  public void definirToken(Estado estadoFinal) {
    if(estadoFinal == Estado.Numerico) {
      this.classe = Primitivo.Inteiro; //TODO implementar tratamento flutuante
    }
    else if (estadoFinal == Estado.Operador) {
      this.classe = Primitivo.Operador;
    }
    else if (estadoFinal == Estado.Alfabetico) {
      ; //TODO implementar 
    }
  }
}
