package introducao.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        // \d = Todos os dígitos
        // \D = Tudo o que não é dígito
        // \s = Todos os espaõs em branco(ele também conta  \t \n \f \r
        //S = Todos os caracteres excluindo os brancos
        // \w todas as letras de a-z e A-Z, digitos e "_"
        // \W Tudo que não é inluso no \w


        String regex = "ab";
        String text = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto:   "+text);
        System.out.println("Índice:  0123456789");

        System.out.println("regex: "+regex);

        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println(matcher.start()+" ");
        }


    }
}
