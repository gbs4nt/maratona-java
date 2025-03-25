package introducao.devdojo.maratonajava.javacore.Csobrecargametodos.test;


import introducao.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kimetsu no yaiba", "Sim", 12, "Ação");
        anime.init("Owari no Seraph", "TV", 12, "Ação");
        anime.imprimir();

    }
}
