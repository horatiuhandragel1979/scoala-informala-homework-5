import java.time.LocalDate;

/**
 * base class for electronics, holds guarantee period
 */
public class Computer extends ElectronicProduct {

    public Computer(String name, double price, int quantity, String ageRestriction, LocalDate guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
        setGuaranteePeriod(LocalDate.MAX); //setarea garantiei de 24 luni
    }

    /**
     *  Returns 95% of the price if the quantity is over 1000
     * @return
     */
    public double getPrice() {
        if (getQuantity() > 1000)
            return super.getPrice() * 0.95;
        return super.getPrice();
    }
}
