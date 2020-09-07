package day47;

public class ClassCreditentials {
    public String name;
    public int age;


    private String userName;
    private String passWord;

    public static String companyName;
    static{
        companyName="Facebook";
    }

    public ClassCreditentials(String name, int age){
       this.name=name;
       this.age=age;
    }


    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassWord(){
        return passWord;
    }







}
