package tp2.app;

import java.time.LocalDate;

public abstract class  EpassTerceiraIdade extends EpassStandard  implements TituloTransporte{
    private LocalDate horaini;

    public EpassTerceiraIdade(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome) {
        super(codigoDoc, tipoDoc, ddn, nome);
    }

    public LocalDate getHoraini() {
        return horaini;
    }

    public void setHoraini(LocalDate horaini) {
        this.horaini = horaini;
    }
}
