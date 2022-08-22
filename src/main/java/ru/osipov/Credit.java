package ru.osipov;

public class Credit {
    private final int countMonth;
    private final double annualRate;
    private final int loanAmount;

    public Credit(int countMonth, double annualRate, int loanAmount) {
        this.countMonth = countMonth;
        this.annualRate = annualRate;
        this.loanAmount = loanAmount;
    }

    public int monthlyPayment() {
        return (int) (loanAmount * (1 + annualRate) / countMonth);
    }

    public int totalAmount() {
        return (int) (loanAmount * (1 + annualRate));
    }

    public int overPayment() {
        return (int) (loanAmount * (1 + annualRate) - loanAmount);
    }
}