import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Buyer {
    private final String name;
    private final Gender gender;
    private String phoneNumber;
    private Discount discountCard;
    private final Hashtable<Product, Integer> products;

    public Buyer(String name, Gender gender, String phoneNumber, Discount discountCard) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.discountCard = discountCard;
        products = new Hashtable<>();
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Discount getDiscountCard() {
        return discountCard;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDiscountCard(Discount discountCard) {
        this.discountCard = discountCard;
    }

    public Hashtable<Product,Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product, int count) {
        this.products.put(product,count);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
