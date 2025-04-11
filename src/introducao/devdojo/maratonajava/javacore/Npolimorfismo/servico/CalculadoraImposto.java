package introducao.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getPreco());
        System.out.println("Imposto: "+imposto);

        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getData_Validade());
        }

    }
}
