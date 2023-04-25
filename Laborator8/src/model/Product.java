package model;

public class Product implements Comparable<Product>{

    private double price;

    private String denumireProdus;

    private String barcode;

    public Product(double price, String denumireProdus, String barcode) {
        this.price = price;
        this.denumireProdus = denumireProdus;
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public void setDenumireProdus(String denumireProdus) {
        this.denumireProdus = denumireProdus;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", denumireProdus='" + denumireProdus + '\'' +
                ", barcode='" + barcode + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product prod) {
        return this.price > prod.getPrice() ? 1 : -1;
    }
}
