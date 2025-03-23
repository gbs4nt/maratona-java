package introducao.devdojo.maratonajava.introducao.exerciciodio;

import java.util.Scanner;



public class ExercicioDio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        double alturaMetro = altura/100;
        double formulaImc = peso/(Math.pow(alturaMetro, 2));

        System.out.println(formulaImc);
        if( formulaImc<18.5){
            System.out.println("Abaixo do peso");
        }else if(formulaImc>= 18.6 && formulaImc<=24.9){
            System.out.println("Peso ideal");

        }else if(formulaImc>=30.0 && formulaImc<=34.9){
            System.out.println("Obesidade grau 1");
        }else{
            System.out.println("Obesidade grau 2");
        }
    }

}
//            Entre 18,6 e 24,9 | Peso ideal (parabéns)
//
//            Entre 25,0 e 29,9 | Levemente acima do peso
//
//            Entre 30,0 e 34,9 | Obesidade grau I
//
//            Entre 35,0 e 39,9 | Obesidade grau II (severa)
//
//                    Maior ou igual a 40 | Obesidade grau III (mórbida)
