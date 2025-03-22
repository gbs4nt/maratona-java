package introducao.devdojo.maratonajava;
import java.util.Scanner;

public class ExercicioArrays05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arraySim = new int[]{60, 50, 40, 30, 20, 10};

        System.out.println("Digite um número. Diremos se ele está dentro da coleção.");

        int busca = scanner.nextInt();

        boolean encontrado = false;



        for(int i=0;i<arraySim.length;i++){
            if(arraySim[i]==busca) {
                System.out.println("Sim, o número " + busca + " consta no sistema.");

                encontrado = true;
                break;
            }

            else{
                System.out.println("Infelizmente não encontramos este número, tente novamente.");
                break;
          }
        }


    }
}
