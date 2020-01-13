import java.time.LocalDate;
import java.util.Calendar;

/**
 * implements the Expirable interface.
 * Returns 70% of the price if the product expires in 15 days time.??!!
 */
public class FoodProduct extends Product implements Expirable {


    public FoodProduct(String name, double price, int quantity, String ageRestriction, LocalDate expirationDate) {
        super(name, price, quantity, ageRestriction, expirationDate);

    }

    public static Calendar calendarFor(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal;
    }

    @Override
    public LocalDate getExpirationDate() {
        return LocalDate.of(2020, 1, 12);
    }

}





