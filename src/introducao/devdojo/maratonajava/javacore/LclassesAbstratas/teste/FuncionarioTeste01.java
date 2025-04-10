package introducao.devdojo.maratonajava.javacore.LclassesAbstratas.teste;

import introducao.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import introducao.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Funcionario;
import introducao.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);

        Desenvolvedor desenvolvedor= new Desenvolvedor("Toya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
