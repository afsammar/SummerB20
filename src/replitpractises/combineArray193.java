package replitpractises;

import java.util.ArrayList;

public class combineArray193 {
    public static String combineRs(String[] r1,String[]r2){

        ArrayList<String> items = new ArrayList<>();

        for (String each:r1){
            items.add(each);
        }
        for(String each : r2){
            items.add(each);
        }
        String result="";
        for (String each:items) {
            result+=each;
        }
            return result;
        }

}
