package tp2.app;

import java.time.LocalDate;

public abstract class EpassFuncionario extends EpassStandard implements TituloTransporte{
    public EpassFuncionario(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome) {
        super(codigoDoc, tipoDoc, ddn, nome);
    }
}
