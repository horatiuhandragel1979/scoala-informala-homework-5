import java.time.LocalDate;

/**
 * base class for electronics, holds guarantee period
 */
public class ElectronicProduct extends Product {
    private LocalDate guaranteePeriod;

    public ElectronicProduct(String name, double price, int quantity, String ageRestriction, LocalDate guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
        this.guaranteePeriod = guaranteePeriod;
    }

    public LocalDate getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(LocalDate guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
