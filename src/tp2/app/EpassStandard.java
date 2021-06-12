package tp2.app;

import javax.print.Doc;
import java.time.LocalDate;

import static javax.swing.text.html.parser.DTDConstants.ID;

public abstract class EpassStandard extends Epass {
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chave;


    public EpassStandard(String CodigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome,String Email){
        super();
        this.titular=new Titular(CodigoDoc,tipoDoc,nome,ddn,Email);

    }
    public EpassStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome){
        super();
        this.titular=new Titular(CodigoDoc,tipoDoc,nome,ddn,Email);

    }

    boolean viagem() {

        if(pontos>=100) {
            pontos-=40;
            return true;
        }
        else if (this.numeroViagens()) {
            numeroViagens+=1;
            if(numeroViagens>=10) {
                numeroViagens=0;
                pontos+=1;
            }
            return true;

        }
        else {
        return false;

    }

    }


}
