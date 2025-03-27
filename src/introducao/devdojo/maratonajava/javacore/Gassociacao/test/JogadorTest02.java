package introducao.devdojo.maratonajava.javacore.Gassociacao.test;

import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("mONESY");
        Time time = new Time("Safadas");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
