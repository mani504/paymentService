public class UPI implements PaymentMethods{
    String upiId;

    UPI(String id){
        this.upiId = id;
    }

    public void pay(){
        System.out.println("paying via upi Id" + upiId);
    }
}
