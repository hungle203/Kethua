package baitapvenha;

public class Book {
    private String name;
    private double price;
    private double quantity;
    private String dateManufacture;

    public Book() {
    }

    public Book(String name, double price, double quantity, String dateofmanufacture) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.dateManufacture = dateofmanufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getDateManufacture() {
        return dateManufacture;
    }

    public void setDateManufacture(String dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    @Override
    public String toString() {
        return "hưegdf";
    }
}
