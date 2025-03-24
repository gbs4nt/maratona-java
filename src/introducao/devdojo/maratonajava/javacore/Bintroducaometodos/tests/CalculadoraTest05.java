package introducao.devdojo.maratonajava.javacore.Bintroducaometodos.tests;

import introducao.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,3,4,7,8,9,6,4,7,8);
    }
}
