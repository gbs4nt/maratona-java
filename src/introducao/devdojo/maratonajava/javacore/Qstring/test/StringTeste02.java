package introducao.devdojo.maratonajava.javacore.Qstring.test;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome ="Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(nome.substring(0,3));
        System.out.println(nome.trim());
    }
}
