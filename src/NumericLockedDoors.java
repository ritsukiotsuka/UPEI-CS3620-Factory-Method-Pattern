import java.util.Scanner;

/**
 * Class for doors which have a lock
 */
public class NumericLockedDoors extends MazeDoors {

    int numericCode = 1234;

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void unlock() {

        System.out.println("Please provide a numeric code: ");
        System.out.println("        For simplicity the program assumes the correct code is provided...");

        // uncomment below to make this interactive

        /*

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input != numericCode)
        {
            System.out.println("Incorrect code");

        }
        else

        */
        {
            System.out.println("    The door is unlocked");
            locked = false;
        }
    }

    @Override
    public void show() {
        super.show();
    }
}
