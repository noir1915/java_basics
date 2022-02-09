import java.util.ArrayList;

public class TodoList {
    ArrayList<String> list = new ArrayList<>();

    public void add(String todo) {
        list.add(todo);
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index < list.size()) {
            list.add(Math.min(index, list.size()), todo);
        } else {
            list.add(list.size(), todo);
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < list.size()) {
            list.set(index, todo);
        }
    }

    public void delete(int index) {
        if (index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return list;
    }
}