package introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double preco) {
        super(nome, preco);


        }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate ");
        return this.preco * IMPOSTO_POR_CENTO;
    }
}
