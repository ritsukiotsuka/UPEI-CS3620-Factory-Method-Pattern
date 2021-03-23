/**
 * Concrete creator class that overrides the factory method (createDoor) and returns an instance of ConcreteProduct
 */
public class WoodenRooms extends MazeRooms {

    @Override
    public MazeDoors createDoor() {
        MazeDoors simpleDoor = new SimpleDoors();
        doors.add(simpleDoor);
        return simpleDoor;
    }



    @Override
    public String description() {
        return "Wooden room with simple doors";
    }
}
