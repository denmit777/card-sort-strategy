package homework4.task1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String name, BigDecimal balance) {
        super(name, balance);
    }

    @Override
    public BigDecimal withdraw(BigDecimal sum) {
        if (getBalance().compareTo(sum) < 0) {
            throw new IllegalArgumentException("Not enough money to withdraw");
        }
        System.out.println("Your balance after withdrawing:");
        return getBalance().subtract(sum);
    }
}
