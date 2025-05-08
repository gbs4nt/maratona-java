package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5L,"Tokyo ghoul", 19.99,0));
        mangas.add(new Manga(30L,"Guntz", 29.00,5));
        mangas.add(new Manga(2034L, "Kami no kodomo", 13.99,4));
        mangas.add(new Manga(2000L, "Fire punch", 23.99,0));
        mangas.add(new Manga(300L,"Hentaizao pau no cu", 20.00,2));
        mangas.add(new Manga(100L, "Chainsaw man", 20.99,0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
