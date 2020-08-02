package day24;

public class nuiquewords2 {

    public static void main(String[] args) {
        String[]words={"C#","C#", "Java","Phyton","Phyton","C++"};

        for(String each: words) {

            int count = 0;
            for (String a : words) {
                if (each.equals(a)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }


        }
    }
}
