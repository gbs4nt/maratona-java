package introducao.devdojo.maratonajava.javacore.Npolimorfismo.test;

import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("PC gamer", 2000);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        Tomate tomate = new Tomate("Jojô", 20);
        tomate.setData_Validade("11/12/2000");

        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
