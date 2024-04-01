import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Product apple = new Product("Apple", 5.5);
        Product milk = new Product("Milk", 57.3);
        Product banana = new Product("Banana", 7.2);
        Product bread = new Product("Bread", 18.);
        Product meat = new Product("Meat", 277.9);

        Buyer buyer1 = new Buyer("Alex",Gender.MALE,"8957851256",Discount.SILVER_CARD);
        Buyer buyer2 = new Buyer("Mary",Gender.FEMALE,"895584123",Discount.NONE);
        Buyer buyer3 = new Buyer("Max",Gender.MALE,"8977498565",Discount.GOLDEN_CARD);

        buyer1.addProduct(apple,5);
        buyer1.addProduct(milk,1);
        buyer1.addProduct(banana,6);
        buyer1.addProduct(bread,2);
        buyer1.addProduct(meat,1);
        System.out.println(buyer1.getProducts());

        buyer2.addProduct(bread,2);
        buyer2.addProduct(meat,3);
        System.out.println(buyer2.getProducts());

        Order order1 = new Order(buyer1);
        System.out.println("Order " + order1.getId() + " on price = " + order1.calculatePayCheque());
        Order order2 = new Order(buyer2);
        System.out.println("Order " + order2.getId() + " on price = " + order2.calculatePayCheque());
    }

}
