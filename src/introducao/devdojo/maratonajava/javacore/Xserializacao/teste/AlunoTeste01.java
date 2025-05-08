package introducao.devdojo.maratonajava.javacore.Xserializacao.teste;

import introducao.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import introducao.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AlunoTeste01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "Gabriel lima", "123123");
        Turma turma = new Turma("Turma java virado no caraio");
        aluno1.setTurma(turma);
        serializar(aluno1);
        deserializar();
    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno)ois.readObject();
            System.out.println(aluno);
        }catch(IOException | ClassNotFoundException e){

            e.printStackTrace();
        }



    }
}

