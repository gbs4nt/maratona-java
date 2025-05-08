package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangaByIdComparator mangaByIdComparator = new mangaByIdComparator();
        mangas.add(new Manga(5L,"Tokyo ghoul", 19.99));
        mangas.add(new Manga(30L,"Guntz", 29.00));
        mangas.add(new Manga(3L,"Dragon Ball Super", 2.99));
        mangas.add(new Manga(2034L, "Kami no kodomo", 13.99));
        mangas.add(new Manga(2000L, "Fire punch", 23.99));
        mangas.add(new Manga(300L,"Hentaizao pau no cu", 20.00));
        mangas.add(new Manga(100L, "Chainsaw man", 20.99));
//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for(Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(3L,"Dragon Ball Super", 2.99);

        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator));


    }

}
