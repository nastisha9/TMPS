package Lab1.AbstractFactory;

public class Phone implements Computer {
    @Override
    public void compute(){
        System.out.println("Phone computes");
    }
}