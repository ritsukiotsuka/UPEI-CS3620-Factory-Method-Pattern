public class PasswordLockedDoors extends MazeDoors {

    protected String password;


    @Override
    public void open() {
        super.open();
    }

    @Override
    public void unlock() {

        System.out.println("Please provide a password: ");
        System.out.println("        For simplicity the program assumes the correct password is provided...");

        //uncomment below to make this interactive
        /*

        Scanner in = new Scanner(System.in);
        String input = in.next();

        if (input.equals(password))
        {
            System.out.println("Incorrect password");

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
