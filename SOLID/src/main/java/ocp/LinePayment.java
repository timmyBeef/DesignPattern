package ocp;

import java.math.BigDecimal;

public class LinePayment implements IPayment {
    private Integer id;
    private String name;
    private BigDecimal amount;

    public LinePayment(Integer id, String name, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
