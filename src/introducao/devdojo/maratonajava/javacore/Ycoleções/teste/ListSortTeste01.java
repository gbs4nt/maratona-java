package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Tokyo ghoul");
        mangas.add("Guntz");
        mangas.add("Kami no kodomo");
        mangas.add("Fire punch");
        mangas.add("Hentaizao pai no cu");
        mangas.add("Chainsaw man");
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(23D);
        dinheiros.add(21D);
        dinheiros.add(1D);
        dinheiros.add(110.34);
        Collections.sort(dinheiros);

        System.out.println(dinheiros);

        for(String manga: mangas){
            System.out.println(manga);
        }
    }
}
