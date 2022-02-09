public class Dimensions {

    private int width = 0;
    private int height = 0;
    private int length = 0;

    public Dimensions(int width, int height, int lenght) {//габариты груза
        this.width = width;
        this.height = height;
        this.length = lenght;
    }


    public Dimensions setWidth(int width) {
        return new Dimensions(width, height, length);
    }

    public Dimensions setLength(int length) {
        return new Dimensions(width, height, length);
    }


    public Dimensions setHeight(int height) {
        return new Dimensions(width, height, length);
    }

    public int getDepth() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    /**
     * вычисляется объем груза
     */

    int volume() {
        return width * height * length;
    }

    public String toString() {
        return "Ширина - " + width + "; Высота - " + height + "; Длина - " + length;
    }
}