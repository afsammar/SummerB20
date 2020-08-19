package Day41_Static;

class TesterObject{
    public static void main(String[] args) {
        Tester[] testers = {new Tester(),new Tester(),new Tester(),new Tester(),new Tester(),};
        testers[0].setInfo("Ahmet",150000,"male",48);
        testers[1].setInfo("mehmet",120000,"male",38);
        testers[2].setInfo("ali",110000,"male",28);
        testers[3].setInfo("Ayse",100000,"Female",18);
        testers[4].setInfo("Asim",140000,"male",23);

        for (Tester each:testers) {
            System.out.println(each);

        }

    }
}



public class Tester {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary,String gender, int age ){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.age=age;
    }
public String toString(){
        return  "Name: "+name+", Gender: "+age+", Salary: "+salary;
}
}
