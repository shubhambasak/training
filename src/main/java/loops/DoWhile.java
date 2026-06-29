package loops;
public class DoWhile {
    public static void main(String[] args) {

        // print "hello world" 10 times using the do while loop.

        int counter = 1;

        do {
            System.out.println("Hello World " + counter);
            counter++;
        } while (counter >= 10);

    }
}
