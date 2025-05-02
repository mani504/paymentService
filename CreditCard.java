public class CreditCard extends Cards{
    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("paying via credit card" + getUserName());
    }
}
