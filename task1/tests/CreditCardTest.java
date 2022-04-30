package homework4.task1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CreditCardTest {

    private CreditCard creditCard = new CreditCard("Petrov", BigDecimal.valueOf(320));

    @Test
    public void testExchangeBalanceInfo_CreditCard_InDollars() {
        BigDecimal expected = BigDecimal.valueOf(128);

        BigDecimal actual = creditCard.exchangeBalanceInfo(Currency.DOLLAR);

        assertEquals(expected, actual);
    }

    @Test
    public void testExchangeBalanceInfo_CreditCard_InEuro() {
        BigDecimal expected = BigDecimal.valueOf(109);

        BigDecimal actual = creditCard.exchangeBalanceInfo(Currency.EURO);

        assertEquals(expected, actual);
    }

    @Test
    public void testExchangeBalanceInfo_CreditCard_InRubRF() {
        BigDecimal expected = new BigDecimal(9384);

        BigDecimal actual = creditCard.exchangeBalanceInfo(Currency.RUB_RF);

        assertEquals(expected, actual);
    }

    @Test
    public void testRefillAccountCreditCard() {
        BigDecimal sum = BigDecimal.valueOf(80);
        BigDecimal expected = BigDecimal.valueOf(400);

        BigDecimal result = creditCard.refillAccount(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromCreditCardPositive() {
        BigDecimal sum = BigDecimal.valueOf(300);
        BigDecimal expected = BigDecimal.valueOf(20);

        BigDecimal result = creditCard.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromCreditCardPositive_IfBalanceIsEqualsSumOfWithdraw_GetZero() {
        BigDecimal sum = BigDecimal.valueOf(320);
        BigDecimal expected = BigDecimal.valueOf(0);

        BigDecimal result = creditCard.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromCreditCardNegative_IfBalanceIsLessThanSumOfWithdraw_GetDebt() {
        BigDecimal sum = BigDecimal.valueOf(520);
        BigDecimal expected = BigDecimal.valueOf(200);

        BigDecimal result = creditCard.withdraw(sum);

        assertEquals(expected, result);
    }
}