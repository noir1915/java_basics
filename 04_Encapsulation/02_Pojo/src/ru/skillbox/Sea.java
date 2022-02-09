public class Sea {
    public int depth;
    public int size;
    public boolean presenceOfFish;
    public int numberOfWashedLand;

    public Sea(int depth, int size) {
        this.depth = depth;
        this.size = size;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isPresenceOfFish() {
        return presenceOfFish;
    }

    public void setPresenceOfFish(boolean presenceOfFish) {
        this.presenceOfFish = presenceOfFish;
    }

    public int getNumberOfWashedLand() {
        return numberOfWashedLand;
    }

    public void setNumberOfWashedLand(int numberOfWashedLand) {
        this.numberOfWashedLand = numberOfWashedLand;
    }
    
}