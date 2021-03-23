/**
 * Class for doors with quizzes printed on them
 */
public class QuizDoors extends MazeDoors {

    protected String answer = "1982";


    @Override
    public void open() {
        super.open();
    }

    @Override
    public void unlock() {

        System.out.println("There's a quiz instead of a lock ");
        System.out.println("        For simplicity the program assumes the correct answer is provided...");

        //uncomment below to make this interactive
        /*

        Scanner in = new Scanner(System.in);
        String input = in.next();

        if (input.equals(password))
        {
            System.out.println("Wrong answer");

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
        System.out.println("Question: In which year, did Canada officially become Canada?");
    }
}
