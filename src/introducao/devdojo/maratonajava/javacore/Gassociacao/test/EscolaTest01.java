package introducao.devdojo.maratonajava.javacore.Gassociacao.test;

import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya dog");
        Professor[] professores = {professor};
        Escola escola = new Escola("Sim", professores);
        escola.imprime();

    }
}
