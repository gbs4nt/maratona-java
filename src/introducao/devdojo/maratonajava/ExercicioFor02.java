package introducao.devdojo.maratonajava;
import java.util.Scanner;
import java.util.Random;


public class ExercicioFor02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(51);
        int number;
        for(int i=1; i<6;i++){
            System.out.println("Tente acertar o número que o computador pensou");
            number = scanner.nextInt();

            if(number==randomNumber){
                System.out.println("Parabéns!");

                break;

            } else if(number<randomNumber){
                System.out.println("Um pouco mais alto que isso!");

            }else{
                System.out.println("Um pouco mais baixo que isso");
            }
            if (i==5){
                System.out.println("Acabram suas chances!");

            }
        }


    }

}
