package homework4.task1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AtmTest {

    private Atm bankomat = new Atm();
    private CreditCard creditCard1 = new CreditCard("Vasilkov", BigDecimal.valueOf(694));
    private DebitCard debitCard1 = new DebitCard("Vasilkov", BigDecimal.valueOf(720));
    private CreditCard creditCard2 = new CreditCard("Petrov", BigDecimal.valueOf(320));
    private DebitCard debitCard2 = new DebitCard("Petrov", BigDecimal.valueOf(145));

    @Test
    public void testRefillAccountCreditCard1() {
        bankomat.setCard(creditCard1);
        BigDecimal sum = BigDecimal.valueOf(106);
        BigDecimal expected = BigDecimal.valueOf(800);

        BigDecimal result = bankomat.refillAccount(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromCreditCard1Positive() {
        bankomat.setCard(creditCard1);
        BigDecimal sum = BigDecimal.valueOf(600);
        BigDecimal expected = BigDecimal.valueOf(94);

        BigDecimal result = bankomat.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromCreditCard1Negative_IfBalanceIsLessThanSumOfWithdraw_GetDebt() {
        bankomat.setCard(creditCard1);
        BigDecimal sum = BigDecimal.valueOf(800);
        BigDecimal expected = BigDecimal.valueOf(106);

        BigDecimal result = bankomat.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testRefillAccountDebitCard1() {
        bankomat.setCard(debitCard1);
        BigDecimal sum = BigDecimal.valueOf(80);
        BigDecimal expected = BigDecimal.valueOf(800);

        BigDecimal result = bankomat.refillAccount(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromDebitCard1Positive() {
        bankomat.setCard(debitCard1);
        BigDecimal sum = BigDecimal.valueOf(600);
        BigDecimal expected = BigDecimal.valueOf(120);

        BigDecimal result = bankomat.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawFromDebitCard1Negative_IfBalanceIsLessThanSumOfWithdraw_GetException() {
        bankomat.setCard(debitCard1);
        BigDecimal sum = BigDecimal.valueOf(900);

        BigDecimal result = bankomat.withdraw(sum);
    }

    @Test
    public void testRefillAccountCreditCard2() {
        bankomat.setCard(creditCard2);
        BigDecimal sum = BigDecimal.valueOf(700);
        BigDecimal expected = BigDecimal.valueOf(1020);

        BigDecimal result = bankomat.refillAccount(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromCreditCard2Positive_IfBalanceIsEqualsSumOfWithdraw_GetZero() {
        bankomat.setCard(creditCard2);
        BigDecimal sum = BigDecimal.valueOf(320);
        BigDecimal expected = BigDecimal.valueOf(0);

        BigDecimal result = bankomat.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromCreditCard2Negative_IfBalanceIsLessThanSumOfWithdraw_GetDebt() {
        bankomat.setCard(creditCard2);
        BigDecimal sum = BigDecimal.valueOf(520);
        BigDecimal expected = BigDecimal.valueOf(200);

        BigDecimal result = bankomat.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testRefillAccountDebitCard2() {
        bankomat.setCard(debitCard2);
        BigDecimal sum = BigDecimal.valueOf(45);
        BigDecimal expected = BigDecimal.valueOf(190);

        BigDecimal result = bankomat.refillAccount(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromDebitCard2Positive_IfBalanceIsEqualsSumOfWithdraw_GetZero() {
        bankomat.setCard(debitCard2);
        BigDecimal sum = BigDecimal.valueOf(145);
        BigDecimal expected = BigDecimal.valueOf(0);

        BigDecimal result = bankomat.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawFromDebitCard2Negative_IfBalanceIsLessThanSumOfWithdraw_GetException() {
        bankomat.setCard(debitCard2);
        BigDecimal sum = BigDecimal.valueOf(146);

        BigDecimal result = bankomat.withdraw(sum);
    }
}