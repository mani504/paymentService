
public class DebitCard extends Cards {
    public DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("paying via debit card");
    }
}
