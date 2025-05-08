package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Consumidor;
import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel Lima");
        Consumidor consumidor2 = new Consumidor("Felipe Lima");

       Manga manga1 = new Manga(5L,"Tokyo ghoul", 19.99);
       Manga manga2 = new Manga(30L,"Guntz", 29.00);
       Manga manga3 = new Manga(3L,"Dragon Ball Super", 2.99);
       Manga manga4 = new Manga(2034L, "Kami no kodomo", 13.99);
       Manga manga5 = new Manga(2000L, "Fire punch", 23.99);
       Manga manga6 = new Manga(300L,"Hentaizao pau no cu", 20.00);
       Manga manga7 = new Manga(100L, "Chainsaw man", 20.99);

        Map<Consumidor,  Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+" - "+entry.getValue().getNome());
        }
    }
}
