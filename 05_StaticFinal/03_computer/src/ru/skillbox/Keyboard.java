public class Keyboard {

    private final TypeKeyboard typeKeyboard;   // тип клавиатуры
    private final boolean backLight;           // наличие подсветки
    private final int weightKeyboard;          // вес клавиатуры

    public Keyboard(TypeKeyboard typeKeyboard, boolean backLight, int weightKeyboard) {
        this.typeKeyboard = typeKeyboard;
        this.backLight = backLight;
        this.weightKeyboard = weightKeyboard;
    }

    public Keyboard setWeightKeyboard(int weightKeyboard) {
        return new Keyboard(typeKeyboard, backLight, weightKeyboard);
    }

    private Keyboard setBackLight(boolean backLight) {
        return new Keyboard(typeKeyboard, backLight, weightKeyboard);
    }

    public Keyboard setType(TypeKeyboard typeKeyboard) {
        return new Keyboard(typeKeyboard, backLight, weightKeyboard);
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public String isBackLight() {
        if (this.backLight) {
            return "YES";
        } else return "NO";
    }

    public int getWeightKeyboard() {
        return weightKeyboard;
    }

    public String toStringKeyboard() {
        return "Тип клавиатуры - " + typeKeyboard + ";" + "\n" +
                "Наличие подсветки - " + isBackLight();
    }
}