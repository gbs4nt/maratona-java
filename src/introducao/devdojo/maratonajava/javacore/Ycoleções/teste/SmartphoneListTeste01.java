package introducao.devdojo.maratonajava.javacore.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22NS", "Samsung");
        Smartphone s3 = new Smartphone("8R8M", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for(Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("8R8M", "Xiaomi");
        System.out.println(smartphones.contains(s4));
        int i = smartphones.indexOf(s4);
        System.out.println(i);
    }
}
