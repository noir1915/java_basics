public class HDD {
    private final TypeHdd typeHdd;            // тип жетского диска
    private final int memorySize;            // объем памяти
    private final int weightHardDiskDrive;  // вес жесткого диска

    public HDD(TypeHdd typeHdd, int memorySize, int weightHardDiskDrive) {
        this.typeHdd = typeHdd;
        this.memorySize = memorySize;
        this.weightHardDiskDrive = weightHardDiskDrive;
    }

    public HDD setMemorySize(int memorySize) {
        return new HDD(typeHdd, memorySize, weightHardDiskDrive);
    }

    public HDD setTypeHdd(TypeHdd typeHdd) {
        return new HDD(typeHdd, memorySize, weightHardDiskDrive);
    }

    public HDD setWeightHardDiskDrive(int weightHardDiskDrive) {
        return new HDD(typeHdd, memorySize, weightHardDiskDrive);
    }

    public TypeHdd getTypeHdd() {
        return typeHdd;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getWeightHardDiskDrive() {
        return weightHardDiskDrive;
    }

    public String toStringHdd() {
        return "Тип жесткого диска - " + typeHdd + ";" + "\n" +
                "Объем жесткого диска - " + memorySize;
    }
}