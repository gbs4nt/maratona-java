package introducao.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;


    public static final double velocidadeLimite = 205;

    public void setNome(String nome){
        this.nome=nome;

    }

    public String getNome(){
        return nome;
    }

}
