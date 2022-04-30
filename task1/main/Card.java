package homework4.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Card {

    private String name;
    private BigDecimal balance;

    protected Card(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    protected Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal exchangeBalanceInfo(Currency currency) {
        BigDecimal currencyBalance = balance.divide(currency.getCurse(), RoundingMode.HALF_UP);
        System.out.println("Your card balance in currency terms is:");
        return currencyBalance;
    }

    protected BigDecimal refillAccount(BigDecimal sum) {
        BigDecimal newBalance = balance.add(sum);
        System.out.println("Your balance after refilling:");
        return newBalance;
    }

    protected abstract BigDecimal withdraw(BigDecimal sum);

    @Override
    public String toString() {
        return "Card{"
                + "name = " + name
                + ", balance = " + balance
                + '}';
    }
}
