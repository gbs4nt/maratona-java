package introducao.devdojo.maratonajava;

public class ExercicioArrays03 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,45,6,2,3};
        int maior = array[0]; //Seleciona o primeiro índice
        int menor = array[0]; // ''
        for (int i=1;i<array.length;i++){  // o i começa seu contador em i pois o índice 0 ja está selecionado nas variáveis acima.
            if(array[i]>maior){
                maior = array[i]; /* o comando vai percorrer a variável e comparar SE o número que está sendo percorrido é maior do que o anterior
                fazendo com que o maior número fique dentro da variável "maior"*/

            }else if(array[i]<menor){
                menor = array[i]; //o mesmo comparativo ocorre aqui, porém o efeito é contrário, aqui comparamos para saber se é menor.

            }

        }
        System.out.println("O menor valor é "+menor+" e o maior valor é "+maior);

    }
}
