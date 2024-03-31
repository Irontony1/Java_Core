import java.util.Hashtable;
import java.util.Map;

public class Order {
    private final Buyer buyer;
    private final int id;
    private static int totalId = 0;

    private double priceProductList;

    public Order(Buyer buyer) {
        this.buyer = buyer;
        totalId++;
        this.id = totalId;
    }

    public Buyer getBuyer() {
        return buyer;
    }
    public int getId() {
        return id;
    }

    public double calculatePrice() {

        Hashtable<Product, Integer> productList = buyer.getProducts();

        for (Map.Entry<Product, Integer> product : productList.entrySet()) {
            double priceProduct = product.getKey().getPrice();
            int quantity = product.getValue();

            priceProductList = priceProductList + (priceProduct * quantity);
        }
        return priceProductList;
    }

    private double calculatePayCheque() {
        double personalPayCheque;
        if (buyer.getDiscountCard().getValue() != 0)
            personalPayCheque = priceProductList - (priceProductList * buyer.getDiscountCard().getValue());
        else personalPayCheque = priceProductList;

        if (buyer.getGender() == Gender.MALE && Calendar.getTime().equals(Holydays.MALE_DAY.getValue()))
            return personalPayCheque - (personalPayCheque * 0.05);

        if (buyer.getGender() == Gender.FEMALE && Calendar.getTime().equals(Holydays.FEMALE_DAY.getValue()))
            return personalPayCheque - (personalPayCheque * 0.05);

        if (Calendar.getTime().equals(Holydays.COMMON_DAY.getValue()))
            return personalPayCheque - (personalPayCheque * 0.03);

        return personalPayCheque;
    }


}
