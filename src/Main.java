import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ignacio", "Varga", 34);
        Person p2 = new Person("Hector", "Salamanca", 70);
        Person p3= new Person("Don", "Eladio Vuente", 50);
        Person p4= new Person("Pedro", "Sanches Luego Ciano", 42);
        Person p5= new Person("Hulio", "Alvares Santa Muerta", 29);

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(p5);
        persons.add(p3);
        persons.add(p4);
        persons.add(p1);
        persons.add(p2);

        persons.sort(new CompareByGentry().thenComparing(new CompareByAge()));

        System.out.println(persons.toString());

    }

}
