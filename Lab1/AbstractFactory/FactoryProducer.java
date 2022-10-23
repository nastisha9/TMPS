package Lab1.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean portable){
        if(portable){
            return new PortableComputer();
        }
        else{
            return new ComputerFactory();
        }
    }
}