import java.util.HashMap;

public class PaymentService {

    private HashMap<String, PaymentMethods> paymentMethodsHashMap;

    PaymentService(){
        paymentMethodsHashMap = new HashMap<>();
    }

    public void addPaymentMethod(String name , PaymentMethods paymentMethods){
        paymentMethodsHashMap.put(name, paymentMethods);
    }

    public void makePayment(String name){
        PaymentMethods pm = paymentMethodsHashMap.get(name);
        pm.pay();
    }
}
