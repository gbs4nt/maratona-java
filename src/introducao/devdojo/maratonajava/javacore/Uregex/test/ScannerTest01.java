package introducao.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa";
       String[] nomes= text.split(",");

       for (String nome:nomes){
           System.out.println(nome.trim());
       }
    }
}
