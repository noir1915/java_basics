public class Screen {

    private final double diagonal;
    private final TypeScreen typeScreen;
    private final int screenWeight;

    public Screen(double diagonal, TypeScreen typeScreen, int screenWeight) {
        this.diagonal = diagonal;
        this.screenWeight = screenWeight;
        this.typeScreen = typeScreen;

    }

    public double getDiagonal() {
        return diagonal;
    }

    public Screen setDiagonal(double diagonal) {
        return new Screen(diagonal, typeScreen, screenWeight);
    }

    public TypeScreen getTypeScreen() {
        return typeScreen;
    }

    public Screen setTypeScreen(TypeScreen typeScreen) {
        return new Screen(diagonal, typeScreen, screenWeight);
    }

    public int getScreenWeight() {
        return screenWeight;
    }

    public Screen setScreenWeight(int screenWeight) {
        return new Screen(diagonal, typeScreen, screenWeight);
    }

    public String toStringScreen() {
        return "Диагональ экрана - " + diagonal + ";" + "\n" +
                "Тип экрана  - " + typeScreen;
    }
}