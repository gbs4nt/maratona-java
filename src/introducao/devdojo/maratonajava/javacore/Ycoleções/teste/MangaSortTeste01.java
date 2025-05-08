package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class mangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2){

        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Tokyo ghoul", 19.99));
        mangas.add(new Manga(30L,"Guntz", 29.00));
        mangas.add(new Manga(2034L, "Kami no kodomo", 13.99));
        mangas.add(new Manga(2000L, "Fire punch", 23.99));
        mangas.add(new Manga(300L,"Hentaizao pau no cu", 20.00));
        mangas.add(new Manga(100L, "Chainsaw man", 20.99));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas);

        System.out.println("-------------------");
        for(Manga manga: mangas){
            System.out.println(manga);
        }
//        Collections.sort(mangas, new mangaByIdComparator());
        mangas.sort(new mangaByIdComparator());
        System.out.println("-------------------");
        for(Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
