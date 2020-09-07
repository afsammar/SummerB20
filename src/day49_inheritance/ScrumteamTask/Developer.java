package day49_inheritance.ScrumteamTask;

public class Developer extends Employee{
    public Developer(String name,int age,char gender,double salary,int ID,String jobTitle){
        setInfo(name,age,gender,salary,ID,jobTitle);
    }
    public void coding(){
        System.out.println(name+" is develpoing code, while hitting his head");
    }
    public void fixBug(){
        System.out.println(name+" is fixing bug while cursing the Tester");
    }
}
