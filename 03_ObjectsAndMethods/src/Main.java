public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Задание №1" + "\n");
        Basket basket = new Basket();
        basket.add("Хлеб", 34, 1, 300);
        basket.add("Молоко", 53, 1, 930);
        basket.add("Колбаса", 140, 1, 250);
        basket.add("Масло", 100, 2, 200);
        basket.print("Корзина");
        Basket basket1 = new Basket();
        basket1.add("Сыр Гауда", 500, 1, 500);
        basket1.add("Колбаса Докторская", 600, 1, 300);
        basket1.print("Корзина 2");
        Basket basket2 = new Basket();
        basket2.add("Доширак", 30, 1, 150);
        basket2.print("Корзина 3");
        System.out.println("Количество корзин - " + Basket.getCount() + "\n" +
                "Общая стоимоть всех товаров во всех корзинах - " + Basket.getTotalPriceBasket() + "\n" +
                "Общее количество товаров во всех корзинах - " + Basket.getTotalBasketCount() + "\n" +
                "Средняя стоимость товара во всех корзинах - " + Basket.getAveragePriceCount() + "\n" +
                "Средняя стоимость корзины - " + Basket.getAveragePriceBasket());
        //=======================================================================================
        System.out.println("\n" + "Задание №2 " + "\n");
        Arithmetic arithmetic = new Arithmetic(50, 20);
        //========================================================================================
        System.out.println("\n" + "Задание №3 " + "\n");
        Printer printer = new Printer();
        printer.append("Статья про птицу");
        printer.append( "Машины", "Раскраска для детей");
        printer.append( "Текст1", "Файл404", 20);
        System.out.println("Общее количество страниц: " + printer.getPageCount());
        System.out.println( "Общее количество документов: " + printer.getDocumentsCount());
        printer.print();
        System.out.println("Общее количество распечатанных документов и страниц за всё время - " + printer.getAllPrintedDocuments());
    }
}