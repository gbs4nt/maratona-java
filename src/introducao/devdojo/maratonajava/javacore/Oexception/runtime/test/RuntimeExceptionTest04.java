package introducao.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");

        }catch(IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
        try{
            talvezLanceExepction();
        }catch(SQLException | FileNotFoundException e){

            e.printStackTrace();
        }
    }

    private static void talvezLanceExepction() throws SQLException, FileNotFoundException {

    }
}
