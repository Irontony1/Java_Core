import java.util.Hashtable;

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
        this.products = new Hashtable<>();
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
        return this.products;
    }

    public void addProduct(Product product, int count) {
        products.put(product,count);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Buyer:" + "\n" +
                "name - " + name + "\n" +
                "gender - " + gender + "\n" +
                "phoneNumber - " + phoneNumber + "\n" +
                "discountCard - " + discountCard + "\n";
    }
}
