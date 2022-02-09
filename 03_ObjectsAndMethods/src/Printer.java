public class Printer {
    private int documentsCount = 0;
    private String queue;
    private int pageCount = 0;
    private int totalPageCount = 0;
    public int totalDocumentsCount = 0;


    public Printer() {
        queue = "Список документов:";
        documentsCount = documentsCount + 1;
    }


    public void append(String textDocument) {
        append(textDocument, "no name", 1);
    }

    public void append(String textDocument, String name) {
        append(textDocument, name, 1);
    }

    public void append(String textDocument, String name, int pageCount) {

        queue = queue +  "\n" + textDocument + ": " + name + " - " + pageCount + " стр.";

        totalPageCount = totalPageCount + pageCount * documentsCount;

        totalDocumentsCount = totalDocumentsCount + documentsCount;

    }

    public void clear() {
        queue = "";
    }

    public int getPageCount() {
        return totalPageCount;
    }

    public int getDocumentsCount() {
        return totalDocumentsCount;
    }

    public void print() {
        System.out.println(queue);
        clear();
        if (queue.isEmpty()) {
            System.out.println("");
        }
        else {
            System.out.println(queue);
        }

    }

    public int getAllPrintedDocuments() {  //метод, возвращающий общее количество распечатанных документов и страниц за всё время
        return getPageCount() + getDocumentsCount();

    }
}
