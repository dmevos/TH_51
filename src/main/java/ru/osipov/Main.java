package ru.osipov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int countMonth = 12;
        double annualRate = 0.1;
        int loanAmount = 100000;

        Credit credit = new Credit(countMonth, annualRate, loanAmount);
        System.out.printf("Вы взяли кредит в размере %d, под %d процентов, на срок %d месяцев\n", loanAmount, (int) (annualRate * 100), countMonth);
        System.out.printf("Ежемесячный платеж: %d\n", credit.monthlyPayment());

        System.out.printf("Общая сумма возврата: %d\n", credit.totalAmount());
        System.out.printf("Переплата: %d\n", credit.overPayment());
    }
}