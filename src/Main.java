public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSum = 1_000_000F;
        int periodYears = 1;
        double creditRate = 9.99F;
        int annuityPayment = (int) service.calculate(creditSum, periodYears,creditRate);
        System.out.println();
        System.out.println(annuityPayment);

        CreditPaymentService service2 = new CreditPaymentService();
        double creditSum2 = 1_000_000F;
        int periodYears2 = 2;
        double creditRate2 = 9.99F;
        int annuityPayment2 = (int) service2.calculate(creditSum2, periodYears2,creditRate2);
        System.out.println();
        System.out.println(annuityPayment2);

        CreditPaymentService service3 = new CreditPaymentService();
        double creditSum3 = 1_000_000F;
        int periodYears3 = 3;
        double creditRate3 = 9.99F;
        int annuityPayment3 = (int) service3.calculate(creditSum3, periodYears3,creditRate3);
        System.out.println();
        System.out.println(annuityPayment3);
    }
}