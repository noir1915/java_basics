import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    Map<String, String> mapPhoneBook = new TreeMap<>();
    Set<String> setPhoneBook = new TreeSet<>();

    public void addContact(String phone, String name) {
        if (phone.matches("[7{1}][0-9]{10}+") && name.matches("[А-Я{1}][а-я]+")) {
            if (mapPhoneBook.containsKey(phone)) 
                mapPhoneBook.replace(phone, mapPhoneBook.get(phone), name);
             else
                mapPhoneBook.put(phone, name);
        }
    }

    public String getNameByPhone(String phone) {
        if (mapPhoneBook.containsKey(phone)) {
            return mapPhoneBook.get(phone) + " - " + phone;
        } else {
            return "";
        }
    }

    public Set<String> getPhonesByName(String name) {
        String namePlusTel = "";
        if (mapPhoneBook.containsValue(name)) {
            namePlusTel = namePlusTel.concat(name) + " - ";
            for (String tel : mapPhoneBook.keySet()) {
                if (mapPhoneBook.get(tel).equals(name)) {
                    namePlusTel = namePlusTel.concat(tel) + ", ";
                }
            }
            setPhoneBook.add(namePlusTel.substring(0, namePlusTel.length() - 2));
            return setPhoneBook;
        } else return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        for (String key : mapPhoneBook.keySet()) {
            setPhoneBook.add(mapPhoneBook.get(key) + " - " + key);
        }
        if (!setPhoneBook.isEmpty()) {
            return setPhoneBook;
        } else
            return new TreeSet<>();
    }
}
