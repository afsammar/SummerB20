package replitpractises;

public class Error {
    public static void main(String[] args) {
        System.out.println(isError("error foo bar"));
    }







    public static boolean isError(String line){

        boolean result=true;

            if(line.substring(0,5).equals("error")){
            result=true;

            }else{
                result=false;
            }


    return result;
    }
}
