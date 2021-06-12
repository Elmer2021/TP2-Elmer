package tp2.app;

import java.time.LocalDate;

public abstract class Titular extends  EpassStandard implements DocumentoID{
    private final DocumentoID docId;
    private String nome;
    private LocalDate ddn;
    private String morada;
    private String Email;
    private int telemovel;

    public Titular(String codigoDoc, TipoDocumento tipoDoc, String nome, LocalDate ddn, int telemovel){
        this.docId=new DocumentoID(String codigoDoc,String tipoDoc);//criando o objeto
        this.nome=nome;
        this.ddn=ddn;
        this.Email=Email;
    }
    public void Titular (DocumentoID docId,String nome,LocalDate ddn,String morada,String Email,int Telemovel){
        this.docId=docId;
        this.nome=nome;
        this.nome=nome;
        this.morada=morada;
        this.Email=Email;
        this.telemovel=telemovel;

    }
    public Titular(DocumentoID docId,String nome,LocalDate ddn,String Email){
        this.docId=docId;
        this.nome=nome;
        this.ddn=ddn;
        this.Email=Email;
    }





    public DocumentoID getDocId() {
        return docId;
    }

    public String getNome() {
        return nome;
    }

    public String getMoarada() {
        return morada;
    }

    public String getEmail() {
        return Email;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void setMoarada(String morada) {
        this.morada = morada;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }


}
