import java.io.FileNotFoundException;

/**
 * Created by Dave on 1/24/17.
 */
public class Tester {
    public static void main(String args[]) throws FileNotFoundException {
        GuinnessBook records = new GuinnessBook("animalList.txt");
        System.out.println(records);
        records.testGuinnessBook();
    }
}
