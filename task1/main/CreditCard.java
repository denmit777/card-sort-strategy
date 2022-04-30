package homework4.task1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String name, BigDecimal balance) {
        super(name, balance);
    }

    @Override
    public BigDecimal withdraw(BigDecimal sum) {
        BigDecimal lastBalance = getBalance().subtract(sum);
        if (getBalance().compareTo(sum) < 0) {
            System.out.println("Your debt after withdrawing:");
            return lastBalance.abs();
        }
        System.out.println("Your balance after withdrawing:");
        return lastBalance;
    }
}

