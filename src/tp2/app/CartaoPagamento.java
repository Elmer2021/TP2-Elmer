package tp2.app;

public interface CartaoPagamento {
    public  abstract void pagar  (double valor);
    public  abstract void creditar (double valor);

    }

