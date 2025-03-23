package introducao.devdojo.maratonajava.introducao.exerciciodio;
import java.util.Scanner;

public class ExercicioDio03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro valor");
        int num2= scanner.nextInt();
 int soma = num1+num2;
 int mult = num1*num2;
int c =0;
        if (num1==num2){
            c=soma;

            System.out.println(c);


        }else{
            c=mult;
            System.out.println(c);

        }

    }
}
