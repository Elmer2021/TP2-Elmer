package tp2.app;

import java.time.LocalDate;

public abstract class EpassJovem extends EpassStandard implements TituloTransporte {
    public EpassJovem(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome) {
        super(codigoDoc, tipoDoc, ddn, nome);
    }
}
