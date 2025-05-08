package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;
import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class SmartphonMarcaComparator implements Comparator<Smartphone> {


    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaPrecoComparator implements Comparator<Manga>{


    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphonMarcaComparator());
        Smartphone nokia = new Smartphone("123", "Nokia");
        set.add(nokia);
        System.out.println(set);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Tokyo ghoul", 19.99,0));
        mangas.add(new Manga(30L,"Guntz", 29.00,5));
        mangas.add(new Manga(2034L, "Kami no kodomo", 8,4));
        mangas.add(new Manga(2000L, "Fire punch", 23.99,0));
        mangas.add(new Manga(300L,"Hentaizao pau no cu", 2,2));
        mangas.add(new Manga(100L, "Chainsaw man", 3.2,0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        Manga yuyu = new Manga(21L, "YuYu hakusho", 8, 5);

        System.out.println("----------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

    }

}
