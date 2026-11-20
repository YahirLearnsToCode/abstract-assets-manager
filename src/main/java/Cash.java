import java.math.BigDecimal;
import java.time.LocalDate;

public class Cash extends Asset {
    private BigDecimal mattressCash;

    public Cash(int cashAmount) {

        super("Cash money", LocalDate.now().toString(), BigDecimal.valueOf(cashAmount));
        this.mattressCash = BigDecimal.valueOf(cashAmount);
    }

    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
