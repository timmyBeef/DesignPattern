package dip;

public class User {
    private IPayment payment;

    public User() {
    }

    public User(IPayment payment) {
        this.payment = payment;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void pay() {
        payment.pay();
    }

    public static void main(String[] args) {
        User user = new User(new CreditCardPayment()); //do constructor DI
        user.pay();

        user = new User(new CashPayment()); // do constructor DI
        user.pay();

        // User is singleton, use set DI
        User user2 = new User();
        user2.setPayment(new CreditCardPayment());
        user2.pay();

        user2.setPayment(new CashPayment());
        user2.pay();
    }
}
