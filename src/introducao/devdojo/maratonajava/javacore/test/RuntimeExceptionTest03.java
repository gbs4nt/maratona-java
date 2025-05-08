package introducao.devdojo.maratonajava.javacore.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();

    }
    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }
}
