package introducao.devdojo.maratonajava.javacore.teste;

import introducao.devdojo.maratonajava.javacore.Ycoleções.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1A", "Iphone");
        Smartphone s2 = new Smartphone("1A", "Iphone");
        System.out.println(s1.equals(s2));
    }
}
