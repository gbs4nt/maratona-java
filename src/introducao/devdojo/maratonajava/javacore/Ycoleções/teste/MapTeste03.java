package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Consumidor;
import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel Lima");
        Consumidor consumidor2 = new Consumidor("Felipe Lima");
        Consumidor consumidor3 = new Consumidor("Ana Yasmin ");

       Manga manga1 = new Manga(5L,"Tokyo ghoul", 19.99);
       Manga manga2 = new Manga(30L,"Guntz", 29.00);
       Manga manga3 = new Manga(3L,"Dragon Ball Super", 2.99);
       Manga manga4 = new Manga(2034L, "Kami no kodomo", 13.99);
       Manga manga5 = new Manga(2000L, "Fire punch", 23.99);
       Manga manga6 = new Manga(300L,"Hentaizao pau no cu", 20.00);
       Manga manga7 = new Manga(100L, "Chainsaw man", 20.99);

       List<Manga> mangaConsumidor1List = List.of(manga1,manga2,manga3);
       List<Manga> mangaConsumidor2List = List.of(manga4,manga5,manga6);
       List<Manga> mangaConsumidor3List = List.of(manga7,manga5);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
            consumidorManga.put(consumidor1, mangaConsumidor1List);
            consumidorManga.put(consumidor2, mangaConsumidor2List);
            consumidorManga.put(consumidor3, mangaConsumidor3List);
            for(Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
                System.out.println(entry.getKey().getNome());
                System.out.println("------>");
              for(Manga manga : entry.getValue()){
                  System.out.println(manga.getNome());

              }
            }


    }
}
