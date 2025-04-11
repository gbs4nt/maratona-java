package introducao.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public String data_Validade;
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double preco) {
        super(nome, preco);


        }

    public String getData_Validade() {
        return data_Validade;
    }

    public void setData_Validade(String data_Validade) {
        this.data_Validade = data_Validade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate ");
        return this.preco * IMPOSTO_POR_CENTO;
    }
}
