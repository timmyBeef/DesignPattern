package ocp;

import java.math.BigDecimal;

public interface IPayment {
    Integer getId();
    String getName();
    BigDecimal getAmount();
}
