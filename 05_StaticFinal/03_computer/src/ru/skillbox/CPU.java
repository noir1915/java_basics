public class CPU {

    private final double frequency; // частота
    private final int coreCount;  // количество ядер
    private final int weightCPU; //вес процессора 50 грамм
    private final String manufacturer;

    public CPU(double frequency, int coreCount, int weightCPU, String manufacturer) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.weightCPU = weightCPU;
        this.manufacturer = manufacturer;
    }

    public double getFrequensy() {
        return frequency;
    }

    public CPU setFrequency(double frequency) {
        return new CPU(frequency, coreCount, weightCPU, manufacturer);
    }

    public int getCoreCount() {
        return coreCount;
    }

    public CPU setCoreCount(int coreCount) {
        return new CPU(frequency, coreCount, weightCPU, manufacturer);
    }

    public int getWeightCPU() {
        return weightCPU;
    }

    public CPU setWeightCPU(int weightCPU) {
        return new CPU(frequency, coreCount, weightCPU, manufacturer);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CPU setManufacturer(String manufacturer) {
        return new CPU(frequency, coreCount, weightCPU, manufacturer);
    }

    public String toSringCPU() {
        return "Частота - " + frequency + " ГГц" + ";" + "\n" +
                "Количество ядер - " + coreCount + ";" + "\n" +
                "Производитель - " + manufacturer;
    }
}