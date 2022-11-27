# Laboratory work №2. Structural Design Patterns

### Course: Software Design Techniques and Mechanisms
### Author: Iatco Anastasia, FAF-202

## Used Design Patterns:

- Adapter Pattern
Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. We plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.

- Bridge Pattern 
Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.
This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. Both types of classes can be altered structurally without affecting each other.

- Composite Pattern
Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.

- Decorator Pattern
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

- Facade Pattern
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.




## Implementation
In Adapter Pattern the implementation uses the object composition principle: the adapter implements the interface of one object and wraps the other one. 
```java
public class Main {
    public static void main(String[] args) {
	Adapter adapter = new Adapter();
    adapter.Send("Hello");
    }
}
```
In Bridge Patter the abstraction object controls the appearance of the app, delegating the actual work to the linked implementation object.
```java
public class ProgramCreator {
    public static void main(String[] args){
        Program program1 = new BankSystem(new JavaDeveloper());
        Program program2 = new StockExchange(new ScalaDeveloper());

        program1.developProgram();
        program2.developProgram();
    }
}

```
In Composite Pattern we have a class ```Team``` which acts as composite pattern actor class. ```Project```, our demo class will use ```Team``` class to add department level hierarchy and print all teams working on projects.
```java
public class Team {
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Team create project ...");
        for (Developer developer: developers) {
            developer.writeCode();
        }
    }
}
```
```java
public class Project {
    public static void main(String [] args){
        Team team = new Team();

        Developer cppDeveloper = new CppDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer firstJavaDeveloper = new JavaDeveloper();

        team.addDeveloper(cppDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(firstJavaDeveloper);

        team.createProject();
    }
}
```

In Decorator Pattern we're going to create a ```Developer``` interface and concrete classes implementing the ```Developer``` interface.
```java
public interface Developer {
    public String makeJob();
}
```
We will then create an abstract decorator class ```DeveloperDecorator``` implementing the ```Developer``` interface and having ```Developer``` object as its instance variable.
```java
public class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer){
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
```

A facade is a class that provides a simple interface to a complex subsystem which contains lots of moving parts. A facade might provide limited functionality in comparison to working with the subsystem directly. We have a ```SprintRunner``` class, which is very simple.
```java
public class SprintRunner {
    public static void main(String[] args){
        WorkFlow workFlow = new WorkFlow();

        workFlow.solveProblems();
    }
}
```
```WorkFlow``` class uses the concrete classes to delegate user calls to these classes.
```java
public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDEadLine(bugTracker);
    }

}
```

## Conclusions

While working on this laboratory work, I got familiar with the structural design patterns and how are they implemeted and used. Structural design patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient. The patterns in structural designs show how unique pieces of a system can be combined together in an extensible and flexible manner. So, with the help structural design pattern we can target and change a specific parts of the structure without changing the entire structure.