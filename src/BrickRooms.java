/**
 * Concrete creator class that overrides the factory method (createDoor) and returns an instance of ConcreteProduct
 */
public class BrickRooms extends MazeRooms {

    @Override
    public MazeDoors createDoor() {
        MazeDoors door = new PasswordLockedDoors();
        doors.add(door);
        return door;
    }

    @Override
    public String description() {
        return "Brick room with locked doors that open with a password";
    }
}
