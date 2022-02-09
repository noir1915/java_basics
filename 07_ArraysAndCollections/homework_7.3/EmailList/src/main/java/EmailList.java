import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet<String> treeSet = new TreeSet<>();

    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public void add(String email) {
        // TODO: валидный формат email добавляется
        Pattern VALID_EMAIL_ADDRESS =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS.matcher(email);
        if (matcher.find()) {
            treeSet.add(email.toLowerCase());
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        List<String> list = new ArrayList<>(treeSet);
        // TODO: возвращается список электронных адресов в алфавитном порядке
        for (String a : treeSet) {
            System.out.println(treeSet);
        }
        return list;
    }
}