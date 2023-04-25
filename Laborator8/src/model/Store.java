package model;

public class Store {

    private String storeName;
    private String adress;

    public Store(String storeName, String adress) {
        this.storeName = storeName;
        this.adress = adress;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
