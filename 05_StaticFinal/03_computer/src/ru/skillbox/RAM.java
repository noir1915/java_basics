public class RAM {
    private final int volumeRandomAccessMemory; //объем ОП
    private final int weightRandomAccessMemory; // вес
    private final TypeRam typeRandomAccessMemory;  // тип ОП

    public RAM(int volumeRandomAccessMemory, int weightRandomAccessMemory, TypeRam typeRandomAccessMemory) {
        this.volumeRandomAccessMemory = volumeRandomAccessMemory;
        this.weightRandomAccessMemory = weightRandomAccessMemory;
        this.typeRandomAccessMemory = typeRandomAccessMemory;
    }

    public RAM setTypeRandomAccessMemory(TypeRam typeRandomAccessMemory) {
        return new RAM(volumeRandomAccessMemory, weightRandomAccessMemory, typeRandomAccessMemory);
    }

    public RAM setWeightRandomAccessMemory(int weightRandomAccessMemory) {
        return new RAM(volumeRandomAccessMemory, weightRandomAccessMemory, typeRandomAccessMemory);
    }

    public RAM setVolumeRandomAccessMemory(int volumeRandomAccessMemory) {
        return new RAM(volumeRandomAccessMemory, weightRandomAccessMemory, typeRandomAccessMemory);
    }

    public TypeRam getTypeRandomAccessMemory() {
        return typeRandomAccessMemory;
    }

    public int getVolumeRandomAccessMemory() {
        return volumeRandomAccessMemory;
    }

    public int getWeightRandomAccessMemory() {
        return weightRandomAccessMemory;
    }

    public String toStringRam() {
        return "Объем оперативной памяти - " + volumeRandomAccessMemory + " Гб;" + "\n" +
                "Тип оперативной памяти - " + typeRandomAccessMemory;
    }
}