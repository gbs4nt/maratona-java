package introducao.devdojo.maratonajava.introducao.exerciciodio;
import java.util.Scanner;

public class ExercicioDio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número.");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("O número digitado é par");
        }else {
            System.out.println("O número digitado é impar");

        } if(num>0){
            System.out.println("O número digitado é positivo");

        }else{
            System.out.println("O número digitado é negativo");
        }
    }
}
