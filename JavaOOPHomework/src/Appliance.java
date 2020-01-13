import java.time.LocalDate;

public class Appliance extends ElectronicProduct {

    public Appliance(String name, double price, int quantity, String ageRestriction, LocalDate guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
        setGuaranteePeriod(LocalDate.MAX);
    }

    /**
     * Returns 105% of the price if the quantity is less than 50
     * @return
     */
    public double getPrice() {
        if (getQuantity() < 50)
            return super.getPrice() * 1.05;
        return super.getPrice();
    }
}
