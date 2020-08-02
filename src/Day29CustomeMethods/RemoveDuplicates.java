package Day29CustomeMethods;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removedup("ababaaaaaaaaaaaaacccccccccdddddddddeeeeeee");
    }


    public static void removedup(String str){
        String nondup ="";
        for(String each:str.split("")){
            if(!nondup.contains(each)){
                nondup+=each;
            }
        }
        System.out.println(nondup);
    }
}
