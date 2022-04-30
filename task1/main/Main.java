package homework4.task1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Atm bankomat = new Atm();

        CreditCard creditCard1 = new CreditCard("Vasilkov", BigDecimal.valueOf(694));
        DebitCard debitCard1 = new DebitCard("Vasilkov", BigDecimal.valueOf(720));
        System.out.println(creditCard1);
        System.out.println(debitCard1);
        System.out.println(creditCard1.exchangeBalanceInfo(Currency.EURO)); //237
        System.out.println(debitCard1.exchangeBalanceInfo(Currency.EURO)); //245
        bankomat.setCard(creditCard1);
        System.out.println(bankomat.refillAccount(BigDecimal.valueOf(106))); //800
        System.out.println(bankomat.withdraw(BigDecimal.valueOf(600))); //94
        bankomat.setCard(debitCard1);
        System.out.println(bankomat.refillAccount(BigDecimal.valueOf(80))); //800
        System.out.println(bankomat.withdraw(BigDecimal.valueOf(600))); //120
        System.out.println("_____________________________");

        CreditCard creditCard2 = new CreditCard("Petrov", BigDecimal.valueOf(320));
        DebitCard debitCard2 = new DebitCard("Petrov", BigDecimal.valueOf(145));
        System.out.println(creditCard2);
        System.out.println(debitCard2);
        System.out.println(creditCard2.exchangeBalanceInfo(Currency.DOLLAR)); //128
        System.out.println(debitCard2.exchangeBalanceInfo(Currency.DOLLAR)); //58
        bankomat.setCard(creditCard2);
        System.out.println(bankomat.refillAccount(BigDecimal.valueOf(180))); //500
        System.out.println(bankomat.withdraw(BigDecimal.valueOf(420))); //100
        bankomat.setCard(debitCard2);
        System.out.println(bankomat.refillAccount(BigDecimal.valueOf(55))); //200
        System.out.println(bankomat.withdraw(BigDecimal.valueOf(200))); //IllegalArgumentException: Not enough money to withdraw
    }
}
