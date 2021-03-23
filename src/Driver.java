/**
 * Driver class
 */
public class Driver {

    public static void main(String [] args)
    {

        System.out.println("=====  Wooden Room  =====");
        MazeRooms woodenRoom  = new WoodenRooms();
        System.out.println("Description: " + woodenRoom.description());
        MazeDoors door = woodenRoom.createDoor();
        door.openDoor();


        System.out.println("\n=====  Steel Room  =====");
        MazeRooms steelRoom = new SteelRooms();
        System.out.println("Description: " + steelRoom.description());
        door = steelRoom.createDoor();
        door.openDoor();


        System.out.println("\n=====  Brick Room  =====");
        MazeRooms brickRoom  = new BrickRooms();
        System.out.println("Description: " + brickRoom.description());
        door = brickRoom.createDoor();
        door.openDoor();


        System.out.println("\n=====  Glass Room  =====");
        MazeRooms glassRoom  = new GlassRooms();
        System.out.println("Description: " + glassRoom.description());
        door = glassRoom.createDoor();
        door.openDoor();
    }
}
