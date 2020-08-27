package replitpractises;

import java.util.ArrayList;

public class Methods206 {
    public static void repeatAL(ArrayList<Boolean>list){
        for(int i=0;i<list.size()*2; i++){
            list.add(list.get(i));
        }

    }
}
