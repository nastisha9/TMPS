package Lab2.Composite;

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