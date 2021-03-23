/**
 * Concrete creator class that overrides the factory method (createDoor) and returns an instance of ConcreteProduct
 */
public class SteelRooms extends MazeRooms {

    @Override
    public MazeDoors createDoor() {
        MazeDoors door = new NumericLockedDoors();
        doors.add(door);
        return door;
    }

    @Override
    public String description() {
        return "Steel room with locked doors that open with numeric code";
    }
}
