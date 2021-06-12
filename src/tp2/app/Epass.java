package tp2.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Epass {
    private int Codigo;
    private double saldo;
    private double precoViagem;
    private LocalDateTime emissao;
    private LocalDate carregamento;
    private LocalDate validade;
    private static long ultCodigo;



public void static (int codigo){
        if(long.value0f(ultCodigo)==null){
        }
// contrutor nao tem parametro
public void Epass(int codigo,LocalDateTime emissao){
        this.codigo=ultCodigo+1;
        this.emissao=LocalDateTime.now();//vai retorna um valor em formato de data
            ultCodigo++;
        }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public LocalDateTime getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDateTime emissao) {
        this.emissao = emissao;
    }

    public LocalDate getCarregamento() {
        return carregamento;
    }

    public void setCarregamento(LocalDate carregamento) {
        this.carregamento = carregamento;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public static long getUltCodigo() {
        return ultCodigo;
    }

    public static void setUltCodigo(long ultCodigo) {
        Epass.ultCodigo = ultCodigo;
    }
        boolean carregar(int valor) {
            if(valor>0) {

                this.saldo +=valor;
                return true;
            }
            else {
                return false;
            }
        }

        boolean viagem( int valor) {
            //povavelmente o preco nao e fixo
            int valor=40;
            if(this.saldo>valor){
                this.saldo-=valor;
                return true;
            }

            else {
                return false;
            }}

        boolean transferirSaldo(int valor, Passe outroPasse) {

            if(this.saldo>valor && outroPasse.carregar(valor)){
                ///caso o carregar nao funcione  (o metodo carregar retorne falso) a tranferencia nao ocorre
                this.saldo-=valor;

                return true;
            }
            else {

                return false;
            }
        }
        public String gerarChave() {
            private void gerarChave() {

                String[] nome = titular.getNome().split(" ");
                String LetrasNome1;
                String LetrasNome2;

                //----pegar as 5 letras do primeiro nome----------------------------------------------------------

                if (nome[0].length() >= 5) {//se nome tem mais du que 4 caracteres
                    LetrasNome1 = nome[0].substring(0, 4); // pega só os 5 caracteres
                } else {// se tiver menos de 5 caracteres  pega tudo;
                    LetrasNome1 = nome[0];
                }
                //-------------------------------------------------------------------------------------------------

                //----pegar as 5 letras do ultimo nome-------------------------------------------------------------
                if (nome[1].length() >= 5) {//se nome tem mais do que 4 caracteres
                    LetrasNome2 = nome[1].substring(0, 4); // pega só os 5 caracteres
                } else {// se tiver menos de 5 caracteres  pega tudo;
                    LetrasNome2 = nome[1];
                }
                //-------------------------------------------------------------------------------------------------

                //-----transformar o primeiro e ultimo nome em maiusculas invertido---------------------------------------
                LetrasNome1 = LetrasNome1.toUpperCase();
                LetrasNome2 = LetrasNome2.toUpperCase();

                StringBuilder inverterAUX = new StringBuilder();
                inverterAUX.append(LetrasNome2);
                inverterAUX.append(LetrasNome1);
                inverterAUX.reverse();
                //-------------------------------------------------------------------------------------------------

                //obter data nascimento---------------------------------------------------------
                String data = titular.getDdn().format(DateTimeFormatter.ofPattern("yyy-MM-dd"));

                //obter codigo do PASSS-------
                long codigo = this.getCodigo();

                //---------------------chaveValidacao----------------------------------------
                StringBuilder aux = new StringBuilder();
                aux.append(inverterAUX);
                aux.append(data);
                aux.append(codigo);
                //-----------------------------------------------------------------------------
                this.chaveValida = aux.toString();



                return null;
        }
    }
}