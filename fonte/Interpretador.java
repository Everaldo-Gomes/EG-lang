class Interpretador{
    private String comandos[] = new String[1000]; //o arquivo pode ter até 1000 linhas

    public void setComando(String s){
	//quebrando as linhas
	//quebra quando tiver um espaço em branco, e pode quebrar até 1000 entradas.
	this.comandos = s.split(" ",1000);
	
	//se quiser ver o que tem no array "comandos" executa a linha abaixo
	int f = comandos.length;
	for(int i = 0; i < f; i++)
	System.out.println(comandos[i]); 	
    }

}
