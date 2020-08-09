package replitpractises;

import java.util.ArrayList;
import java.util.Collections;

public class Cleannumber {
    public static String extractNum(String s) {
        String numStr = "";
        for(int i =0; i<s.length(); i++){
            char currentChar=s.charAt(i);
            if(Character.isDigit(currentChar)){
                numStr+=currentChar;
            }
        }
    return numStr;
    }
}
