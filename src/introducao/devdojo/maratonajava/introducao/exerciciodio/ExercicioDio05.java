package introducao.devdojo.maratonajava.introducao.exerciciodio;

import java.util.Scanner;


public class ExercicioDio05 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o nome do aluno");
                String nome = scanner.nextLine();
                double[] notas = new double[]{3.3, 9.5, 9.0};

                double soma = notas[0];


                for (int i = 0; i < notas.length; i++) {
                    soma += notas[i];
                    double media = soma / notas.length;
                    System.out.println(media);


                }
            }




    }


