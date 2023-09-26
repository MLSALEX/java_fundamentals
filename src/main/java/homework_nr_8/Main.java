package homework_nr_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Nr3
        ArrayList<String> toDoTodayList = new ArrayList<>();
        toDoTodayList.add("go shopping");
        toDoTodayList.add("make homework");
        toDoTodayList.add("pay bills");
        toDoTodayList.add("send e-mails");
        toDoTodayList.add("pay bills");
        toDoTodayList.add("send e-mails");

        System.out.println(toDoTodayList);

        // Nr4
        HashSet<String> uniqueValues = new HashSet<>(toDoTodayList);
        System.out.println(uniqueValues);

        // Nr5
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
        System.out.println(dictionaryEnRo);



    }
}
