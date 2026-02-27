package oops.recap;

public class DebitCard extends Card implements PaymentMethod{

//    we have add this constructor as the parent class had the constructor too.
    public DebitCard(String cardNo, String name){
        super(cardNo, name); // using super we're calling constructor of te parent class
    }

    @Override
    public void pay() {
        System.out.println("Paying via Debit");
    }
}
