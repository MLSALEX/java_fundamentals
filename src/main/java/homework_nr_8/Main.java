package homework_nr_8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> toDoTodayList = new ArrayList<>();
        toDoTodayList.add("go shopping");
        toDoTodayList.add("make homework");
        toDoTodayList.add("pay bills");
        toDoTodayList.add("send e-mails");
        System.out.println(toDoTodayList);

        List<String> toDoTodayList2 = new ArrayList<>(toDoTodayList);
        toDoTodayList2.add("pay bills");
        toDoTodayList2.add("send e-mails");
        toDoTodayList2.add("watch TV");
        toDoTodayList2.add("watch TV");
        System.out.println(toDoTodayList2);
        System.out.println("---------");

        //Nr3
        printToDoTodayList(toDoTodayList);
        System.out.println("------");

        // Nr4
        printUniqueValues(toDoTodayList2);
        System.out.println("---------");

        // Nr5
        printDictionaryEnRo();

    }

    public static List<String> printToDoTodayList(List<String> toDoTodayList) {
        for (String element : toDoTodayList) {
            System.out.println(element);
        }
        return toDoTodayList;
    }

    public static Set<String> printUniqueValues(List<String> toDoTodayList2) {
        HashSet<String> uniqueValues = new HashSet<>(toDoTodayList2);
        for (String element : uniqueValues) {
            System.out.println(element);
        }
        return uniqueValues;
    }

    public static HashMap<String, String> printDictionaryEnRo() {
        HashMap<String, String> dictionaryEnRo = new HashMap<>();
        dictionaryEnRo.put("head", "cap");
        dictionaryEnRo.put("building", "edificiu");
        dictionaryEnRo.put("sky", "cer");
        dictionaryEnRo.put("slow", "încet");
        dictionaryEnRo.put("sport", "sport");
        dictionaryEnRo.put("street", "stradă");
        dictionaryEnRo.put("how", "cum");
        dictionaryEnRo.put("juice", "suc");
        dictionaryEnRo.put("lake", "lac");
        dictionaryEnRo.put("milk", "lapte");
        for (String key : dictionaryEnRo.keySet()
        ) {
            System.out.println(key + ":" + dictionaryEnRo.get(key));
        }
        return dictionaryEnRo;
    }
}
