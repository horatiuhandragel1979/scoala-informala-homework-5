import java.time.LocalDate;

/**
 * The class should hold the processPurchase(Product product, Customer customer) static method that handles purchases
 * (takes money from customer, reduces product quantity by 1).
 * The PurchaseManager should print descriptive messages in the following situations:
 *         •    If the product is out of stock (i.e. no quantity)
 *         •    If the product has expired  (optional)
 *         •    If the buyer does not have enough money
 *         •    If the buyer does not have permission to purchase the given product
 */
public class PurchaseManager {

    public static LocalDate processPurchase(Product product, Customer customer) {

        if (customer.getBalance() - product.getPrice() < 0) {
            System.out.println("Customer do not have enough money");
        } else if (product.getQuantity() == 0) {
            System.out.println("Tho product is out of stock!");
        } else if (customer.getAge() <= 18) {
            System.out.println("You are too young to buy this product!");
        } else if (product.getExpirationDate().equals(LocalDate.of(2020, 1, 12))) {
            System.out.println("Produsul a expirat ");
        }
        customer.setBalance(customer.getBalance() - product.getPrice());
        product.setQuantity(product.getQuantity() - 1);
        customer.setAge(customer.getAge());
        product.setExpirationDate(LocalDate.now());
        return null;
    }

  //  LocalDate cal = LocalDate.of(2020, 1, 20);
}
