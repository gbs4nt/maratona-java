package introducao.devdojo.maratonajava.javacore.test;

public class RuntimeExcepctionTest02 {
    public static void main(String[] args) {
divisao(1, 0);
    }
    public static int divisao(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }

        return a/b;

    }
}
