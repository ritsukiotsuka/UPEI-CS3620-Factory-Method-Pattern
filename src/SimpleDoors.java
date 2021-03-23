/**
 * Class for doors which don't have a lock
 */
public class SimpleDoors extends MazeDoors {

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void unlock() {
        System.out.println("No lock for this door.");
    }

    @Override
    public void show() {
        super.show();
    }
}
