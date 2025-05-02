abstract public class Cards implements PaymentMethods{
    private String cardNo;
    private String userName;

    public Cards(String cardNo, String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }


    public String getCardNo() {
        return cardNo;
    }

    public String getUserName(){
        return userName;
    }
}
