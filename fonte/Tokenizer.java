import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.uil.CharArray;
import java.MaquinaEstado;
import java.Token;

class Tokenizer {
  private MaquinaEstado estado;
  private Stack<char> pilhaCaracteres;

  public Tokenizer() {
    this.estado = new MaquinaEstado();
    this.pilhaCaracteres = new Stack();
  }

  public void tokenizer(ArrayList<String> source) {
    Iterator it = source.iterator();

    while(it.hasNext()) {
      Token[] s = processar(it.next());
    }
  }

  private Token[] processar(String instrucao) {
    Token[] lista;
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      estado.transicao(s.charAt(i));
      if (estado.ehValido() && !estado.ehFinal()) {
        this.pilhaCaracteres.push(c);
        continue;
      }
      else if (estado.ehFinal()) {
	  lista[0] = reconhecer(); //foi passado zero apenas para complilar
        this.estado.reset();
      }
      else if (!estado.ehValido())
        throw Exception(popAll() + " ?");
    }
  }

  private Token reconhecer() {
    Token t = new Token();
    t.setConteudo(popAll());
    t.definirToken(this.estado.getEstadoFinal());
    return t;
  }

  private String popAll() {
    char[] s = {};
    while (!this.pilhaCaracteres.empty())
      s[0] = this.pilhaCaracteres.pop(); //foi passado zero apenas para complilar
    return new String(s); 
  }
}
