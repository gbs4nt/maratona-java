package introducao.devdojo.maratonajava;

public class ExercicioArrays01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias [0][0] = 31; //Forma de atribuir valor à uma array relacionada ao índice 0
        dias [0] [1] = 28;
        dias [0] [2] = 26;

        dias [1] [0] = 2445;
        dias [1] [1] = 234;
        dias [1] [2] = 45;
        for(int i = 0; i<dias.length;i++){
            for(int j= 0; j<dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------");
        
        for(int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);

            }

        }


    }
}
