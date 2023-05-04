import java.util.Comparator;

public class CompareByGentry implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return wordCount(o1.getSurName()) - wordCount(o2.getSurName()) ;
    }

    private int wordCount(String string) {
        String[] words = string.split(" ");
        return words.length;
    }


}
