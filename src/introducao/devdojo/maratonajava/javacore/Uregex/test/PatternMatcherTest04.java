package introducao.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {

        // \d = Todos os dígitos
        // \D = Tudo o que não é dígito
        // \s = Todos os espaõs em branco(ele também conta  \t \n \f \r
        //S = Todos os caracteres excluindo os brancos
        // \w todas as letras de a-z e A-Z, digitos e "_"
        // \W Tudo que não é inluso no \w
        // [] Representa o Range
        // ? Zero ou uma ocorrência
        // * Zero ou mais
        //+ uma ou mais ocorrencias
        //{n,m} de n ate m
        //() agrupamento
        // | ou \ o(v|c)o ovo ou oco
        //$ representa o fim da linha
        // . 1.3 = 123, 133, 1@1, 1A3


//        String regex = "[a-z,A-D]";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
        System.out.println("!@#zoro@mail.com".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println(text.split(",")[1].trim());

        System.out.println("Texto:   "+text);
        System.out.println("Índice:  0123456789");

        System.out.println("regex: "+regex);

        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }


    }
}
