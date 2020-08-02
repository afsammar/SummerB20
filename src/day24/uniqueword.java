package day24;

public class uniqueword {
    public static void main(String[] args) {

        String[]words={"C#","C#", "Java","Phyton","Phyton","C++"};
        for(int j=0; j<=words.length; j++){

            String s = words[j];
            int count = 0;//to store the frequency of s

            for(int i =0; i<=words.length-1; i++){
                String each=words[i];
                if(s.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s);
        }
        }
    }
}
