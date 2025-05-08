package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Tokyo ghoul", 19.99,0));
        mangas.add(new Manga(30L,"Guntz", 29.00,5));
        mangas.add(new Manga(2034L, "Kami no kodomo", 8,4));
        mangas.add(new Manga(2000L, "Fire punch", 23.99,0));
        mangas.add(new Manga(300L,"Hentaizao pau no cu", 2,2));
        mangas.add(new Manga(100L, "Chainsaw man", 3.2,0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
