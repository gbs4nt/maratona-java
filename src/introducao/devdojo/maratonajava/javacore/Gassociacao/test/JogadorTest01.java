package introducao.devdojo.maratonajava.javacore.Gassociacao.test;

import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

    Jogador jogador01 = new Jogador("Phzinxl");
    Jogador jogador02 = new Jogador("Vini putunior");
    Jogador jogador03 = new Jogador("Ana yasmin zagueira passa nada.br");

    Jogador[] jogadores = {jogador01, jogador02, jogador03};

    for(Jogador jogador: jogadores){
        jogador.imprime();

    }
    }
}
