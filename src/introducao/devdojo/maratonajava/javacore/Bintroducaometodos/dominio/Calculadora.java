package introducao.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumumeros(){
        System.out.println(10+10);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);

    }
    public double dividirDoisNumeros(double n1, double n2){
        return n1/n2;
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do tipo primitivo");
        System.out.println("Num 1:" +num1);
        System.out.println("Num 2: "+num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num:numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for(int num:numeros){
            soma+=num;
        }
        System.out.println(soma);

    }
}
