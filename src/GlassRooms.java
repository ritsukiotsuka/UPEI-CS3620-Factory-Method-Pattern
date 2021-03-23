/**
 * Concrete creator class that overrides the factory method (createDoor) and returns an instance of ConcreteProduct
 */
public class GlassRooms extends MazeRooms {

    @Override
    public MazeDoors createDoor() {
        MazeDoors door = new QuizDoors();
        doors.add(door);
        return door;
    }

    @Override
    public String description() {
        return "Glass rooms with doors with quizzes";
    }
}
