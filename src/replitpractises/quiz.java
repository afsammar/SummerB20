package replitpractises;

import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {
        char[] array={'D','C','A','B'};
        Arrays.sort(array);
        for (char each:array) {
            System.out.print(each+" ");
            if(each=='D'){
                continue;
            }

        }

    }
}
