package SRP;

public class Main {
    public static void main(String[] args) {
        
        ValidateСoupon validate = new ValidateСoupon();
        EmailManager email = new EmailManager();

        Order order = new Order (email, validate);

        order.addCard("Phone", "Sam", "2");
    }
}
