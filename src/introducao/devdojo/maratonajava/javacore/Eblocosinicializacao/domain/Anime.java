package introducao.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Sim mano inicia antes do construtor");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i]=i+1;

        }

        System.out.println(episodios);
        for(int episodio:this.episodios){
            System.out.print(episodio+ " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
