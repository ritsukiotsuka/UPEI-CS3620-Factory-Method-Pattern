/**
 * Product class that defines the interface of objects the factory method creates
 */
public abstract class MazeDoors {

    protected boolean locked = true;

    /**
     * Open the door
     */
    public void open()
    {
        System.out.println("The door is open");
    }

    /**
     * Unlock the door
     */
    public void unlock()
    {
        System.out.println("No lock for this door");
    }

    /**
     * Show a quiz
     */
    public void show()
    {
        System.out.println("No quizzes for this door");
    }

    /**
     * Template Method to show a quiz, unlock, and open the door
     */
    public void openDoor()
    {
        System.out.println("Opening the door...");
        System.out.print("    Quiz: ");
        show();

        System.out.print("    Lock: ");
        unlock();

        System.out.print("    ");
        open();
    }

}
