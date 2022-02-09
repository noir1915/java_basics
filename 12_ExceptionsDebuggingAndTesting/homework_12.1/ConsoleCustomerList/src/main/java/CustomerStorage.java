import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Передано неверное количество слов строке");
        }
        Pattern patternNumber = Pattern.compile("[+7]{2}[0-9]{10}");
        Pattern patternAddress = Pattern.compile("[A-Za-z+[0-9]].+[@]+[a-z]+[.ru]{3}");
        Matcher matcher1 = patternAddress.matcher((components[INDEX_EMAIL]));
        Matcher matcher2 = patternNumber.matcher(components[INDEX_PHONE]);
        if (!matcher1.find()) {
            throw new IllegalArgumentException("Неверный формат EMAIL");
        }
        if (!matcher2.find()) {
            throw new IllegalArgumentException("Неверный формат номера");
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}