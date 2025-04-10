package introducao.devdojo.maratonajava.javacore.Kenum.test;

import introducao.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import introducao.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import introducao.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Sara", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente ("Fudencio", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
