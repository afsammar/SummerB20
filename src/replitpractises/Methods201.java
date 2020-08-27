package replitpractises;

import java.util.ArrayList;

public class Methods201 {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer>list){
        ArrayList<Integer>newList = new ArrayList<>();
        int sum = 0;
        for(Integer each:list){
            if(each>0){
                newList.add(each);
                sum+=each;
            }
        }
        newList.add(newList.size(),sum);
        return newList;
    }
}
