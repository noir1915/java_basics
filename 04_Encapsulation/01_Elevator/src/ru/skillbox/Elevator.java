public class Elevator {
    private int currentFloor = 1;
    public int maxFloor;
    public int minFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            if (currentFloor < floor) {
                while (currentFloor < floor) {
                    moveUp();
                    System.out.println(getCurrentFloor());
                }
            }
            if (currentFloor > floor)
                while (currentFloor > floor) {
                    moveDown();
                    System.out.println(getCurrentFloor());
                }
        } else System.out.println("Ошибка");
    }