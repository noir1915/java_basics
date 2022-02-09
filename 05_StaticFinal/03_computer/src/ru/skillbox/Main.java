public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(2.4, 2, 180, "Китай");
        HDD hdd = new HDD(TypeHdd.HDD, 512, 600);  // характеристики жесткого диска
        Screen screen = new Screen(15.6, TypeScreen.VA, 500);
        RAM ram = new RAM(4, 410, TypeRam.DDR3);
        Keyboard keyboard = new Keyboard(TypeKeyboard.MEMBRANE, false, 440);  // характеристики клавиатуры
        Computer computer = new Computer("Samsung", "Сеул, Южная Корея", cpu, keyboard, ram, hdd, screen);
        System.out.println(computer);
        System.out.println("Общий вес компьютера - " + computer.getWeightComputer() + " гр." + "\n" +
                "--------------------------------------------------------");


        CPU cpu1 = new CPU(2.5, 4, 200, "Китай");
        HDD hdd1 = new HDD(TypeHdd.SSD, 512, 600);
        Screen screen1 = new Screen(17.3, TypeScreen.IPS, 650);
        RAM ram1 = new RAM(8, 250, TypeRam.DDR4);
        Keyboard keyboard1 = new Keyboard(TypeKeyboard.MEMBRANE, false, 123);
        Computer computer1 = new Computer("HP", "Пало-Альто, Калифорния, США", cpu1, keyboard1, ram1, hdd1, screen1);
        System.out.println(computer1);
        System.out.println("Общий вес компьютера - " + computer1.getWeightComputer() + " гр." + "\n" +
                "--------------------------------------------------------");

        CPU cpu2 = new CPU(2.4, 8, 105, "Китай");
        HDD hdd2 = new HDD(TypeHdd.SSD, 256, 400);
        Screen screen2 = new Screen(13.3, TypeScreen.RETINA, 250);
        RAM ram2 = new RAM(16, 180, TypeRam.DDR3);
        Keyboard keyboard2 = new Keyboard(TypeKeyboard.MECHANICAL, true, 250);
        Computer computer2 = new Computer("Apple", "Купертино, Калифорния, США", cpu2, keyboard2, ram2, hdd2, screen2);
        System.out.println(computer2);
        System.out.println("Общий вес компьютера - " + computer2.getWeightComputer() + " гр." + "\n" +
        "--------------------------------------------------------");
    }
}