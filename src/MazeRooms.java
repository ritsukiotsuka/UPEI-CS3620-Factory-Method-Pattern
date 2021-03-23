import java.util.ArrayList;

/**
 * Creator class that declares the factory method returning a Product object
 */
public abstract class MazeRooms {

    ArrayList<MazeDoors> doors = new ArrayList<>();

    /**
     * Template method to create a door of any kind through this method and specify the type in a subclass
     */
    public abstract MazeDoors createDoor();

    /**
     * briefly describe the room
     *
     * @return string briefly describing the room
     */
    public abstract String description();



}

