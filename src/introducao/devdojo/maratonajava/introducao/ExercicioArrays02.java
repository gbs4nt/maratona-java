package introducao.devdojo.maratonajava.introducao;

public class ExercicioArrays02 {
    public static void main(String[] args) {
        int[] array= new int[]{10, 20, 30, 40, 50};
        int resultado = array[0]; // Para que comece a percorrer a coleção do primeiro item.
        for (int i=0; i<array.length;i++){
            resultado +=array[i]; // faz a operação somando o número que está sendo percorrido pelo seguinte.
            System.out.println(resultado);

        }

    }
}
