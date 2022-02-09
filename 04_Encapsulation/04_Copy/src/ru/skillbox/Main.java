public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(5, 5, 5); // ссылаемcя на класс "Габариты"
        Infocargo infocargo = new Infocargo(123, "Москва", dimensions, true, "23sdf", false);
        System.out.println(infocargo);
    }
}