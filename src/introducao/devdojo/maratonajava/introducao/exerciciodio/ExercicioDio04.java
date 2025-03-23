package introducao.devdojo.maratonajava.introducao.exerciciodio;
import java.util.Scanner;

public class ExercicioDio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 129320;
        System.out.println("Qual o salário do usuário?");
        double salarioUsuario = scanner.nextDouble();

        double calculo = salarioMinimo/salarioUsuario;
        System.out.println("Esse usuário ganha "+calculo+" salário(s) mínimo(s) ");
    }
}
