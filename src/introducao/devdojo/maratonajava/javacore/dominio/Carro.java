package introducao.devdojo.maratonajava.javacore.dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();

    public static final double velocidadeLimite = 205;

    public void setNome(String nome){
        this.nome=nome;

    }

    public String getNome(){
        return nome;
    }

}
