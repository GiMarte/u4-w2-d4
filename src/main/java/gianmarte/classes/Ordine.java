package gianmarte.classes;

import java.time.LocalDate;
import java.util.List;

public class Ordine {
    protected Long id;
    protected String status;
    protected LocalDate orderDate;
    protected LocalDate devileryDate;
    protected List<Prodotto> prodotti;
    protected Utente utente;

    public Ordine(Long id, String status, LocalDate orderDate, LocalDate devileryDate, List<Prodotto> prodotti, Utente utente) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.devileryDate = devileryDate;
        this.prodotti = prodotti;
        this.utente = utente;
    }

    public Utente getUtente() {
        return utente;
    }

    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public LocalDate getDevileryDate() {
        return devileryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }

    @Override public String toString() {
    return "Ordine{" +
            "id=" + id +
            ", orderDate=" + orderDate +
            '}';
}}
