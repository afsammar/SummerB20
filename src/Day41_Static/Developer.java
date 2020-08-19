package Day41_Static;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name,double salary,String gender,int age){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.age=age;


    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBugs(){
        System.out.println(name+" is crying");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+age+", Salary: "+salary;

}



class DeveloperObject{
    /*public static void main(String[] args) {
        Developer[]developers ={new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Ahmet",125000,"Male",30);
        developers[1].setInfo("Mehmet",125000,"Male",30);
        developers[2].setInfo("Samet",125000,"Male",30);
        developers[3].setInfo("Elmet",125000,"Male",30);
        developers[4].setInfo("Sasan",125000,"Male",30);
        for (Developer each:developers) {
            System.out.println(each);
        }*/



    }
}