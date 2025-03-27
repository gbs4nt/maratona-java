package introducao.devdojo.maratonajava.javacore.Gassociacao.test;

import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class TimeTest01 {
    public static void main(String[] args) {

    Jogador jogador = new Jogador("É ele mermo papain");
    Time time = new Time("O time dele mermom papain");
    Jogador[] jogadores = {jogador};

    jogador.setTime(time);
    time.setJogadores(jogadores);
        System.out.println("---Jogador---");
        jogador.imprime();
        System.out.println("---Time---");
        time.imprime();
    }
}
