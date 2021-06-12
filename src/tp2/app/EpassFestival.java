package tp2.app;

public abstract class EpassFestival  extends EpassSazonal implements TituloTransporte{
    private double saldoCartaogmt;
    public String nomeEvento;

    public double getSaldoCartaogmt() {
        return saldoCartaogmt;
    }

    public void setSaldoCartaogmt(double saldoCartaogmt) {
        this.saldoCartaogmt = saldoCartaogmt;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }


public EpassFestival(double saldo,String nome){
    this.saldoCartaogmt=saldo;
    this.nomeEvento=nome;
}
public EpassFestival(String evento){
    this.nomeEvento=evento;
}
public EpassFestival(EpassFestival outro){

}
    public
    boolean carregar(int valor) {
        return bilhete;
    }

    @Override
    public
    boolean viagem() {

        Date dataAtual = new Date();
        if (dataAtual.after(dataInicial) && dataAtual.before(dataFinal) && super.viagem()) {
            return true;

        } else {
            return false;
        }
    }

    public boolean carregarSaldoFestival(int valor) {
        if (valor > 0) {
            this.saldoFestival += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarSaldoFestival(int valor) {
        if (valor > 0) {
            this.saldoFestival -= valor;
            return true;
        } else {
            return false;
        }
    }

    public Fest(Date dataInicial, Date dataFinal, boolean bilhete) {
        super();
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.bilhete = bilhete;
    }

}
