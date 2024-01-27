public class Product {

    private String barcode;
    private String name;
    private int price;

    public Product(String barcode, String name, int price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    public Product(String barcode, int price) {
        this(barcode, "No name", price);
    }

    public Product(String barcode, String name) {
        this(barcode, name, 0);
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
