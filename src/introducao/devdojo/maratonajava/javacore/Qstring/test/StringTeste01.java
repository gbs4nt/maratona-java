package introducao.devdojo.maratonajava.javacore.Qstring.test;



public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String nome2 = "Gabriel";
        nome = nome.concat("Lima");
        System.out.println(nome == nome2); // == pode ser usado com strings para conferir se a referência é para o mesmo objeto em memória
        //Que nesse caso é o Gabriel que está no pool de Strings

        String nome3 = new String("Gabriel");

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());


           }




}
