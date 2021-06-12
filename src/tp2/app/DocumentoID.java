package tp2.app;

public class DocumentoID implements SeriaLizable{

    private String codigoID;
     TipoDocumento tipo;



    public DocumentoID (String codigo,TipoDocumento tipo){
        this.codigoID=codigo;
        this.tipo=tipo;
    }
}
