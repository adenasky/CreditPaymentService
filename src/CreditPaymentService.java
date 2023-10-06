public class CreditPaymentService {
    public double calculate(double creditSum, int periodYears, double creditRate) {
        int periodMonths = periodYears * 12;
        double ratePerMonth = creditRate / 12 / 100; // Ставка по кредиту в месяц
        double annuityСoefficient = (ratePerMonth * (Math.pow((1+ratePerMonth),periodMonths))/ (Math.pow((1+ratePerMonth), periodMonths) - 1)); // Коэффициент аннуитета
        return annuityСoefficient * creditSum; // Ежемесячный аннуитетный платеж
    }
}

