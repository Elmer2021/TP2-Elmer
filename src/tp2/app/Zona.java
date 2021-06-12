package tp2.app;

import java.util.ArrayList;

public class Zona {

   private int id;
   private  String nome ;

   public  Zona (String nome){
       this.nome=nome;

   }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }
}
