package introducao.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do Computador: ");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " +computador.getNome());
        System.out.println("Valor: "+computador.getPreco());
        System.out.println("Imposto a ser pago: "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do Tomate");

        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getPreco());
        System.out.println("Imposto a ser pago: "+imposto);
    }
}
