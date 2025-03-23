package introducao.devdojo.maratonajava.introducao;



import java.util.Scanner;

public class ExercicioSwitch01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total do produto");
        double valor = scanner.nextDouble();
        for (int parcela=1; parcela<=valor; parcela++){
            double valorParcela=valor/parcela;
                    if(valorParcela<50){
                        break;
            }System.out.println("As parcelas são "+parcela+" e o preço a ser pago é de "+valorParcela);
}
        }


    }

