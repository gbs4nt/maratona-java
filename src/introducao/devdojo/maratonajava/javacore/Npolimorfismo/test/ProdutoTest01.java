package introducao.devdojo.maratonajava.javacore.Npolimorfismo.test;

import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Conrrado", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
