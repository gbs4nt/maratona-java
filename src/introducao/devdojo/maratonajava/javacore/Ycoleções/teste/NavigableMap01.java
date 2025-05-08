package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("Z", "Letra Z");
        map.put("C", "Letra C");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        System.out.println(map.headMap("C"));
    }
}
