public class Basket {

    public static int count = 0;
    public static int totalPrice = 0;
    private String items = "";
    private int limit;
    private double totalWeight = 0;
    public static int totalPriceBasket = 0; // общая стоимость всех товаров во всех корзинах
    public static int totalBasketCount = 0; //общее количество всех товаров в корзине

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {  //метод подсчитывающий
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {   // первый метод (добавили)
        add(name, price, 0.0);
    }

    public void add(String name, int price, double weight) {   // второй метод (добавили)
        add(name, price, 0, 0.0);

    }

    public void add(String name, int price, int count) {   // третий метод (добавили)
        add(name, 0, 0, 0.0);
    }

    public void add(String name, int price, int count, double weight) {  // четвертый метод (добавили)
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб./" + weight + " - гр.";
        totalPriceBasket = totalPriceBasket + count * price;   // общая стоимость всех товаров во всех корзинах
        totalWeight = totalWeight + count * weight;   //общий вес товаров во всех корзинах
        totalBasketCount = totalBasketCount + count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public static int getTotalPriceBasket() {    //   Общая стоимость всех корзин
        return totalPriceBasket;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public static int getTotalBasketCount() {  // общее количество всех товаров во всех корзинах
        return totalBasketCount;
    }

    public static int getAveragePriceCount() {  // средняя стоимость товара во всех корзинах
        return getTotalPriceBasket() / getTotalBasketCount();
    }

    public static int getAveragePriceBasket() {   // средняя стоимость корзины
        return getTotalPriceBasket() / getCount();
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
        System.out.println("Общий вес всей корзины: " + getTotalWeight());
    }
}