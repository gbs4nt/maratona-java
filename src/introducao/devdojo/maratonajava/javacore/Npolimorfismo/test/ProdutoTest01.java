package introducao.devdojo.maratonajava.javacore.Npolimorfismo.test;

import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Conrrado", 10);
        Televisao televisao = new Televisao("Samsumg 50\"", 5000 );

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------");

        CalculadoraImposto.calcularImposto(televisao);
    }
}
