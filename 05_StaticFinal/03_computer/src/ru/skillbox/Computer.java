public class Computer {

    private final String vendor; // производитель
    private final String name; // название
    private final CPU cpu;
    private final Keyboard keyboard;
    private final RAM ram;
    private final HDD hdd;
    private final Screen screen;

    public Computer(String name, String vendor, CPU cpu, Keyboard keyboard, RAM ram, HDD hdd, Screen screen) {
        this.name = name;
        this.vendor = vendor;
        this.cpu = cpu;
        this.keyboard = keyboard;
        this.ram = ram;
        this.hdd = hdd;
        this.screen = screen;
    }


    public Computer setCpu(CPU cpu) {
        return new Computer(name, vendor, cpu, keyboard, ram, hdd, screen);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(name, vendor, cpu, keyboard, ram, hdd, screen);
    }

    public Computer setRam(RAM ram) {
        return new Computer(name, vendor, cpu, keyboard, ram, hdd, screen);
    }

    public Computer setHdd(HDD hdd) {
        return new Computer(name, vendor, cpu, keyboard, ram, hdd, screen);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(name, vendor, cpu, keyboard, ram, hdd, screen);
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public RAM getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public int getWeightComputer() {   // про общий вес надо добавить
        return cpu.getWeightCPU() +
                keyboard.getWeightKeyboard() +
                screen.getScreenWeight() +
                hdd.getWeightHardDiskDrive() +
                ram.getWeightRandomAccessMemory();
    }

    public String toString() {
        return "Название компьютера: " + name + ";" + "\n" +
                "Производитель: " + vendor + ";" + "\n" +
                "Характеристики ОП: " + ram.toStringRam() + ";" + "\n" +
                "Характеристики процессора: " + cpu.toSringCPU() + ";" + "\n" +
                "Тип жесткого диска: " + hdd.toStringHdd() + ";" + "\n" +
                "Характеристики клавиатуры: " + keyboard.toStringKeyboard() + ";" + "\n" +
                "Характеристики экрана: " + screen.toStringScreen();
    }
}