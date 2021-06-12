package tp2.app;

import java.util.ArrayList;

public abstract class EpassStudent extends Epass implements TituloTransporte {
    private int ano;
    private String escola;
    private ArrayList <Zona> zonas=new ArrayList<>();

    public EpassStudent(int ano,String escola){
        super();
        this.ano=ano;
        this.escola=escola;

    }
    public EpassStudent(EpassStudent outro){
        super();
        this.ano=ano;
        this.escola=escola;

    }

    public int getAno() {
        return ano;
    }

    public String getEscola() {
        return escola;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void addZona(String nome)  {
        Zona novo =new Zona(nome);
        this.zonas.add(novo);


    }
    public void addzona(Zona ZonaViagem){
        this.zonas.add(ZonaViagem);

    }



}