package SRP;

// The class has only one responsibility

public class Order {

    private EmailManager emailManager;
    private ValidateСoupon validateSelected;
    
    public Order(EmailManager emailManager, ValidateСoupon validate){
        
        this.emailManager = emailManager;
        this.validateSelected = validate;
    }

    public void addCard(String product, String client, String coupon){

        System.out.println("Adding item to the card");

        if( this.validateSelected.validCoupon(coupon) ) {

            System.out.println("Added " + product + " to the card");
        } else {

            this.emailManager.sendEmail(client);
        }

    }
}
