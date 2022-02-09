public class Main {
  public static void main(String[] args) {
    String text = "The first meeting between the men's teams in a major tournament since Euro 96 was played out in a typically raucous atmosphere despite only 22,500 fans in attendance - and both sides had big opportunities to win. " +
            "Most of the honours must go to Scotland, however, who bounced back from their opening defeat by the Czech Republic at Hampden Park with real resilience and character to fully deserve this important point. " +
            "It was The Tartan Army who were elated at the final whistle while England's players heard the sound of loud jeering from their supporters. " +
            "England, who were sluggish and disappointing, should have taken the lead early on when John Stones headed Mason Mount's corner against the woodwork. " +
            "As Scotland settled and improved, England were grateful to Jordan Pickford's superb save from Stephen O'Donnell and a goal-line clearance from Reece James to divert Lyndon Dykes' goal-bound shot after the break. " +
            "Gareth Southgate's side, with a win over Croatia in the bag, now have a chance to overtake the Czech Republic and win Group D in their final game while Scotland will chase victory against Croatia at Hampden Park.";
    System.out.println(splitTextIntoWords(text));
  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String s = "";
    StringBuilder sb = new StringBuilder();                             // объект класса StringBuilder
    String st = text.replaceAll("[,.;0-9]", "");
    String st1 = st.replaceAll(" - ", "");             //если в тексте " - ", будет замена на ""
    String string = st1.replaceAll("  ", " ");        //если в тексте два пробела подряд, будет замена на " "
    String string1 = string.replaceAll("-", " ");    //замена "-" на " "
    String str[] = string1.split(" ");                        // разделяет строки на подстроки по пробелам
    for (int i = 0; i < str.length; i++) {                         // условие, пока не закончится массив строк, будет прибавление строк к общей строке с переносом на следующую
      s += sb.append(str[i]).append(System.lineSeparator());    // добавляет текст строка+строка
    }
    s = sb.toString().trim();  // убирает пробелы в строке
    return s;
  }
}