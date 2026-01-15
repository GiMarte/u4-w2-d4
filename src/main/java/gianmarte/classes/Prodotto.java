package Classes;

public class Prodotto {
    protected long id;
    protected String name;
    protected String category;
    protected Double price;

    public Prodotto(Double price, String category, String name, long id) {
        this.price = price;
        this.category = category;
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    @Override public String toString() {
    return "Prodotto{" +
            "name='" + name + '\'' +
            ", category='" + category + '\'' +
            ", price=" + price +
            "$}";
}}
