package replitpractises;

public class MethodsWithReturn163 {
    public static void main(String[] args) {

    }

    public int count_appearance(String[] arr, String t)
    {
        int count =0;
        for (String each:arr) {
            if(each.equals(t)){
                count++;
            }

        }
            return count;
    }
}
