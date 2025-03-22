package introducao.devdojo.maratonajava;

public class ExercicioArray07 {
    public static void main(String[] args) {
        double[] pedra = new double[]{3.14, 2.71, 9.81, 1.41, 0.577};

        double tesoura = 0;
        for(int i=0;i<pedra.length;i++) {
            tesoura += pedra[i];
        }



            double papel = tesoura/pedra.length;
            System.out.println(papel);

        }

    }

