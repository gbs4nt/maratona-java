package introducao.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
