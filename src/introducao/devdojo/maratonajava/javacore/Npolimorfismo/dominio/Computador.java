package introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.20;
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.preco * IMPOSTO_POR_CENTO;
    }



}
