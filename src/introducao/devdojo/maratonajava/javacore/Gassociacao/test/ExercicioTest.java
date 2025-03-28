package introducao.devdojo.maratonajava.javacore.Gassociacao.test;

import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import introducao.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Mr.pickles");
        Aluno aluno2= new Aluno("Fudencio", 8);
        Aluno aluno3 = new Aluno("Cartman", 12);
        Aluno aluno4 = new Aluno("Orel", 10);
        Aluno aluno5 = new Aluno("Rick", 90);

        Local local1 = new Local("Beco dos bem feitores de moral orel");
        Local local2 = new Local("California boa para os desabrigados");


        Seminario seminario1 = new Seminario( "Como ver moral orel sem parar a cada 3 segundos mt gíria slk",local1);
        Seminario seminario2 = new Seminario( "Pandas e suas especialidades de combate",local2);

        Seminario[] seminarios={seminario1,seminario2};
        Professor professor = new Professor("Mr.Garrison", "Fantoches");
        professor.getSeminarios();
        professor.setSeminarios(seminarios);
        Aluno[] alunos ={aluno1, aluno2, aluno3, aluno4, aluno5};
        seminario1.getAlunos();
        seminario1.setAlunos(alunos);



        professor.imprime();
    }
}
