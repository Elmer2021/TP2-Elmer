package tp2.app;

public abstract class EpassTurista extends EpassSazonal implements TituloTransporte {
    private int Duracao;
    public EpassTurista(Duracao duracao){

    }

    public int getDuracao() {
        return Duracao;
    }
}
