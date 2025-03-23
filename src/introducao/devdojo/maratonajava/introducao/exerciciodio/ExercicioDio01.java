package introducao.devdojo.maratonajava.introducao.exerciciodio;
import java.util.Scanner;

public class ExercicioDio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int a= scanner.nextInt();
        System.out.println("Segundo valor");
        int b = scanner.nextInt();
        System.out.println("Terceiro valor");
        int c =scanner.nextInt();
        int soma = a+b;
if(soma>c){
            System.out.println("A soma dos dois primeiros valores é maior que o terceiro valor");
        }else{
    System.out.println("O terceiro valor é maior que a soma dos dois primeiros números");
        }

    }
}
