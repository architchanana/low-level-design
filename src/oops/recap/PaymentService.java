package oops.recap;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@RequiredArgsConstructor
public class PaymentService {
    HashMap<String, PaymentMethod> paymentMethodHashMap;

    void addPaymentMethod(String name, PaymentMethod method){
        paymentMethodHashMap.put(name, method);
    }

    public void makePayment(String name){
        paymentMethodHashMap.get(name).pay(); // Runtime Polymorphism
    }
}
