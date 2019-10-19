import java.Estado;

class MaquinaEstado {

    private Estado[] estado;
    private final String operadores = "=+-*/";

  public MaquinaEstado() {
      this.estado = [Estado.Inicial];
  }

  private void shiftEstado(Estado novo) {
    Estado s;
    s = this.estado[1];
    this.estado[1] = novo;
    this.estado[0] = s;
  }

  private Estado transicaoInicial(char caracter) {
    if(c.isLetter())
      return Estado.Alfabetico;
    else if (c.isDigit())
      return Estado.Numerico;
    else if(this.isOperator(c))
      return Estado.Operador;
    else if(c.isWhitespace())
      return Estado.Final;
    else
      return Estado.Invalido;
  }

  private Estado transicaoAlfabetico(char caracter) {
    if(c.isDigit() || c.isLetter())
      return Estado.Alfabetico;
    else
      return Estado.Final;
  }

  private Estado transicaoNumerico(char caracter) {
    if(c.isDigit())
      return Estado.Numerico;
    else if(c.isLetter())
      return Estado.Invalido;
    else
      return Estado.Final;
  }

  private boolean isOperator(char caracter) {
    return this.operadores.indexOf(caracter) > -1;
  }

  public Estado transicao(char caracter){
    switch (this.estado) {
      case Estado.Inicial:
        shiftEstado(transicaoInicial(caracter));
        break;
      case Estado.Alfabetico:
        shiftEstado(transicaoAlfabetico(caracter));
        break;
      case Estado.Numerico:
        shiftEstado(transicaoNumerico(caracter));
        break;
      case Estado.Operador:
        shiftEstado(transicaoOperador(caracter));
        break;
      default:
        break;
    }
  }

  public boolean ehValido() {
    return this.estado[1] != Estado.Invalido;
  }

  public boolean ehFinal() {
    return this.estado[1] != Estado.Final;
  }

  public void reset() {
      this.estado = [stado.Inicial];
  }

  public Estado getEstadoFinal() {
    return this.estado[0];
  }
}
