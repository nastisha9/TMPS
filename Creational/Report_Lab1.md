# Laboratory work №1. Creational Design Patterns

### Course: Software Design Techniques and Mechanisms
### Author: Iatco Anastasia, FAF-202

## Objectives:

1. Get familiar with the Creational DPs;
2. Choose a specific domain;
3. Implement at least 3 CDPs for the specific domain;


## Used Design Patterns:

- Singleton Pattern
Singleton pattern is one of the simplest design patterns. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object. This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

- Builder Pattern 
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.

- Factory Pattern
The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.

- Abstract Factory Pattern
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.




## Implementation
In Singleton Patterm we defined a class that has only one instance and provides a global point of access to it. In other words, a class must ensure that only single instance should be created and single object can be used by all other classes. This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
```java
public class Main {
    public static void main(String[] args) {    

        Singleton object = Singleton.getInstance();

        object.showMessage();
    }
}
```
Builder pattern builds a complex object using simple objects and using a step-by-step approach. A Builder class builds the final object step by step. This builder is independent of other objects. It is mostly used when object can't be created in single step like in the de-serialization of a complex object.
```java
public class Main {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
```

In Factory Pattern we defined an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class. We create object without exposing the creation logic to the client and refer to newly created object using a common interface.
```java
public class Main {
    public static void main(String[] args) {

        String bankType1 = "Savings";
        String bankType2 = "Cheque";
        String bankType3 = "Credit";
        
        BankAccount bankAccount = BankAccountFactory.getInstance(bankType1);
        BankAccount bankAccount1 = BankAccountFactory.getInstance(bankType2);
        BankAccount bankAccount2 = BankAccountFactory.getInstance(bankType3);

        System.out.println("----Savings----");
        System.out.println(bankAccount.balance());
        System.out.println("----Cheque----");
        System.out.println(bankAccount1.balance());
        System.out.println("----Credit----");
        System.out.println(bankAccount2.balance());
    }
}
```

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
```java
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(true);

        Computer laptopObj = factory.getComputer("Laptop");
        Computer phoneObj = factory.getComputer("Phone");
        Computer smartTVObj = factory.getComputer("SmartTV");
        laptopObj.compute();
        phoneObj.compute();

        AbstractFactory factoryFalse = FactoryProducer.getFactory(false);

        Computer laptopObj2 = factoryFalse.getComputer("Laptop");
        Computer phoneObj2 = factoryFalse.getComputer("Phone");
        Computer smartTvObj2 = factoryFalse.getComputer("SmartTV");
        laptopObj2.compute();
        phoneObj2.compute();
        smartTvObj2.compute();
    }

}
```

## Conclusions

While working on this laboratory work, I got familiar with the creational design patterns and how are they implemeted and used. Creational design patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code. These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).