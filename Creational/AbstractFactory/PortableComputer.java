package Lab1.AbstractFactory;

public class PortableComputer extends AbstractFactory{
    @Override
    Computer getComputer(String objectWeWantToReturn) {

        if(objectWeWantToReturn.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if(objectWeWantToReturn.equalsIgnoreCase("Phone")) {
            return new Phone();
        }
        System.out.println("None of the cases matches");
        return null;

    }
}