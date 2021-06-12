package tp2.app;

public interface TituloTransporte {
    public  abstract void carregar  ( );
    public  abstract void pagarViagem  ();
    public  abstract boolean checkValidade  ();
    public  abstract boolean passarSaldo (double PasseStandard);
}

