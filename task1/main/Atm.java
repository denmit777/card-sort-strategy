package homework4.task1;

import java.math.BigDecimal;

public class Atm {

    private Card card;

    public void setCard(Card card) {
        this.card = card;
    }

    public BigDecimal refillAccount(BigDecimal sum) {
        return card.refillAccount(sum);
    }

    public BigDecimal withdraw(BigDecimal sum) {
        return card.withdraw(sum);
    }
}
