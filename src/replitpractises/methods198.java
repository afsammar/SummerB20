package replitpractises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class methods198 {
    public static ArrayList<String> combineAll(ArrayList<String> wordList1,ArrayList<String> wordList2){
        ArrayList<String>newList = new ArrayList<>();
        newList.addAll(wordList1);
        newList.addAll(wordList2);

    return newList;
    }
}
