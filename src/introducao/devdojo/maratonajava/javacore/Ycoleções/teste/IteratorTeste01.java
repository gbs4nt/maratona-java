package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Tokyo ghoul", 19.99,0));
        mangas.add(new Manga(30L,"Guntz", 29.00,5));
        mangas.add(new Manga(2034L, "Kami no kodomo", 13.99,4));
        mangas.add(new Manga(2000L, "Fire punch", 23.99,0));
        mangas.add(new Manga(300L,"Hentaizao pau no cu", 20.00,2));
        mangas.add(new Manga(100L, "Chainsaw man", 20.99,0));

        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade()==0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println("mangas: "+mangas);
    }
}
