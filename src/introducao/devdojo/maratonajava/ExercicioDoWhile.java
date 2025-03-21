package introducao.devdojo.maratonajava;

import java.util.Scanner;
import java.util.Random;

public class ExercicioDoWhile {


    public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Integer adivinha = random.nextInt(11);
        System.out.println("Eu pensei num número de 0 a 10");
        int contador= 0;
        String valor= "30";
        int numero;

        do{
            System.out.println("Tente dar um palpite de qual foi o número!");
            numero = scanner.nextInt();
            if(numero!=adivinha){
                System.out.println("O número digitado foi diferente do pensado.");
                System.out.println("Tente novamente!");
                contador++;


            }else if(numero<adivinha){
                System.out.println("O número "+numero+" é menor do que número pensado. ");

                contador++;
            }else if(numero>adivinha) {
                System.out.println("O número "+numero+" é maior do que número pensado. ");

                contador++;

            }
        }while (numero!=adivinha);
        System.out.println("O número de tentativas para acertar o número foi "+(contador+1));


        }
    }
















