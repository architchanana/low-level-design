package oops.recap;

abstract public class Card implements PaymentMethod{
    private final String cardNo;

    private final String username;

    public Card(String cardNo, String username){
        this.cardNo = cardNo;
        this.username = username;
    }

    public String getCardNo(){
        return cardNo;
    }

    public String getUsername(){
        return  username;
    }
}
