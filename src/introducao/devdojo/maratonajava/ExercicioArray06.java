package introducao.devdojo.maratonajava;

public class ExercicioArray06 {
    public static void main(String[] args) {
    int[] arrayBase = new int[]{10, 20, 30, 40, 50, 60};

    for (int i= arrayBase.length -1; i>=0;i--){ //Percorre a coleção de trás pra frente

        System.out.println(arrayBase[i]);
        }
    }
}
