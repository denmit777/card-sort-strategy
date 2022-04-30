package homework4.task1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DebitCardTest {

    private DebitCard debitCard = new DebitCard("Vasilkov", BigDecimal.valueOf(720));

    @Test
    public void testExchangeBalanceInfo_DebitCard_InDollars() {
        BigDecimal expected = BigDecimal.valueOf(288);

        BigDecimal actual = debitCard.exchangeBalanceInfo(Currency.DOLLAR);

        assertEquals(expected, actual);
    }

    @Test
    public void testExchangeBalanceInfo_DebitCard_InEuro() {
        BigDecimal expected = BigDecimal.valueOf(245);

        BigDecimal actual = debitCard.exchangeBalanceInfo(Currency.EURO);

        assertEquals(expected, actual);
    }

    @Test
    public void testExchangeBalanceInfo_DebitCard_InRubRF() {
        BigDecimal expected = new BigDecimal(21114);

        BigDecimal actual = debitCard.exchangeBalanceInfo(Currency.RUB_RF);

        assertEquals(expected, actual);
    }

    @Test
    public void testRefillAccountDebitCard() {
        BigDecimal sum = BigDecimal.valueOf(80);
        BigDecimal expected = BigDecimal.valueOf(800);

        BigDecimal result = debitCard.refillAccount(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromDebitCardPositive() {
        BigDecimal sum = BigDecimal.valueOf(600);
        BigDecimal expected = BigDecimal.valueOf(120);

        BigDecimal result = debitCard.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test
    public void testWithdrawFromDebitCardPositive_IfBalanceIsEqualsSumOfWithdraw_GetZero() {
        BigDecimal sum = BigDecimal.valueOf(720);
        BigDecimal expected = BigDecimal.valueOf(0);

        BigDecimal result = debitCard.withdraw(sum);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawFromDebitCardNegative_IfBalanceIsLessThanSumOfWithdraw_GetException() {
        BigDecimal sum = BigDecimal.valueOf(900);

        BigDecimal result = debitCard.withdraw(sum);
    }
}