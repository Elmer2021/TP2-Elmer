package tp2.app;

public abstract class EpassSazonal extends Epass{
    private String ChaveValida;

public EpassSazonal(){

}
    public int getChaveValida() {
        return ChaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.ChaveValida = chaveValida;
    }
}
