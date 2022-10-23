package Lab1.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(true);

        Computer laptopObj = factory.getComputer("Laptop");
        Computer phoneObj = factory.getComputer("Phone");
        Computer smartTVObj = factory.getComputer("SmartTV");
        laptopObj.compute();
        phoneObj.compute();
        //smartTVObj.compute(); --if this would be run, NullPoint Exception will be thworn.
        //Because smartTVObj is not a portableComputer.

        AbstractFactory factoryFalse = FactoryProducer.getFactory(false);

        Computer laptopObj2 = factoryFalse.getComputer("Laptop");
        Computer phoneObj2 = factoryFalse.getComputer("Phone");
        Computer smartTvObj2 = factoryFalse.getComputer("SmartTV");
        laptopObj2.compute();
        phoneObj2.compute();
        smartTvObj2.compute();
    }

}