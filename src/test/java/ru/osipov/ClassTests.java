package ru.osipov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTests {
    @Test
    public void testMonthlyPayment() {
        /*
        Будем считать простой кредит с единой ставкой на весь срок кредитования,
        без учета остатка, досрочных выплат, округлений и т.п.
        */
        int countMonth = 36;
        double annualRate = 0.1;
        int loanAmount = 100000;
        Credit credit = new Credit(countMonth, annualRate, loanAmount);
        int result = credit.monthlyPayment();
        assertEquals((int) (loanAmount * (1 + annualRate) / countMonth), result, "Неверный расчет ежемесячного платежа");
    }

    @Test
    public void testTotalAmount() {
        int countMonth = 36;
        double annualRate = 0.1;
        int loanAmount = 100000;
        Credit credit = new Credit(countMonth, annualRate, loanAmount);
        int result = credit.totalAmount();
        assertEquals((int) (loanAmount * (1 + annualRate)), result, "Неверный расчет общей суммы возврата");
    }

    @Test
    public void testOverpayment() {
        int countMonth = 36;
        double annualRate = 0.1;
        int loanAmount = 100000;
        Credit credit = new Credit(countMonth, annualRate, loanAmount);
        int result = credit.overPayment();
        assertEquals((int) (loanAmount * (1 + annualRate) - loanAmount), result, "Неверный расчет переплаты");
    }
}