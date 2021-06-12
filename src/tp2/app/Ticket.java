package tp2.app;

import java.time.LocalDate;

public class Ticket {
    private String nome;
    private int numero;
    private LocalDate Date;

    public Ticket(String nome, int numero, LocalDate Date) {
        this.nome = nome;
        this.numero = numero;
        this.Date = Date;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }
}
