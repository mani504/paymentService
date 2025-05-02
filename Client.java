public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.addPaymentMethod("manishCC", new CreditCard("4622","manish-SCB"));
        paymentService.addPaymentMethod("manishDC", new DebitCard("6842", "manishDC"));

        paymentService.makePayment("manishCC");
    }
}
