package gianmarte.classes;

public class Utente {
    protected Long id;
    protected String name;
    protected Integer tier;

    public Utente(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }
}
