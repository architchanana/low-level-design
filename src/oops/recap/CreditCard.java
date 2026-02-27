package oops.recap;

public class CreditCard extends Card{

    public CreditCard(String cardNo, String username){
        super(cardNo, username);
    }

    @Override
    public void pay() {
        System.out.println("Paying via Credi");
    }
}
