package introducao.devdojo.maratonajava.javacore.Ycoleções.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.putIfAbsent("vc", "você");
        System.out.println(map);
        for(String key: map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
        System.out.println("-----------");
        for(String values: map.values()){
            System.out.println(values);
        }
        System.out.println("-----------");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" :"+ entry.getValue());
        }
    }
}
