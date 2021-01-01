package ocp;

import java.math.BigDecimal;

/*
    through interface and inheritance to complete open-closed principle

    line pay in credit card saves 5% money
 */
public class LineCreditCardPayment extends LinePayment {
    public LineCreditCardPayment(Integer id, String name, BigDecimal amount) {
        super(id, name, amount);
    }

    public BigDecimal getOriginAmount() {
        return super.getAmount();
    }

    @Override
    public BigDecimal getAmount() { // by credit card discount 95%
        return new BigDecimal(0.95).multiply(super.getAmount());
    }
}
