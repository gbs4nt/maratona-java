package introducao.devdojo.maratonajava.introducao;
import java.util.Scanner;


public class ExercicioFor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você quer saber a tabuada");
        int n = scanner.nextInt();
        for(int i= 1;i<=10;i++){
            int operation = n*i;
            System.out.println(" "+n+" multiplicado por "+i+" é igual à: "+operation);


        }

    }
}
