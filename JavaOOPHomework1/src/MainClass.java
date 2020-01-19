import java.time.LocalDate;

/**
 * Design a class hierarchy that models a shop.
 *
 *        1. Customer – holds name, age and balance
 *        2.  Product – base class for all products, holds name, price, quantity and age restriction (can be None, Teenager or Adult). Implements the Buyable interface.
 *                a) FoodProduct – implements the Expirable interface. Returns 70% of the price if the product expires in 15 days time.
 *                b) ElectonicsProduct – base class for electronics, holds guarantee period
 *                    i) Computer – has a guarantee period of 24 months. Returns 95% of the price if the quantity is over 1000.
 *                    ii) Appliance – has a guarantee period of 6 months. Returns 105% of the price if the quantity is less than 50
 *     Define properties (getters and setters) for each class. Validate the data and print messages.
 *     Define the following interfaces:
 *        1. Buyable – holds double getPrice()
 *        2. Expirable – holds Date getExpirationDate()
 *     Create class PurchaseManager. The class should hold the processPurchase(Product product, Customer customer) static method that handles purchases (takes money from customer, reduces product quantity by 1).The PurchaseManager should print descriptive messages in the following situations:
 *         •    If the product is out of stock (i.e. no quantity)
 *         •    If the product has expired  (optional)
 *         •    If the buyer does not have enough money
 *         •    If the buyer does not have permission to purchase the given product
 *
 * @author Horatiu Handragel
 *
 */
public class MainClass {
    public static void main(String[] args) {


        FoodProduct cigars = new FoodProduct("420 Blaze it fgt",
                6.90,
                1400,
                "Adult", LocalDate.now());
        Customer pecata = new Customer("Pecata", 17, 30.00);

        PurchaseManager.processPurchase(cigars, pecata);

        Customer gopeto = new Customer("Gopeto", 18, 0.44);

        PurchaseManager.processPurchase(cigars, gopeto);

        FoodProduct meat = new FoodProduct("pork meat",
                5.5, 5,
                "Adult",
                LocalDate.of(2020, 1, 13));

        Customer john = new Customer("Johny", 25, 15.00);

        PurchaseManager.processPurchase(meat, john);

    }
}
