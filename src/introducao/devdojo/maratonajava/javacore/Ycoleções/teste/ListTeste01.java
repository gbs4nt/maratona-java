package introducao.devdojo.maratonajava.javacore.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Gabriel Lima");
        nomes.add("cuzinho pai");
        nomes.add("limaozao");

        nomes.addAll(nomes2);
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("--------");
        for(int i = 0;i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }
    }
}
