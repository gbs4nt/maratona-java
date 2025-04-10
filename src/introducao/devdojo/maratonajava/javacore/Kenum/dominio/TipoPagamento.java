package introducao.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{

        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CRETIDO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

    public abstract double calcularDesconto(double valor);
    }