package introducao.devdojo.maratonajava.javacore.Kenum.test;

import introducao.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import introducao.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Sara", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente ("Fudencio", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
