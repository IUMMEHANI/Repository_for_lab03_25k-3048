package Task05;

public class Programmer {
    int id;
    String name;
    String pref_language;
    int problemsSolved;
    Programmer(int id, String name, String language, int problemsSolved) {
        this.id = id;
        this.name = name;
        this.pref_language = language;
        this.problemsSolved = problemsSolved;
    }
    public void updateProblems(int newProblems) {
        problemsSolved += newProblems;
    }
    public void display() {
        System.out.println("Programmer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Preferred Language: " + pref_language);
        System.out.println("Problems Solved: " + problemsSolved);
    }
}
class MAIN {
    public static void main(String[] args) {
        Programmer p1 = new Programmer(101, "Ali", "Java", 50);
        Programmer p2 = new Programmer(102, "Sara", "Python", 70);
        p1.display();
        p2.display();
        p1.updateProblems(10);
        p2.updateProblems(5);
        System.out.println("After Updating Problems:");
        p1.display();
        p2.display();
    }
}
