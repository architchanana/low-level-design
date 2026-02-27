package oops.recap;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Upi implements PaymentMethod{

    String upiId;

    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
