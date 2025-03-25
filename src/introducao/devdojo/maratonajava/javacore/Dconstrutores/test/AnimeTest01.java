package introducao.devdojo.maratonajava.javacore.Dconstrutores.test;

import introducao.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Owari no Seraph", "TV", 12, "Ação");
        anime.imprimir();

    }
}
